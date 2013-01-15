package gameBoy.cpu.opcodes.load.loadRegToAddrReg;

import gameBoy.cpu.Register;
import gameBoy.interfaces.IProcessor;

public class LoadHToAddrHL8 extends LoadReg8ToAddrReg16 {
	public LoadHToAddrHL8( IProcessor processor ) {
		super( processor, Register.H, Register.HL );
	}
}
