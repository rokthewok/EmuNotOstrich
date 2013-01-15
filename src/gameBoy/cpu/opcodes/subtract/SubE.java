package gameBoy.cpu.opcodes.subtract;

import gameBoy.cpu.Register;
import gameBoy.interfaces.IProcessor;

public class SubE extends Sub {

	public SubE( IProcessor processor ) {
		super( processor, Register.E );
	}
}
