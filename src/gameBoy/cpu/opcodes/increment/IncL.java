package gameBoy.cpu.opcodes.increment;

import gameBoy.cpu.Register;
import gameBoy.interfaces.IProcessor;

public class IncL extends Increment8 {

	public IncL( IProcessor processor ) {
		super( processor, Register.L );
	}
}
