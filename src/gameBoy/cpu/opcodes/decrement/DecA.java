package gameBoy.cpu.opcodes.decrement;

import gameBoy.cpu.Register;
import gameBoy.interfaces.IProcessor;

public class DecA extends Decrement8 {

	public DecA(IProcessor processor) {
		super(processor, Register.A);
	}

}
