package gameBoy.cpu.opcodes.load.loadRegToReg;

import gameBoy.cpu.Register;
import gameBoy.interfaces.IProcessor;

public class LoadBToD8 extends LoadReg8ToReg8 {

	public LoadBToD8(IProcessor processor) {
		super(processor, Register.D, Register.B);
	}

}
