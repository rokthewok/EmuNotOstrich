package gameBoy.cpu.opcodes.load.loadRegToReg;

import gameBoy.cpu.Register;
import gameBoy.interfaces.IProcessor;

public class LoadAToE8 extends LoadReg8ToReg8 {

	public LoadAToE8(IProcessor processor) {
		super(processor, Register.E, Register.A);
	}

}
