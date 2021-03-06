package gameBoy.cpu.opcodes.load.loadRegToAddrReg;

import gameBoy.cpu.Register;
import gameBoy.interfaces.IProcessor;

public class LoadBToAddrHL8 extends LoadReg8ToAddrReg16 {
	public LoadBToAddrHL8( IProcessor processor ) {
		super( processor, Register.B, Register.HL );
	}
}
