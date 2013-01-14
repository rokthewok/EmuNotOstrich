package gameBoy.cpu.opcodes.or;

import gameBoy.cpu.Register;
import gameBoy.interfaces.IProcessor;

public class OrH extends Or {

	public OrH( IProcessor processor ) {
		super( processor, Register.H );
	}
}
