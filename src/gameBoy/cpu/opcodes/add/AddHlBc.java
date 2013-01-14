package gameBoy.cpu.opcodes.add;

import gameBoy.cpu.Register;
import gameBoy.interfaces.IProcessor;

public class AddHlBc extends Addition16 {

	public AddHlBc( IProcessor processor ) {
		super( processor, Register.BC );
	}
}
