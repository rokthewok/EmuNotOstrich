package gameBoy.cpu.opcodes.load.loadRegToReg;

import gameBoy.cpu.Register;
import gameBoy.interfaces.IProcessor;

public class LoadLToB8 extends LoadReg8ToReg8 {

	public LoadLToB8(IProcessor processor) {
		super(processor, Register.B, Register.L);
	}

}
