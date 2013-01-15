package gameBoy.cpu.opcodes.load.loadImmToReg;

import gameBoy.cpu.Register;
import gameBoy.interfaces.IProcessor;

public class LoadImm16ToDE extends LoadImm16ToReg16 {

	public LoadImm16ToDE(IProcessor processor) {
		super(processor, Register.DE);
	}
}
