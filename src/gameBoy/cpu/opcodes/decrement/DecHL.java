package gameBoy.cpu.opcodes.decrement;

import gameBoy.cpu.Register;
import gameBoy.interfaces.IProcessor;

public class DecHL extends Decrement16 {
	
	public DecHL( IProcessor processor ) {
		super(processor, Register.HL);
	}
}
