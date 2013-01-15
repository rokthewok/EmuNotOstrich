package gameBoy.cpu.opcodes.subtract;

import gameBoy.cpu.Flag;
import gameBoy.cpu.Register;
import gameBoy.cpu.opcodes.OneByteOpcode;
import gameBoy.interfaces.IProcessor;

public abstract class Sub extends OneByteOpcode {
	private static int cycles = 4;
	private IProcessor processor;
	private Register register;
	
	protected Sub( IProcessor processor, Register register ) {
		this.processor = processor;
		this.register = register;
	}
	
	@Override
	public void execute() {
		int A = this.processor.getRegisters().getRegister( Register.A );
		int n = this.processor.getRegisters().getRegister( register );
		
		int result = A - n;
		
		doFlagCheck( A, n, result );
		
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
