package gameBoy.cpu.opcodes.load.loadImmToReg;

import gameBoy.cpu.Register;
import gameBoy.interfaces.IProcessor;

public class LoadImmToC extends LoadImmToReg8 {

	public LoadImmToC(IProcessor processor, byte immediate) {
		super(processor, Register.C, immediate);
	}

}
