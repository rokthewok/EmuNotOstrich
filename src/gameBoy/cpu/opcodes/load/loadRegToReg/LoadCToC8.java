package gameBoy.cpu.opcodes.load.loadRegToReg;

import gameBoy.cpu.Register;
import gameBoy.interfaces.IProcessor;

public class LoadCToC8 extends LoadReg8ToReg8 {

	public LoadCToC8(IProcessor processor) {
		super(processor, Register.C, Register.C);
	}

}
