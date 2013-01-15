package gameBoy.cpu.opcodes.load.loadImmToReg;

import gameBoy.cpu.Register;
import gameBoy.cpu.opcodes.TwoByteOpcode;
import gameBoy.interfaces.IProcessor;

public abstract class LoadImm8ToReg8 extends TwoByteOpcode {
	private static int cycles = 8;
	private IProcessor processor;
	private Register register;
	
	public LoadImm8ToReg8( IProcessor processor , Register register) {
		this.processor = processor;
		this.register = register;
	}
	
	public void execute() {
		this.processor.getRegisters().setRegister( register, 
				this.processor.getMemory().get8BitValue(
						this.processor.getRegisters().getRegister( Register.PC ) + 1));
	}
	
	public int getCycles() {
		return cycles;
	}
}
