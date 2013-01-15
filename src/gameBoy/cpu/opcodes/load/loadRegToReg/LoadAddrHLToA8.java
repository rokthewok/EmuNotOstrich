package gameBoy.cpu.opcodes.load.loadRegToReg;

import gameBoy.cpu.Register;
import gameBoy.interfaces.IProcessor;

public class LoadAddrHLToA8 extends LoadAddrHLToReg8 {
	public LoadAddrHLToA8( IProcessor processor ) {
		super( processor, Register.A );
	}
}