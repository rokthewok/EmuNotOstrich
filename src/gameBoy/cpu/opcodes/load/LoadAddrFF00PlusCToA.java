package gameBoy.cpu.opcodes.load;

import gameBoy.cpu.Register;
import gameBoy.cpu.opcodes.TwoByteOpcode;
import gameBoy.interfaces.IProcessor;

public class LoadAddrFF00PlusCToA extends TwoByteOpcode {
	private static int cycles = 8;
	private IProcessor processor;
	
	public LoadAddrFF00PlusCToA ( IProcessor processor ) {
		this.processor = processor;
	}
	
	public void execute() {
		this.processor.getRegisters().setRegister(
				Register.A ,this.processor.getMemory().get8BitValue(
					this.processor.getRegisters().getRegister( Register.C ) + 0xFF00));
	}

	public int getCycles() {
		return cycles;
	}

}
