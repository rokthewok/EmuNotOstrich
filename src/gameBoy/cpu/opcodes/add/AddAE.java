package gameBoy.cpu.opcodes.add;

import gameBoy.cpu.Register;
import gameBoy.interfaces.IProcessor;

public class AddAE extends Addition8 {

	public AddAE( IProcessor processor ) {
		super( processor, Register.E );
	}
}
