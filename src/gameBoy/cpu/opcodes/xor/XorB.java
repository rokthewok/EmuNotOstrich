package gameBoy.cpu.opcodes.xor;

import gameBoy.cpu.Register;
import gameBoy.interfaces.IProcessor;

public class XorB extends Xor {

	public XorB( IProcessor processor ) {
		super( processor, Register.B );
	}
}
