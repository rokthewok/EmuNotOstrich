package gameBoy.cpu.opcodes.load.loadRegToReg;

import gameBoy.cpu.Register;
import gameBoy.interfaces.IProcessor;

public class LoadEToD8 extends LoadReg8ToReg8 {

	public LoadEToD8(IProcessor processor) {
		super(processor, Register.D, Register.E);
	}

}
