package gameBoy.cpu.opcodes.load.loadRegToReg;

import gameBoy.cpu.Register;
import gameBoy.interfaces.IProcessor;

public class LoadHToL8 extends LoadReg8ToReg8 {

	public LoadHToL8(IProcessor processor) {
		super(processor, Register.L, Register.H);
	}

}
