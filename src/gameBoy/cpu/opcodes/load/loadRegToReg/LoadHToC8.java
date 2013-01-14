package gameBoy.cpu.opcodes.load.loadRegToReg;

import gameBoy.cpu.Register;
import gameBoy.interfaces.IProcessor;

public class LoadHToC8 extends LoadRegToReg8 {

	public LoadHToC8(IProcessor processor) {
		super(processor, Register.C, Register.H);
	}

}
