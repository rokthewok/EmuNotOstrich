package gameBoy.cpu.opcodes.load.loadRegToAddrReg;

import gameBoy.cpu.Register;
import gameBoy.interfaces.IProcessor;

public class LoadAToAddrHL8 extends LoadReg8ToAddrReg16 {

	public LoadAToAddrHL8(IProcessor processor) {
		super(processor, Register.A, Register.HL);
	}

}
