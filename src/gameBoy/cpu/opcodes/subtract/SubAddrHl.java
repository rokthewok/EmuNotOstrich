package gameBoy.cpu.opcodes.subtract;

import gameBoy.cpu.Register;
import gameBoy.interfaces.IProcessor;

public class SubAddrHl extends Sub {
	private static int cycles = 8;
	private IProcessor processor;
	
	public SubAddrHl( IProcessor processor ) {
		super( processor, Register.HL );
		this.processor = processor;
	}
	
	@Override
	public void execute() {
		int address = this.processor.getRegisters().getRegister( Register.HL );
		int n = this.processor.getMemory().get8BitValue( address );
		int A = this.processor.getRegisters().getRegister( Register.A );
		
		int result = A - n;
		
		this.doFlagCheck( A, n, result );
		
		this.processor.getRegisters().setRegister( Register.A, result );
	}
	
	@Override
	public int getCycles() {
		return cycles;
	}
}
