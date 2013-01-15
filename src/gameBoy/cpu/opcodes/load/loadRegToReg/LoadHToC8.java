package gameBoy.cpu.opcodes.load.loadRegToReg;

import gameBoy.cpu.Register;
import gameBoy.interfaces.IProcessor;

public class LoadHToC8 extends LoadReg8ToReg8 {

	public LoadHToC8(IProcessor processor) {
		super(processor, Register.C, Register.H);
	}

}
