package gameBoy.cpu.opcodes.load.loadRegToReg;

import gameBoy.cpu.Register;
import gameBoy.interfaces.IProcessor;

public class LoadBToL8 extends LoadReg8ToReg8 {

	public LoadBToL8(IProcessor processor) {
		super(processor, Register.L, Register.B);
	}

}
