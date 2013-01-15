package gameBoy.cpu.opcodes.load.loadRegToReg;

import gameBoy.cpu.Register;
import gameBoy.interfaces.IProcessor;

public class LoadBToB8 extends LoadReg8ToReg8 {

	public LoadBToB8(IProcessor processor) {
		super(processor, Register.B, Register.B);
	}

}
