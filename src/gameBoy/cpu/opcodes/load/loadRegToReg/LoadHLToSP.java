package gameBoy.cpu.opcodes.load.loadRegToReg;

import gameBoy.cpu.Register;
import gameBoy.interfaces.IProcessor;

public class LoadHLToSP extends LoadReg8ToReg8 {
	private static int cycles = 8;
	
	public LoadHLToSP(IProcessor processor) {
		super(processor, Register.SP, Register.HL);
	}
	
	@Override
	public int getCycles() {
		return cycles;
	}
}
