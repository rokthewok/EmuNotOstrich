package gameBoy.cpu.opcodes.load.loadImmToReg;

import gameBoy.cpu.Register;
import gameBoy.interfaces.IProcessor;

public class LoadImm16ToBC extends LoadImm16ToReg16 {

	public LoadImm16ToBC(IProcessor processor) {
		super(processor, Register.BC );
	}
}
