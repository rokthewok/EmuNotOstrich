package gameBoy.cpu.opcodes.load.loadAddrReg16toReg8;

import gameBoy.cpu.Register;
import gameBoy.interfaces.IProcessor;

public class LoadAddrDEToA8 extends LoadAddrReg16ToReg8 {
	public LoadAddrDEToA8( IProcessor processor ) {
		super( processor, Register.A , Register.HL );
	}
}