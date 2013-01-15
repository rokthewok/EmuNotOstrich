package gameBoy.cpu.opcodes.load.loadRegToReg;

import gameBoy.cpu.Register;
import gameBoy.interfaces.IProcessor;

public class LoadAToB8 extends LoadReg8ToReg8 {

	public LoadAToB8(IProcessor processor) {
		super(processor, Register.B, Register.A);
	}

}
