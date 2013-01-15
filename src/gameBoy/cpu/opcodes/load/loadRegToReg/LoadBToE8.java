package gameBoy.cpu.opcodes.load.loadRegToReg;

import gameBoy.cpu.Register;
import gameBoy.interfaces.IProcessor;

public class LoadBToE8 extends LoadReg8ToReg8 {

	public LoadBToE8(IProcessor processor) {
		super(processor, Register.E, Register.B);
	}

}
