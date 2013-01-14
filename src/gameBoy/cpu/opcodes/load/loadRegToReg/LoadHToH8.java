package gameBoy.cpu.opcodes.load.loadRegToReg;

import gameBoy.cpu.Register;
import gameBoy.interfaces.IProcessor;

public class LoadHToH8 extends LoadRegToReg8 {

	public LoadHToH8(IProcessor processor) {
		super(processor, Register.H, Register.H);
	}

}
