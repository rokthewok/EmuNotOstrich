package gameBoy.cpu.opcodes.load.loadRegToReg;

import gameBoy.cpu.Register;
import gameBoy.interfaces.IProcessor;

public class LoadEToA8 extends LoadReg8ToReg8 {

	public LoadEToA8(IProcessor processor) {
		super(processor, Register.A, Register.E);
	}

}
