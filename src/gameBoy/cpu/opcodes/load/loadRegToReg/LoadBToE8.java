package gameBoy.cpu.opcodes.load.loadRegToReg;

import gameBoy.cpu.Register;
import gameBoy.interfaces.IProcessor;

public class LoadBToE8 extends LoadRegToReg8 {

	public LoadBToE8(IProcessor processor) {
		super(processor, Register.E, Register.B);
	}

}
