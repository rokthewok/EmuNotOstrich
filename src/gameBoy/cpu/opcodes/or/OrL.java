package gameBoy.cpu.opcodes.or;

import gameBoy.cpu.Register;
import gameBoy.interfaces.IProcessor;

public class OrL extends Or {

	public OrL( IProcessor processor ) {
		super( processor, Register.L );
	}
}
