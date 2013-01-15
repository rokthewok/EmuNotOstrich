package gameBoy.cpu.opcodes.load.loadRegToReg;

import gameBoy.cpu.Register;
import gameBoy.interfaces.IProcessor;

public class LoadCToL8 extends LoadReg8ToReg8 {

	public LoadCToL8(IProcessor processor) {
		super(processor, Register.L, Register.C);
	}

}
