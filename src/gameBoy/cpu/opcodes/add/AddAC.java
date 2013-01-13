package gameBoy.cpu.opcodes.add;

import gameBoy.cpu.Register;
import gameBoy.interfaces.IProcessor;

public class AddAC extends Addition8 {
	
	public AddAC( IProcessor processor ) {
		super( processor, Register.C );
	}
}
