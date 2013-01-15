package gameBoy.cpu.opcodes.load.loadRegToAddrReg;

import gameBoy.cpu.Register;
import gameBoy.interfaces.IProcessor;

public class LoadEToAddrHL8 extends LoadReg8ToAddrReg16 {
	public LoadEToAddrHL8( IProcessor processor ) {
		super( processor, Register.E, Register.HL );
	}
}
