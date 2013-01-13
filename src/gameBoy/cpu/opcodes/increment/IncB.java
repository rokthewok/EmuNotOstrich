package gameBoy.cpu.opcodes.increment;

import gameBoy.cpu.Register;
import gameBoy.interfaces.IProcessor;

/**
 * Implementation of the INC B instruction.
 * @author John Ruffer
 *
 */
public class IncB extends Increment {
	private static int cycles = 8;
	
	public IncB( IProcessor processor ) {
		super(processor, Register.B);
	}

	@Override
	public int getCycles() {
		return cycles;
	}

}