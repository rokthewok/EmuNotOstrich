package gameBoy.cpu.opcodes.load.loadRegToReg;

import gameBoy.cpu.Register;
import gameBoy.interfaces.IProcessor;

public class LoadDToC8 extends LoadRegToReg8 {

	public LoadDToC8(IProcessor processor) {
		super(processor, Register.C, Register.D);
	}

}
