package gameBoy.cpu.opcodes.increment;

import gameBoy.cpu.Register;
import gameBoy.interfaces.IOpcode;
import gameBoy.interfaces.IProcessor;

public class IncDe implements IOpcode {
	private static int cycles = 8;
	private IProcessor processor;
	
	public IncDe( IProcessor processor ) {
		this.processor = processor;
	}
	
	@Override
	public void execute() {
		// Increment 16 bit register DE
		this.processor.getRegisters().setRegister( Register.DE, 
				(short) ( this.processor.getRegisters().getRegister( Register.DE ) + 1) );
	}

	@Override
	public int getCycles() {
		return cycles;
	}

}
