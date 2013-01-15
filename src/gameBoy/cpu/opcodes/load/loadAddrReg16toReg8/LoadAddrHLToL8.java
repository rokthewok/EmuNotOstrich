package gameBoy.cpu.opcodes.load.loadAddrReg16toReg8;

import gameBoy.cpu.Register;
import gameBoy.interfaces.IProcessor;

public class LoadAddrHLToL8 extends LoadAddrReg16ToReg8 {
	public LoadAddrHLToL8( IProcessor processor ) {
		super( processor, Register.L, Register.HL );
	}
}
