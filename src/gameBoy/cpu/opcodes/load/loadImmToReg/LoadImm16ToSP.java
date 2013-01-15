package gameBoy.cpu.opcodes.load.loadImmToReg;

import gameBoy.cpu.Register;
import gameBoy.interfaces.IProcessor;

public class LoadImm16ToSP extends LoadImm16ToReg16 {

	public LoadImm16ToSP(IProcessor processor, short immediate) {
		super(processor, Register.SP);
	}
}
