package gameBoy.cpu.opcodes.load.LoadImmToReg;

import gameBoy.cpu.Register;
import gameBoy.interfaces.IProcessor;

public class LoadImmToDE extends LoadImmToReg16 {

	public LoadImmToDE(IProcessor processor, short immediate) {
		super(processor, Register.DE, immediate);
	}
}
