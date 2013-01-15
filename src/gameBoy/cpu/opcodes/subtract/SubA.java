package gameBoy.cpu.opcodes.subtract;

import gameBoy.cpu.Register;
import gameBoy.interfaces.IProcessor;

public class SubA extends Sub {

	public SubA( IProcessor processor ) {
		super( processor, Register.A );
	}
}
