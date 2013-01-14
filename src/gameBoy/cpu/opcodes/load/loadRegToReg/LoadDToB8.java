package gameBoy.cpu.opcodes.load.loadRegToReg;

import gameBoy.cpu.Register;
import gameBoy.interfaces.IProcessor;

public class LoadDToB8 extends LoadRegToReg8 {

	public LoadDToB8(IProcessor processor) {
		super(processor, Register.B, Register.D);
	}

}
