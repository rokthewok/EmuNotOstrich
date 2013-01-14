package gameBoy.cpu.opcodes.load.loadRegToReg;

import gameBoy.cpu.Register;
import gameBoy.interfaces.IProcessor;

public class LoadEToL8 extends LoadRegToReg8 {

	public LoadEToL8(IProcessor processor) {
		super(processor, Register.L, Register.E);
	}

}
