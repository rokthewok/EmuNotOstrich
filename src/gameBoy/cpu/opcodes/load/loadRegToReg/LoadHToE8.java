package gameBoy.cpu.opcodes.load.loadRegToReg;

import gameBoy.cpu.Register;
import gameBoy.interfaces.IProcessor;

public class LoadHToE8 extends LoadReg8ToReg8 {

	public LoadHToE8(IProcessor processor) {
		super(processor, Register.E, Register.H);
	}

}
