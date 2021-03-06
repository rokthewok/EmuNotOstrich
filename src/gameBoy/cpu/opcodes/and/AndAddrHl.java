package gameBoy.cpu.opcodes.and;

import gameBoy.cpu.Register;
import gameBoy.interfaces.IProcessor;

public class AndAddrHl extends And {
	private static int cycles = 8;
	private IProcessor processor;
	
	public AndAddrHl( IProcessor processor ) {
		super( processor, Register.HL );
		this.processor = processor;
	}
	
	@Override
	public void execute() {
		int A = this.processor.getRegisters().getRegister( Register.A );
		int address = this.processor.getRegisters().getRegister( Register.HL );
		int n = this.processor.getMemory().get8BitValue( address );
		
		int result = A & n;
		this.doFlagCheck( result );
		
		this.processor.getRegisters().setRegister( Register.A, result );
	}
	
	@Override
	public int getCycles() {
		return cycles;
	}
}
