package gameBoy.cpu.opcodes.load.loadRegToReg;

import gameBoy.cpu.Register;
import gameBoy.interfaces.IProcessor;

public class LoadAddrHLToD8 extends LoadAddrHLToReg8 {
	public LoadAddrHLToD8( IProcessor processor ) {
		super( processor, Register.D );
	}
}
