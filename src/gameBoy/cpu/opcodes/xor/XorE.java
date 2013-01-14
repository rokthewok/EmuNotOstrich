package gameBoy.cpu.opcodes.xor;

import gameBoy.cpu.Register;
import gameBoy.interfaces.IProcessor;

public class XorE extends Xor {

	public XorE( IProcessor processor ) {
		super( processor, Register.E );
	}
}
