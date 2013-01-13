package gameBoy.cpu.opcodes.add;

import gameBoy.cpu.Register;
import gameBoy.interfaces.IProcessor;

public class AddAL extends Addition8 {

	public AddAL( IProcessor processor ) {
		super( processor, Register.L );
	}
}
