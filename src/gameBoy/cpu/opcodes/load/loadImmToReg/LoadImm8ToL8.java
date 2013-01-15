package gameBoy.cpu.opcodes.load.loadImmToReg;

import gameBoy.cpu.Register;
import gameBoy.interfaces.IProcessor;

public class LoadImm8ToL8 extends LoadImm8ToReg8 {

	public LoadImm8ToL8(IProcessor processor) {
		super(processor, Register.L);
	}

}
