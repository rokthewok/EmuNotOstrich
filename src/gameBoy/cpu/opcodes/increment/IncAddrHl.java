package gameBoy.cpu.opcodes.increment;

import gameBoy.cpu.Flag;
import gameBoy.cpu.Register;
import gameBoy.interfaces.IOpcode;
import gameBoy.interfaces.IProcessor;

public class IncAddrHl implements IOpcode {
	private static byte opcodeLength = 1;
	private static int cycles = 12;
	private IProcessor processor;
	
	public IncAddrHl( IProcessor processor ) {
		this.processor = processor;
	}
	
	@Override
	public void execute() {
		short address = this.processor.getRegisters().getRegister( Register.HL );
		byte result = (byte) ( this.processor.getMemory().get8BitValue( address ) + 1 );
		
//		this.processor.getRegisters().clearFlags();
		
		this.processor.getRegisters().setFlagTo( Flag.N, false );
		
		if( result == 0 ) {
			this.processor.getRegisters().setFlagTo( Flag.C, true ); // zero indicates an overflow
			this.processor.getRegisters().setFlagTo( Flag.Z, true );
		}
		
		if( ( result & 0x0F ) == 0 ) {
			this.processor.getRegisters().setFlagTo( Flag.H, true );
		}
		
		this.processor.getMemory().set8BitValue( address, result );
	}

	@Override
	public int getCycles() {
		return cycles;
	}

	@Override
	public byte getOpcodeLength() {
		return opcodeLength;
	}
}
