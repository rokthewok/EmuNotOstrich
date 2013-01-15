package gameBoy.cpu.opcodes.load.loadRegToAddrReg;

import gameBoy.cpu.Register;
import gameBoy.interfaces.IProcessor;

public class LoadAToAddrBC8 extends LoadReg8ToAddrReg16 {

	public LoadAToAddrBC8(IProcessor processor) {
		super(processor, Register.A, Register.BC);
	}

}
