package gameBoy.cpu.opcodes.load.loadRegToReg;

import gameBoy.cpu.Register;
import gameBoy.interfaces.IProcessor;

public class LoadCToD8 extends LoadReg8ToReg8 {

	public LoadCToD8(IProcessor processor) {
		super(processor, Register.D, Register.C);
	}

}
