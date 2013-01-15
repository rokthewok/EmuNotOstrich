package gameBoy.cpu.opcodes.load.loadRegToReg;

import gameBoy.cpu.Register;
import gameBoy.interfaces.IProcessor;

public class LoadAToL8 extends LoadReg8ToReg8 {

	public LoadAToL8(IProcessor processor) {
		super(processor, Register.L, Register.A);
	}

}
