package gameBoy.cpu.opcodes.load;

import gameBoy.cpu.Register;
import gameBoy.cpu.opcodes.TwoByteOpcode;
import gameBoy.interfaces.IProcessor;

public class LoadAddrFF00PlusImm8ToA8 extends TwoByteOpcode {
	private static int cycles = 12;
	private IProcessor processor;
	
	public LoadAddrFF00PlusImm8ToA8( IProcessor processor ) {
		this.processor = processor;
	}

	public void execute() {
		this.processor.getRegisters().setRegister( Register.A , 
				this.processor.getMemory().get8BitValue(
						0xFF00 +
						this.processor.getMemory().get8BitValue(
								this.processor.getRegisters().getRegister( Register.PC ) + 1)));
	}

	public int getCycles() {
		return cycles;
	}

}
