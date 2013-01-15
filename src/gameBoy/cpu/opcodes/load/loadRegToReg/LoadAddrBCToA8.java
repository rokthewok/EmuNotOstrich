package gameBoy.cpu.opcodes.load.loadRegToReg;

import gameBoy.cpu.Register;
import gameBoy.interfaces.IProcessor;

public class LoadAddrBCToA8 extends LoadAddrReg16ToReg8 {
	public LoadAddrBCToA8( IProcessor processor ) {
		super( processor, Register.A , Register.HL );
	}
}