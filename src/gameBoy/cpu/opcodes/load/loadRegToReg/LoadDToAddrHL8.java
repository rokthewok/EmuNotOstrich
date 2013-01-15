package gameBoy.cpu.opcodes.load.loadRegToReg;

import gameBoy.cpu.Register;
import gameBoy.interfaces.IProcessor;

public class LoadDToAddrHL8 extends LoadRegToAddrHL8 {
	public LoadDToAddrHL8( IProcessor processor ) {
		super( processor, Register.D );
	}
}
