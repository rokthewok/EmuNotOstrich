package gameBoy.cpu.opcodes.load.loadRegToAddrReg;

import gameBoy.cpu.Register;
import gameBoy.interfaces.IProcessor;

public class LoadCToAddrHL8 extends LoadReg8ToAddrReg16 {
	public LoadCToAddrHL8( IProcessor processor ) {
		super( processor, Register.C, Register.HL );
	}
}
