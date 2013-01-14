package gameBoy.cpu.opcodes.load.loadRegToReg;

import gameBoy.cpu.Register;
import gameBoy.interfaces.IProcessor;

public class LoadCToH8 extends LoadRegToReg8 {

	public LoadCToH8(IProcessor processor) {
		super(processor, Register.H, Register.C);
	}

}
