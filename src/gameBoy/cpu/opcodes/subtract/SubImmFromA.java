package gameBoy.cpu.opcodes.subtract;

import gameBoy.cpu.Flag;
import gameBoy.cpu.Register;
import gameBoy.cpu.opcodes.TwoByteOpcode;
import gameBoy.interfaces.IProcessor;

public class SubImmFromA extends TwoByteOpcode {
	private static int cycles = 8;
	private IProcessor processor;
	
	public SubImmFromA( IProcessor processor ) {
		this.processor = processor;
	}
	
	@Override
	public void execute() {
		int A = this.processor.getRegisters().getRegister( Register.A );
		int immediate = this.processor.getMemory().get8BitValue( 
				this.processor.getRegisters().getRegister( Register.PC ) + 1 );
		
		int result = A - immediate;
		
		doFlagCheck( A, immediate, result );
		
		this.processor.getRegisters().setRegister( Register.A, result );
	}
	
	protected void doFlagCheck( int A, int n, int result ) {
		this.processor.getRegisters().setFlagTo( Flag.N, true );
		
		if( result == 0 ) {
			this.processor.getRegisters().setFlagTo( Flag.Z, true );
		} else {
			this.processor.getRegisters().setFlagTo( Flag.Z, false );
		}
		
		int carry = A ^ n ^ result;		// XOR can be used to detect overflow. See wikipedia; 2's complement.
		
		if( ( carry & 0x100 ) != 0 ) {
			this.processor.getRegisters().setFlagTo( Flag.C, true );
		} else {
			this.processor.getRegisters().setFlagTo( Flag.C, false );
		}
		
		if( ( carry & 0x10) != 0 ) {
			this.processor.getRegisters().setFlagTo( Flag.H, true );
		} else {
			this.processor.getRegisters().setFlagTo( Flag.H, false );
		}
	}

	@Override
	public int getCycles() {
		return cycles;
	}
}
