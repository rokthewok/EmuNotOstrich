package gameBoy.cpu.opcodes.decrement;

import gameBoy.cpu.Register;
import gameBoy.interfaces.IProcessor;

public class DecSP extends Decrement16 {
	
	public DecSP( IProcessor processor ) {
		super(processor, Register.SP);
	}
}
