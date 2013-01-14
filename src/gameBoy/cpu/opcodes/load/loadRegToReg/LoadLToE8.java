package gameBoy.cpu.opcodes.load.loadRegToReg;

import gameBoy.cpu.Register;
import gameBoy.interfaces.IProcessor;

public class LoadLToE8 extends LoadRegToReg8 {

	public LoadLToE8(IProcessor processor) {
		super(processor, Register.E, Register.L);
	}

}
