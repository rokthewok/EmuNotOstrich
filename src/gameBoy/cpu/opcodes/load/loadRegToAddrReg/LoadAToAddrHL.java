package gameBoy.cpu.opcodes.load.loadRegToAddrReg;

import gameBoy.cpu.Register;
import gameBoy.interfaces.IProcessor;

public class LoadAToAddrHL extends LoadReg8ToAddrReg16 {

	public LoadAToAddrHL(IProcessor processor) {
		super(processor, Register.A, Register.HL);
	}

}
