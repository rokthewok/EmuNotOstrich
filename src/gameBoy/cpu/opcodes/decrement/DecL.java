package gameBoy.cpu.opcodes.decrement;

import gameBoy.cpu.Register;
import gameBoy.interfaces.IProcessor;

public class DecL extends Decrement8 {

	public DecL(IProcessor processor) {
		super(processor, Register.L);
	}

}
