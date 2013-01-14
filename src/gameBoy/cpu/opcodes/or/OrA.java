package gameBoy.cpu.opcodes.or;

import gameBoy.cpu.Register;
import gameBoy.interfaces.IProcessor;

public class OrA extends Or {

	public OrA( IProcessor processor ) {
		super( processor, Register.A );
	}
}
