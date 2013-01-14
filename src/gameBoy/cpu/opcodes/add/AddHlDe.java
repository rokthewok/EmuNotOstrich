package gameBoy.cpu.opcodes.add;

import gameBoy.cpu.Register;
import gameBoy.interfaces.IProcessor;

public class AddHlDe extends Addition16 {

	public AddHlDe( IProcessor processor ) {
		super( processor, Register.DE );
	}
}
