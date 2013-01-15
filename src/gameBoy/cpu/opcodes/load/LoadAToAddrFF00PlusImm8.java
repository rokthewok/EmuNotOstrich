package gameBoy.cpu.opcodes.load;

import gameBoy.cpu.Register;
import gameBoy.cpu.opcodes.TwoByteOpcode;
import gameBoy.interfaces.IProcessor;

public class LoadAToAddrFF00PlusImm8 extends TwoByteOpcode {
	private static int cycles = 12;
	private IProcessor processor;
	
	public LoadAToAddrFF00PlusImm8( IProcessor processor ) {
		this.processor = processor;
	}

	public void execute() {
		this.processor.getMemory().set8BitValue(0xFF00 + 
				this.processor.getMemory().get8BitValue(
						this.processor.getRegisters().getRegister( Register.PC ) + 1),
						this.processor.getRegisters().getRegister( Register.A ));
	}

	public int getCycles() {
		return cycles;
	}

}
