package gameBoy.cpu.opcodes.load.loadRegToReg;

import gameBoy.cpu.Register;
import gameBoy.interfaces.IProcessor;

public class LoadBToA8 extends LoadReg8ToReg8 {

	public LoadBToA8(IProcessor processor) {
		super(processor, Register.A, Register.B);
	}

}
