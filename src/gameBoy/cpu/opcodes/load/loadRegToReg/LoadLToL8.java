package gameBoy.cpu.opcodes.load.loadRegToReg;

import gameBoy.cpu.Register;
import gameBoy.interfaces.IProcessor;

public class LoadLToL8 extends LoadRegToReg8 {

	public LoadLToL8(IProcessor processor) {
		super(processor, Register.L, Register.L);
	}

}
