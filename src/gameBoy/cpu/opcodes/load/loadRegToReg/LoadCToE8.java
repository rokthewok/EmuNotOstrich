package gameBoy.cpu.opcodes.load.loadRegToReg;

import gameBoy.cpu.Register;
import gameBoy.interfaces.IProcessor;

public class LoadCToE8 extends LoadReg8ToReg8 {

	public LoadCToE8(IProcessor processor) {
		super(processor, Register.E, Register.C);
	}

}
