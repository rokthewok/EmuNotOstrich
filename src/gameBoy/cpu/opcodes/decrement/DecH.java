package gameBoy.cpu.opcodes.decrement;

import gameBoy.cpu.Register;
import gameBoy.interfaces.IProcessor;

public class DecH extends Decrement8 {

	public DecH(IProcessor processor) {
		super(processor, Register.H);
	}

}
