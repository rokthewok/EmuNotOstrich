package gameBoy.cpu.opcodes.and;

import gameBoy.cpu.Register;
import gameBoy.interfaces.IProcessor;

public class AndH extends And {

	public AndH( IProcessor processor ) {
		super( processor, Register.H );
	}
}
