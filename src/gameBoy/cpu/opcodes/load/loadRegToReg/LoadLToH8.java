package gameBoy.cpu.opcodes.load.loadRegToReg;

import gameBoy.cpu.Register;
import gameBoy.interfaces.IProcessor;

public class LoadLToH8 extends LoadReg8ToReg8 {

	public LoadLToH8(IProcessor processor) {
		super(processor, Register.H, Register.L);
	}

}
