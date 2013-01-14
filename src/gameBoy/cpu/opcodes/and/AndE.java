package gameBoy.cpu.opcodes.and;

import gameBoy.cpu.Register;
import gameBoy.interfaces.IProcessor;

public class AndE extends And {

	public AndE( IProcessor processor ) { 
		super( processor, Register.E );
	}
}
