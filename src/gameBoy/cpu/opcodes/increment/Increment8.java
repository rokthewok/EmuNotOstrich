package gameBoy.cpu.opcodes.increment;

import gameBoy.cpu.Flag;
import gameBoy.cpu.Register;
import gameBoy.cpu.opcodes.OneByteOpcode;
import gameBoy.interfaces.IProcessor;

public abstract class Increment8 extends OneByteOpcode {
	private static int cycles = 4;
	private final Register register;
	private IProcessor processor;
	
	protected Increment8( IProcessor processor, Register register ) {
		this.processor = processor;
		this.register = register;
	}
	
	@Override
	public void execute() {
		byte result = (byte) ( this.processor.getRegisters().getRegister( this.register ) + 1 );
		
//		this.processor.getRegisters().clearFlags();
		
		this.processor.getRegisters().setFlagTo( Flag.N, false );
		
		if( result == 0 ) {
			this.processor.getRegisters().setFlagTo( Flag.C, true ); // zero indicates an overflow
			this.processor.getRegisters().setFlagTo( Flag.Z, true );
		}
		
		if( ( result & 0x0F ) == 0 ) {
			this.processor.getRegisters().setFlagTo( Flag.H, true );
		}
		
		this.processor.getRegisters().setRegister( this.register, result );
	}

	@Override
	public int getCycles() {
		return cycles;
	}
}
