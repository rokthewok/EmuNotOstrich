package gameBoy.cpu.opcodes.increment;

import gameBoy.cpu.Register;
import gameBoy.interfaces.IProcessor;

public class IncHl extends Increment16 {

	public IncHl( IProcessor processor ) {
		super( processor, Register.HL );
	}
}
