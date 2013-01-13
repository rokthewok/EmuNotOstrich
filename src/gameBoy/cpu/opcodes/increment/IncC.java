package gameBoy.cpu.opcodes.increment;

import gameBoy.cpu.Register;
import gameBoy.interfaces.IOpcode;
import gameBoy.interfaces.IProcessor;

public class IncC implements IOpcode {
	public IProcessor processor;
	
	public IncC( IProcessor processor ) {
		this.processor = processor;
	}
	
	@Override
	public void execute() {
		// Increment the 8-bit register C
		this.processor.getRegisters().setRegister( Register.C,
				(byte) ( this.processor.getRegisters().getRegister( Register.C ) + 1 ) );
	}

	@Override
	public int getCycles() {
		// TODO Auto-generated method stub
		return 0;
	}

}
