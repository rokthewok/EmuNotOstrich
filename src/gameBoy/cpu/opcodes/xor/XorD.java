package gameBoy.cpu.opcodes.xor;

import gameBoy.cpu.Register;
import gameBoy.interfaces.IProcessor;

public class XorD extends Xor {

	public XorD( IProcessor processor ) {
		super( processor, Register.D );
	}
}
