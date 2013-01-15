package gameBoy.cpu.opcodes.load.loadRegToReg;

import gameBoy.cpu.Register;
import gameBoy.interfaces.IProcessor;

public class LoadAToH8 extends LoadReg8ToReg8 {

	public LoadAToH8(IProcessor processor) {
		super(processor, Register.H, Register.A);
	}

}
