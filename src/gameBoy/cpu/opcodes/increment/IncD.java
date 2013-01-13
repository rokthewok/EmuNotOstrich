package gameBoy.cpu.opcodes.increment;

import gameBoy.cpu.Register;
import gameBoy.interfaces.IProcessor;

public class IncD extends Increment8 {
	
	public IncD( IProcessor processor ) {
		super( processor, Register.D );
	}
}
