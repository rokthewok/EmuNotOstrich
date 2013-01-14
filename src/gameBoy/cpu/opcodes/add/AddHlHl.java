package gameBoy.cpu.opcodes.add;

import gameBoy.cpu.Register;
import gameBoy.interfaces.IProcessor;

public class AddHlHl extends Addition16 {

	public AddHlHl( IProcessor processor ) {
		super( processor, Register.HL );
	}
}
