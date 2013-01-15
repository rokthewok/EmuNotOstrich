package gameBoy.cpu.opcodes.load.loadRegToReg;

import gameBoy.cpu.Register;
import gameBoy.interfaces.IProcessor;

public class LoadEToL8 extends LoadReg8ToReg8 {

	public LoadEToL8(IProcessor processor) {
		super(processor, Register.L, Register.E);
	}

}
