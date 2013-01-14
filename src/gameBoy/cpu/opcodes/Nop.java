package gameBoy.cpu.opcodes;

public class Nop extends OneByteOpcode {
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
