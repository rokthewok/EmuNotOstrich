package gameBoy.cpu.opcodes.and;

import gameBoy.cpu.Register;
import gameBoy.interfaces.IProcessor;

public class AndB extends And {

	public AndB( IProcessor processor ) {
		super( processor, Register.B );
	}
}
