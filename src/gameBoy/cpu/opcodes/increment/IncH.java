package gameBoy.cpu.opcodes.increment;

import gameBoy.cpu.Register;
import gameBoy.interfaces.IProcessor;

public class IncH extends Increment8 {

	public IncH( IProcessor processor ) {
		super( processor, Register.H );
	}
}
