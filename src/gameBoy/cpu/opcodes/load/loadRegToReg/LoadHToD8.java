package gameBoy.cpu.opcodes.load.loadRegToReg;

import gameBoy.cpu.Register;
import gameBoy.interfaces.IProcessor;

public class LoadHToD8 extends LoadReg8ToReg8 {

	public LoadHToD8(IProcessor processor) {
		super(processor, Register.D, Register.H);
	}

}
