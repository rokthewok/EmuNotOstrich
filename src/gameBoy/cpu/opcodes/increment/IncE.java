package gameBoy.cpu.opcodes.increment;

import gameBoy.cpu.Register;
import gameBoy.interfaces.IProcessor;

public class IncE extends Increment8 {
	
	public IncE( IProcessor processor ) {
		super( processor, Register.E );
	}
}
