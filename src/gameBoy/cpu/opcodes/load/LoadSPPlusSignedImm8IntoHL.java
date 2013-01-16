package gameBoy.cpu.opcodes.load;

import gameBoy.cpu.Register;
import gameBoy.cpu.opcodes.TwoByteOpcode;
import gameBoy.interfaces.IProcessor;

public class LoadSPPlusSignedImm8IntoHL extends TwoByteOpcode {
	private static int cycles = 12;
	private IProcessor processor;
	
	public LoadSPPlusSignedImm8IntoHL( IProcessor processor ) {
		this.processor = processor;
	}
	
	@Override
	public void execute() {
		this.processor.getRegisters().setRegister(Register.HL, 
				this.processor.getRegisters().getRegister( Register.SP ) +
				(byte) this.processor.getMemory().get8BitValue(
						this.processor.getRegisters().getRegister( Register.PC ) + 1));
	}

	@Override
	public int getCycles() {
		return cycles;
	}

}
