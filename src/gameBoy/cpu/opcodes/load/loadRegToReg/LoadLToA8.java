package gameBoy.cpu.opcodes.load.loadRegToReg;

import gameBoy.cpu.Register;
import gameBoy.interfaces.IProcessor;

public class LoadLToA8 extends LoadReg8ToReg8 {

	public LoadLToA8(IProcessor processor) {
		super(processor, Register.A, Register.L);
	}

}
