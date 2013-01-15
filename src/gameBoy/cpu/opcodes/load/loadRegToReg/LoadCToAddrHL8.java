package gameBoy.cpu.opcodes.load.loadRegToReg;

import gameBoy.cpu.Register;
import gameBoy.interfaces.IProcessor;

public class LoadCToAddrHL8 extends LoadRegToAddrHL8 {
	public LoadCToAddrHL8( IProcessor processor ) {
		super( processor, Register.C );
	}
}
