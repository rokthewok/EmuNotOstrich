package gameBoy.cpu.opcodes.increment;

import gameBoy.cpu.Register;
import gameBoy.interfaces.IOpcode;
import gameBoy.interfaces.IProcessor;

public class IncD implements IOpcode {
	private static int cycles = 4;
	private IProcessor processor;
	
	public IncD( IProcessor processor ) {
		this.processor = processor;
	}
	
	@Override
	public void execute() {
		// Increment the 8-bit register D
		this.processor.getRegisters().setRegister( Register.D,
				(byte) ( this.processor.getRegisters().getRegister( Register.D ) + 1 ) );
	}

	@Override
	public int getCycles() {
		// TODO Auto-generated method stub
		return cycles;
	}

}
