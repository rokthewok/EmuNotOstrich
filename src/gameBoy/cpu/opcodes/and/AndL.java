package gameBoy.cpu.opcodes.and;

import gameBoy.cpu.Register;
import gameBoy.interfaces.IProcessor;

public class AndL extends And {

	public AndL( IProcessor processor ) {
		super( processor, Register.L );
	}
}
