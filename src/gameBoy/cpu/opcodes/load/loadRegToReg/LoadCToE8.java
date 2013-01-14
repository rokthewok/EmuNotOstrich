package gameBoy.cpu.opcodes.load.loadRegToReg;

import gameBoy.cpu.Register;
import gameBoy.interfaces.IProcessor;

public class LoadCToE8 extends LoadRegToReg8 {

	public LoadCToE8(IProcessor processor) {
		super(processor, Register.E, Register.C);
	}

}
