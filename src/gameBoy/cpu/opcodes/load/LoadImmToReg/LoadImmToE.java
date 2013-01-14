package gameBoy.cpu.opcodes.load;

import gameBoy.cpu.Register;
import gameBoy.interfaces.IProcessor;

public class LoadImmToE extends LoadImmToReg8 {

	public LoadImmToE(IProcessor processor, byte immediate) {
		super(processor, Register.E, immediate);
	}

}
