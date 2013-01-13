package gameBoy.cpu.opcodes.add;

import gameBoy.cpu.Register;
import gameBoy.interfaces.IProcessor;

public class AddAH extends Addition8 {

	public AddAH( IProcessor processor ) {
		super( processor, Register.H );
	}
}
