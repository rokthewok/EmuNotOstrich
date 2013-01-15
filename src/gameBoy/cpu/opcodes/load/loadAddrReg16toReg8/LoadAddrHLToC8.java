package gameBoy.cpu.opcodes.load.loadAddrReg16toReg8;

import gameBoy.cpu.Register;
import gameBoy.interfaces.IProcessor;

public class LoadAddrHLToC8 extends LoadAddrReg16ToReg8 {
	public LoadAddrHLToC8( IProcessor processor ) {
		super( processor, Register.C , Register.HL );
	}
}
