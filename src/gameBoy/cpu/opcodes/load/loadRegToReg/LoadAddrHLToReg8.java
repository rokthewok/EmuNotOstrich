package gameBoy.cpu.opcodes.load.loadRegToReg;

import gameBoy.cpu.Register;
import gameBoy.interfaces.IOpcode;
import gameBoy.interfaces.IProcessor;

public abstract class LoadAddrHLToReg8 implements IOpcode {
	private static int cycles = 8;
	private Register to;
	private IProcessor processor;

	public LoadAddrHLToReg8( IProcessor processor, Register to ) {
		this.processor = processor;
		this.to = to;
	}
	
	public void execute() {
		this.processor.getRegisters().setRegister(to , 
				this.processor.getMemory().get8BitValue(this.processor.getRegisters().getRegister( Register.HL )));
	}

	public int getCycles() {
		return cycles;
	}

}
