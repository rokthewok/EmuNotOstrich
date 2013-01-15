package gameBoy.cpu.opcodes.load.loadRegToReg;

import gameBoy.cpu.Register;
import gameBoy.interfaces.IProcessor;

public class LoadBToAddrHL8 extends LoadRegToAddrHL8 {
	public LoadBToAddrHL8( IProcessor processor ) {
		super( processor, Register.B );
	}
}
