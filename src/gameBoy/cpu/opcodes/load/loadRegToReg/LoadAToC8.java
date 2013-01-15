package gameBoy.cpu.opcodes.load.loadRegToReg;

import gameBoy.cpu.Register;
import gameBoy.interfaces.IProcessor;

public class LoadAToC8 extends LoadReg8ToReg8 {

	public LoadAToC8(IProcessor processor) {
		super(processor, Register.C, Register.A);
	}

}
