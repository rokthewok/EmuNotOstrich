package gameBoy.cpu.opcodes.load.loadRegToReg;

import gameBoy.cpu.Register;
import gameBoy.interfaces.IProcessor;

public class LoadAddrHLToB8 extends LoadAddrHLToReg8 {
	public LoadAddrHLToB8( IProcessor processor ) {
		super( processor, Register.B );
	}
}
