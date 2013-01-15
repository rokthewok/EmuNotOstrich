package gameBoy.cpu.opcodes.load.loadAddrReg16toReg8;

import gameBoy.cpu.Register;
import gameBoy.interfaces.IProcessor;

public class LoadAddrHLToD8 extends LoadAddrReg16ToReg8 {
	public LoadAddrHLToD8( IProcessor processor ) {
		super( processor, Register.D , Register.HL );
	}
}