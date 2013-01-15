package gameBoy.cpu.opcodes.load.loadRegToReg;

import gameBoy.cpu.Register;
import gameBoy.interfaces.IProcessor;

public class LoadEToH8 extends LoadReg8ToReg8 {

	public LoadEToH8(IProcessor processor) {
		super(processor, Register.H, Register.E);
	}

}
