package gameBoy.cpu.opcodes.or;

import gameBoy.cpu.Register;
import gameBoy.interfaces.IProcessor;

public class OrD extends Or {

	public OrD( IProcessor processor ) {
		super( processor, Register.D );
	}
}
