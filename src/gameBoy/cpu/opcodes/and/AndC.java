package gameBoy.cpu.opcodes.and;

import gameBoy.cpu.Register;
import gameBoy.interfaces.IProcessor;

public class AndC extends And {

	public AndC( IProcessor processor ) {
		super( processor, Register.C );
	}
}
