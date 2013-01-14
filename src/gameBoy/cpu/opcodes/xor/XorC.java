package gameBoy.cpu.opcodes.xor;

import gameBoy.cpu.Register;
import gameBoy.interfaces.IProcessor;

public class XorC extends Xor {

	public XorC( IProcessor processor ) {
		super( processor, Register.C );
	}
}
