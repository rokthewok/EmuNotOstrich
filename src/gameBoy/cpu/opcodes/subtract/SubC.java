package gameBoy.cpu.opcodes.subtract;

import gameBoy.cpu.Register;
import gameBoy.interfaces.IProcessor;

public class SubC extends Sub {

	public SubC( IProcessor processor ) {
		super( processor, Register.C );
	}
}
