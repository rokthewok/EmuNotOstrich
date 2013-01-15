package gameBoy.cpu.opcodes.load.loadRegToReg;

import gameBoy.cpu.Register;
import gameBoy.interfaces.IProcessor;

public class LoadDToD8 extends LoadReg8ToReg8 {

	public LoadDToD8(IProcessor processor) {
		super(processor, Register.D, Register.D);
	}

}
