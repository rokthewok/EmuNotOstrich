package gameBoy.cpu.opcodes.or;

import gameBoy.cpu.Register;
import gameBoy.interfaces.IProcessor;

public class OrB extends Or {

	public OrB( IProcessor processor ) {
		super( processor, Register.B );
	}
}
