package gameBoy.cpu.opcodes.decrement;

import gameBoy.cpu.Register;
import gameBoy.interfaces.IProcessor;

public class DecBC extends Decrement16 {
	
	public DecBC( IProcessor processor ) {
		super(processor, Register.BC);
	}
}
