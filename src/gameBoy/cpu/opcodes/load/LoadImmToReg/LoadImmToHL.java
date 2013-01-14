package gameBoy.cpu.opcodes.load.LoadImmToReg;

import gameBoy.cpu.Register;
import gameBoy.interfaces.IProcessor;

public class LoadImmToHL extends LoadImmToReg16 {

	public LoadImmToHL(IProcessor processor, short immediate) {
		super(processor, Register.HL, immediate);
	}
}
