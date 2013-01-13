package gameBoy.cpu.opcodes.increment;

import gameBoy.cpu.Register;
import gameBoy.interfaces.IProcessor;

public class IncDe extends Increment16 {
	
	public IncDe( IProcessor processor ) {
		super ( processor, Register.DE );
	}
}
