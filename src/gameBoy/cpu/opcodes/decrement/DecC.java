package gameBoy.cpu.opcodes.decrement;

import gameBoy.cpu.Register;
import gameBoy.interfaces.IProcessor;

public class DecC extends Decrement8 {

	public DecC(IProcessor processor) {
		super(processor, Register.C);
	}

}
