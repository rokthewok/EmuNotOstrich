package gameBoy.cpu.opcodes.and;

import gameBoy.cpu.Register;
import gameBoy.interfaces.IProcessor;

public class AndA extends And {

	public AndA( IProcessor processor ) {
		super( processor, Register.A );
	}
}
