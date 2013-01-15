package gameBoy.cpu.opcodes.load;

import gameBoy.cpu.Register;
import gameBoy.cpu.opcodes.ThreeByteOpcode;
import gameBoy.interfaces.IProcessor;

public class LoadA8ToAddrImm16 extends ThreeByteOpcode {
	private static int cycles = 16;
	private IProcessor processor;
	
	public LoadA8ToAddrImm16 ( IProcessor processor ) { 
		this.processor = processor;
	}
	
	public void execute() {
		this.processor.getMemory().set8BitValue(
				this.processor.getMemory().get16BitValue(
						this.processor.getRegisters().getRegister( Register.PC ) + 1), 
				this.processor.getRegisters().getRegister(Register.A));
	}

	public int getCycles() {
		return cycles;
	}

}
