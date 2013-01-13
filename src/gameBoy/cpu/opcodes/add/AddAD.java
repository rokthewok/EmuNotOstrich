package gameBoy.cpu.opcodes.add;

import gameBoy.cpu.Register;
import gameBoy.interfaces.IProcessor;

public class AddAD extends Addition8 {

	public AddAD( IProcessor processor ) {
		super( processor, Register.D );
	}
}
