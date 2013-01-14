package gameBoy.cpu.opcodes.load.loadRegToReg;

import gameBoy.cpu.Register;
import gameBoy.interfaces.IProcessor;

public class LoadBToA8 extends LoadRegToReg8 {

	public LoadBToA8(IProcessor processor) {
		super(processor, Register.A, Register.B);
	}

}
