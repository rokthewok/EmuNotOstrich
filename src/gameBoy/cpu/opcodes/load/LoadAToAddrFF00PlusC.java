package gameBoy.cpu.opcodes.load;

import gameBoy.cpu.Register;
import gameBoy.cpu.opcodes.TwoByteOpcode;
import gameBoy.interfaces.IProcessor;

public class LoadAToAddrFF00PlusC extends TwoByteOpcode {
	private static int cycles = 8;
	private IProcessor processor;

	public LoadAToAddrFF00PlusC ( IProcessor processor ) {
		this.processor = processor;
	}
	
	public void execute() {
		this.processor.getMemory().set8BitValue(
				this.processor.getRegisters().getRegister( Register.C ) + 0xFF00, 
				this.processor.getRegisters().getRegister( Register.A ));
	}

	public int getCycles() {
		return cycles;
	}

}
