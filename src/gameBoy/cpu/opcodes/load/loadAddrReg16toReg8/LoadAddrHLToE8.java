package gameBoy.cpu.opcodes.load.loadAddrReg16toReg8;

import gameBoy.cpu.Register;
import gameBoy.interfaces.IProcessor;

public class LoadAddrHLToE8 extends LoadAddrReg16ToReg8 {
	public LoadAddrHLToE8( IProcessor processor ) {
		super( processor, Register.E , Register.HL );
	}
}
