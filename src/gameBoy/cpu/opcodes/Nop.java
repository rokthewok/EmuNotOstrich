package gameBoy.cpu.opcodes;

import gameBoy.interfaces.IOpcode;

public class Nop implements IOpcode {
	private static int cycles = 4;
	
	@Override
	public void execute() {
		// do nothing
	}

	@Override
	public int getCycles() {
		return cycles;
	}
}
