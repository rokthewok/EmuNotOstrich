package gameBoy.cpu.opcodes.load;

import gameBoy.cpu.Register;
import gameBoy.cpu.opcodes.ThreeByteOpcode;
import gameBoy.interfaces.IProcessor;

public class LoadSPToAddrImm16 extends ThreeByteOpcode {
	private static int cycles = 20;
	private IProcessor processor;
	
	public LoadSPToAddrImm16( IProcessor processor ) {
		this.processor = processor;
	}
	
	@Override
	public void execute() {
		this.processor.getMemory().set16BitValue(
				this.processor.getMemory().get16BitValue(
						this.processor.getRegisters().getRegister( Register.PC) + 1),
				this.processor.getRegisters().getRegister( Register.SP ));
	}

	@Override
	public int getCycles() {
		return cycles;
	}

}
