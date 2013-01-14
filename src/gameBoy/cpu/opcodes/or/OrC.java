package gameBoy.cpu.opcodes.or;

import gameBoy.cpu.Register;
import gameBoy.interfaces.IProcessor;

public class OrC extends Or {

	public OrC( IProcessor processor ) {
		super( processor, Register.C );
	}
}
