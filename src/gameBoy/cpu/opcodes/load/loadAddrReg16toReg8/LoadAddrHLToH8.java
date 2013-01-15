package gameBoy.cpu.opcodes.load.loadAddrReg16toReg8;

import gameBoy.cpu.Register;
import gameBoy.interfaces.IProcessor;

public class LoadAddrHLToH8 extends LoadAddrReg16ToReg8 {
	public LoadAddrHLToH8( IProcessor processor ) {
		super( processor, Register.H, Register.HL );
	}
}
