package gameBoy.cpu.opcodes.add;

import gameBoy.cpu.Flag;
import gameBoy.cpu.Register;
import gameBoy.cpu.opcodes.TwoByteOpcode;
import gameBoy.interfaces.IProcessor;

public class AddImmToSp extends TwoByteOpcode {
	private static int cycles = 16;
	private IProcessor processor;
	
	public AddImmToSp( IProcessor processor ) {
		this.processor = processor;
	}
	
	@Override
	public void execute() {
		int sp = this.processor.getRegisters().getRegister( Register.SP );
		int immediate = this.processor.getMemory().get8BitValue( this.processor.getRegisters().getRegister( Register.PC ) + 1 );
		
		this.processor.getRegisters().setFlagTo( Flag.Z, false );
		this.processor.getRegisters().setFlagTo( Flag.N, false );
		
		int result = sp + immediate;
		
		if( ( result & 0xF0 ) != 0 ) {
			this.processor.getRegisters().setFlagTo( Flag.H, true );
		} else {
			this.processor.getRegisters().setFlagTo( Flag.H, false );
		}
		
		if( ( result & 0xF00) != 0 ) {
			this.processor.getRegisters().setFlagTo( Flag.C, true );
		} else {
			this.processor.getRegisters().setFlagTo( Flag.C, false );
		}
		
		this.processor.getRegisters().setRegister( Register.SP, (short) result );
	}

	@Override
	public int getCycles() {
		return cycles;
	}
}
