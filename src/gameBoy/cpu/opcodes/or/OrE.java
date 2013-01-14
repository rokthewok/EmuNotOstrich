package gameBoy.cpu.opcodes.or;

import gameBoy.cpu.Register;
import gameBoy.interfaces.IProcessor;

public class OrE extends Or {

	public OrE( IProcessor processor ) {
		super( processor, Register.E );
	}
}
