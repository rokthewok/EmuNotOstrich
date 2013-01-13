package gameBoy.cpu.opcodes.increment;

import gameBoy.cpu.Register;
import gameBoy.interfaces.IProcessor;

public class IncA extends Increment8 {

	public IncA( IProcessor processor ) {
		super( processor, Register.A );
	}
}
