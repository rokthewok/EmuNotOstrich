package gameBoy.cpu.opcodes.add;

import gameBoy.cpu.Register;
import gameBoy.interfaces.IProcessor;

public class AddAAddrHl extends Addition8 {
	private static int cycles = 8;
	private IProcessor processor;
	
	public AddAAddrHl( IProcessor processor ) {
		super( processor, Register.HL );
		this.processor = processor;
	}
	
	@Override
	public void execute() {
		int address = this.processor.getRegisters().getRegister( Register.HL );
		int n = this.processor.getMemory().get8BitValue( address );
		int A = this.processor.getRegisters().getRegister( Register.A );
		
		byte result = this.doFlagCheck( n, A );
		
		this.processor.getRegisters().setRegister( Register.A, result );
	}

	@Override
	public int getCycles() {
		return cycles;
	}
}
