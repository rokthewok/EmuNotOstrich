package gameBoy.cpu.opcodes.load.loadRegToAddrReg;

import gameBoy.cpu.Register;
import gameBoy.interfaces.IProcessor;

public class LoadAToAddrDE8 extends LoadReg8ToAddrReg16 {

	public LoadAToAddrDE8(IProcessor processor) {
		super(processor, Register.A, Register.DE);
	}

}
