package gameBoy.cpu.opcodes.increment;

import gameBoy.cpu.Register;
import gameBoy.interfaces.IProcessor;

public class IncC extends Increment8 {
	
	public IncC( IProcessor processor ) {
		super( processor, Register.C );
	}
}
