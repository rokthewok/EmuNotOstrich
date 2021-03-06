package gameBoy.cpu.opcodes.load.loadRegToReg;

import gameBoy.cpu.Register;
import gameBoy.interfaces.IProcessor;

public class LoadLToD8 extends LoadReg8ToReg8 {

	public LoadLToD8(IProcessor processor) {
		super(processor, Register.D, Register.L);
	}

}
