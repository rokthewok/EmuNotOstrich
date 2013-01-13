package gameBoy.cpu.opcodes.increment;

import gameBoy.cpu.Register;
import gameBoy.interfaces.IProcessor;

public class IncSp extends Increment16 {
	
	public IncSp( IProcessor processor ) {
		super( processor, Register.SP );
	}
}
