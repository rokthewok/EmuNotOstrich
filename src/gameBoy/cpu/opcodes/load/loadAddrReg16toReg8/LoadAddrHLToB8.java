package gameBoy.cpu.opcodes.load.loadAddrReg16toReg8;

import gameBoy.cpu.Register;
import gameBoy.interfaces.IProcessor;

public class LoadAddrHLToB8 extends LoadAddrReg16ToReg8 {
	public LoadAddrHLToB8( IProcessor processor ) {
		super( processor, Register.B , Register.HL );
	}
}
