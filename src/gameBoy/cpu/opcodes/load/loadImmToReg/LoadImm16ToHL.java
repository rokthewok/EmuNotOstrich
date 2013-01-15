package gameBoy.cpu.opcodes.load.loadImmToReg;

import gameBoy.cpu.Register;
import gameBoy.interfaces.IProcessor;

public class LoadImm16ToHL extends LoadImm16ToReg16 {

	public LoadImm16ToHL(IProcessor processor) {
		super(processor, Register.HL);
	}
}
