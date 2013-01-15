package gameBoy.cpu.opcodes.load.loadRegToReg;

import gameBoy.cpu.Register;
import gameBoy.interfaces.IProcessor;

public class LoadAddrHLToH8 extends LoadAddrHLToReg8 {
	public LoadAddrHLToH8( IProcessor processor ) {
		super( processor, Register.H );
	}
}
