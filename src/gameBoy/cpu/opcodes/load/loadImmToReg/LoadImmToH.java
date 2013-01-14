package gameBoy.cpu.opcodes.load.loadImmToReg;

import gameBoy.cpu.Register;
import gameBoy.interfaces.IProcessor;

public class LoadImmToH extends LoadImmToReg8 {

	public LoadImmToH(IProcessor processor, byte immediate) {
		super(processor, Register.H, immediate);
	}

}
