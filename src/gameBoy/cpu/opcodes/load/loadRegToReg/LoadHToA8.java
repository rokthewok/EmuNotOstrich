package gameBoy.cpu.opcodes.load.loadRegToReg;

import gameBoy.cpu.Register;
import gameBoy.interfaces.IProcessor;

public class LoadHToA8 extends LoadRegToReg8 {

	public LoadHToA8(IProcessor processor) {
		super(processor, Register.A, Register.H);
	}

}
