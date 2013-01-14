package gameBoy.cpu.opcodes.load.loadRegToReg;

import gameBoy.cpu.Register;
import gameBoy.interfaces.IProcessor;

public class LoadDToL8 extends LoadRegToReg8 {

	public LoadDToL8(IProcessor processor) {
		super(processor, Register.L, Register.D);
	}

}
