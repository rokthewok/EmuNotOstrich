package gameBoy.cpu.opcodes.increment;

import gameBoy.cpu.Register;
import gameBoy.interfaces.IProcessor;

public class IncDe extends Increment {
	private static int cycles = 8;
	
	public IncDe( IProcessor processor ) {
		super ( processor, Register.DE );
	}

	@Override
	public int getCycles() {
		return cycles;
	}

}
