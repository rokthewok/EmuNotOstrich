package gameBoy.cpu.opcodes.load.loadRegToReg;

import gameBoy.cpu.Register;
import gameBoy.interfaces.IProcessor;

public class LoadBToC8 extends LoadReg8ToReg8 {

	public LoadBToC8(IProcessor processor) {
		super(processor, Register.C, Register.B);
	}

}
