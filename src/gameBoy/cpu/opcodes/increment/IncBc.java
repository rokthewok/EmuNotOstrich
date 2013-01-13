package gameBoy.cpu.opcodes.increment;

import gameBoy.cpu.Register;
import gameBoy.interfaces.IProcessor;

/**
 * Command implementation of the opcode INC BC.
 * @author John Ruffer
 *
 */
public class IncBc extends Increment16 {
	
	public IncBc( IProcessor processor ) {
		super( processor, Register.BC );
	}
}
