package gameBoy.cpu.opcodes.subtract;

import gameBoy.cpu.Register;
import gameBoy.interfaces.IProcessor;

public class SubD extends Sub {

	public SubD( IProcessor processor ) {
		super( processor, Register.D );
	}
}
