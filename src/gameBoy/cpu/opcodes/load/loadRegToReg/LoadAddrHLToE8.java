package gameBoy.cpu.opcodes.load.loadRegToReg;

import gameBoy.cpu.Register;
import gameBoy.interfaces.IProcessor;

public class LoadAddrHLToE8 extends LoadAddrHLToReg8 {
	public LoadAddrHLToE8( IProcessor processor ) {
		super( processor, Register.E );
	}
}
