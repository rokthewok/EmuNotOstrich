package gameBoy.cpu.opcodes.load.loadRegToReg;

import gameBoy.cpu.Register;
import gameBoy.interfaces.IProcessor;

public class LoadDToE8 extends LoadReg8ToReg8 {

	public LoadDToE8(IProcessor processor) {
		super(processor, Register.E, Register.D);
	}

}
