package gameBoy.cpu.opcodes.xor;

import gameBoy.cpu.Flag;
import gameBoy.cpu.Register;
import gameBoy.cpu.opcodes.TwoByteOpcode;
import gameBoy.interfaces.IProcessor;

public class XorImmToA extends TwoByteOpcode {
	private static int cycles = 8;
	private IProcessor processor;
	
	public XorImmToA( IProcessor processor ) {
		this.processor = processor;
	}
	
	@Override
	public void execute() {
		int A = this.processor.getRegisters().getRegister( Register.A );
		int immediate = this.processor.getMemory().get8BitValue( 
				this.processor.getRegisters().getRegister( Register.PC ) + 1 );
		
		int result = A ^ immediate;
		
		this.doFlagCheck( result );
		
		this.processor.getRegisters().setRegister( Register.A, result );
	}
	
	private void doFlagCheck( int result ) {
		if( result == 0 ) {
			this.processor.getRegisters().setFlagTo( Flag.Z, true );
		} else {
			this.processor.getRegisters().setFlagTo( Flag.Z, false );
		}
		
		this.processor.getRegisters().setFlagTo( Flag.N, false );
		this.processor.getRegisters().setFlagTo( Flag.H, false );
		this.processor.getRegisters().setFlagTo( Flag.C, false );
	}

	@Override
	public int getCycles() {
		return cycles;
	}
}
