package gameBoy.cpu.opcodes.add;

import gameBoy.cpu.Register;
import gameBoy.interfaces.IProcessor;

public class AddAB extends Addition8 {
	
	public AddAB( IProcessor processor ) {
		super( processor, Register.B );
	}
}
