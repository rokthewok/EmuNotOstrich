package gameBoy.cpu.opcodes.load.loadRegToAddrReg;

import gameBoy.cpu.Register;
import gameBoy.interfaces.IProcessor;

public class LoadDToAddrHL8 extends LoadReg8ToAddrReg16 {
	public LoadDToAddrHL8( IProcessor processor ) {
		super( processor, Register.D, Register.HL );
	}
}
