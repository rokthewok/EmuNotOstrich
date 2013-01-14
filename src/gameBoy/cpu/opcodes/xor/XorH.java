package gameBoy.cpu.opcodes.xor;

import gameBoy.cpu.Register;
import gameBoy.interfaces.IProcessor;

public class XorH extends Xor {

	public XorH( IProcessor processor ) {
		super( processor, Register.H );
	}
}
