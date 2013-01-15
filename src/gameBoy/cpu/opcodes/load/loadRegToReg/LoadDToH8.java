package gameBoy.cpu.opcodes.load.loadRegToReg;

import gameBoy.cpu.Register;
import gameBoy.interfaces.IProcessor;

public class LoadDToH8 extends LoadReg8ToReg8 {

	public LoadDToH8(IProcessor processor) {
		super(processor, Register.H, Register.D);
	}

}
