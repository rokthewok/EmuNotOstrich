package gameBoy.cpu.opcodes.load.loadRegToReg;

import gameBoy.cpu.Register;
import gameBoy.interfaces.IProcessor;

public class LoadDToA8 extends LoadRegToReg8 {

	public LoadDToA8(IProcessor processor) {
		super(processor, Register.A, Register.D);
	}

}
