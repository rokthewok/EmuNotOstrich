package gameBoy.cpu.opcodes.subtract;

import gameBoy.cpu.Register;
import gameBoy.interfaces.IProcessor;

public class SubH extends Sub {

	public SubH( IProcessor processor ) {
		super( processor, Register.H );
	}
}
