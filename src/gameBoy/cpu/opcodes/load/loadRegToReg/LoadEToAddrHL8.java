package gameBoy.cpu.opcodes.load.loadRegToReg;

import gameBoy.cpu.Register;
import gameBoy.interfaces.IProcessor;

public class LoadEToAddrHL8 extends LoadRegToAddrHL8 {
	public LoadEToAddrHL8( IProcessor processor ) {
		super( processor, Register.E );
	}
}
