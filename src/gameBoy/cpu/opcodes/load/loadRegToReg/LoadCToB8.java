package gameBoy.cpu.opcodes.load.loadRegToReg;

import gameBoy.cpu.Register;
import gameBoy.interfaces.IProcessor;

public class LoadCToB8 extends LoadRegToReg8 {

	public LoadCToB8(IProcessor processor) {
		super(processor, Register.B, Register.C);
	}

}
