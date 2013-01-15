package gameBoy.cpu.opcodes.load.loadRegToReg;

import gameBoy.cpu.Register;
import gameBoy.interfaces.IProcessor;

public class LoadLToAddrHL8 extends LoadRegToAddrHL8 {
	public LoadLToAddrHL8( IProcessor processor ) {
		super( processor, Register.L );
	}
}
