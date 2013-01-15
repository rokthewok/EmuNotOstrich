package gameBoy.cpu.opcodes.load.loadRegToReg;

import gameBoy.cpu.Register;
import gameBoy.interfaces.IProcessor;

public class LoadEToC8 extends LoadReg8ToReg8 {

	public LoadEToC8(IProcessor processor) {
		super(processor, Register.C, Register.E);
	}

}
