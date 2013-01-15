package gameBoy.cpu.opcodes.load.loadRegToReg;

import gameBoy.cpu.Register;
import gameBoy.interfaces.IProcessor;

public class LoadAToD8 extends LoadReg8ToReg8 {

	public LoadAToD8(IProcessor processor) {
		super(processor, Register.D, Register.A);
	}

}
