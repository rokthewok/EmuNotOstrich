package gameBoy.cpu.opcodes.add;

import gameBoy.cpu.Register;
import gameBoy.interfaces.IProcessor;

public class AddAA extends Addition8 {

	public AddAA( IProcessor processor ) {
		super( processor, Register.A );
	}
}
