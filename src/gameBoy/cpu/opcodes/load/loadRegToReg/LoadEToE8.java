package gameBoy.cpu.opcodes.load.loadRegToReg;

import gameBoy.cpu.Register;
import gameBoy.interfaces.IProcessor;

public class LoadEToE8 extends LoadRegToReg8 {

	public LoadEToE8(IProcessor processor) {
		super(processor, Register.E, Register.E);
	}

}
