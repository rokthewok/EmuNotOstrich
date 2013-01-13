package gameBoy.cpu.opcodes.decrement;

import gameBoy.cpu.Register;
import gameBoy.interfaces.IProcessor;

public class DecE extends Decrement8 {

	public DecE(IProcessor processor) {
		super(processor, Register.E);
	}

}
