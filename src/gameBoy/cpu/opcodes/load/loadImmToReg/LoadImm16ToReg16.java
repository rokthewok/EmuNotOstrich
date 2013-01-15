package gameBoy.cpu.opcodes.load.loadImmToReg;

import gameBoy.cpu.Register;
import gameBoy.cpu.opcodes.ThreeByteOpcode;
import gameBoy.interfaces.IProcessor;

public class LoadImm16ToReg16 extends ThreeByteOpcode {
	private static int cycles = 8;
	private IProcessor processor;
	private Register register;
	
	public LoadImm16ToReg16( IProcessor processor , Register register ) {
		this.processor = processor;
		this.register = register;
	}
	
	public void execute() {
		this.processor.getRegisters().setRegister( register, 
				this.processor.getMemory().get16BitValue(
						this.processor.getRegisters().getRegister( Register.PC ) + 1)); 
	}
	
	public int getCycles() {
		return cycles;
	}
}
