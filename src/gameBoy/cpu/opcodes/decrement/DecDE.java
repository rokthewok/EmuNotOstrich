package gameBoy.cpu.opcodes.decrement;

import gameBoy.cpu.Register;
import gameBoy.interfaces.IProcessor;

public class DecDE extends Decrement16 {
	
	public DecDE( IProcessor processor ) {
		super(processor, Register.DE);
	}
}
