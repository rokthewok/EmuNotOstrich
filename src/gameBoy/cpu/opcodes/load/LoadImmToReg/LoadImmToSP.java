package gameBoy.cpu.opcodes.load;

import gameBoy.cpu.Register;
import gameBoy.interfaces.IProcessor;

public class LoadImmToSP extends LoadImmToReg16 {

	public LoadImmToSP(IProcessor processor, short immediate) {
		super(processor, Register.SP, immediate);
	}
}
