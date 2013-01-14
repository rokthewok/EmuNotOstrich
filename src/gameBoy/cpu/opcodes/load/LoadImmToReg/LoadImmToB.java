package gameBoy.cpu.opcodes.load.LoadImmToReg;

import gameBoy.cpu.Register;
import gameBoy.interfaces.IProcessor;

public class LoadImmToB extends LoadImmToReg8 {

	public LoadImmToB(IProcessor processor, byte immediate) {
		super(processor, Register.B, immediate);
	}

}
