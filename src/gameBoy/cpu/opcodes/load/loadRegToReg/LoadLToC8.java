package gameBoy.cpu.opcodes.load.loadRegToReg;

import gameBoy.cpu.Register;
import gameBoy.interfaces.IProcessor;

public class LoadLToC8 extends LoadReg8ToReg8 {

	public LoadLToC8(IProcessor processor) {
		super(processor, Register.C, Register.L);
	}

}
