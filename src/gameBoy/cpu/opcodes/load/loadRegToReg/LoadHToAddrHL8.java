package gameBoy.cpu.opcodes.load.loadRegToReg;

import gameBoy.cpu.Register;
import gameBoy.interfaces.IProcessor;

public class LoadHToAddrHL8 extends LoadRegToAddrHL8 {
	public LoadHToAddrHL8( IProcessor processor ) {
		super( processor, Register.H );
	}
}
