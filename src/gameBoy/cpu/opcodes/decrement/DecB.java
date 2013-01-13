package gameBoy.cpu.opcodes.decrement;

import gameBoy.cpu.Register;
import gameBoy.interfaces.IProcessor;

public class DecB extends Decrement8 {

	public DecB(IProcessor processor) {
		super(processor, Register.B);
	}

}
