package gameBoy.cpu.opcodes.xor;

import gameBoy.cpu.Register;
import gameBoy.interfaces.IProcessor;

public class XorL extends Xor {

	public XorL( IProcessor processor ) {
		super( processor, Register.L );
	}
}
