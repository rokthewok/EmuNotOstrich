package gameBoy.cpu.opcodes.load.loadRegToReg;

import gameBoy.cpu.Register;
import gameBoy.cpu.opcodes.OneByteOpcode;
import gameBoy.interfaces.IProcessor;

public abstract class LoadRegToReg8 extends OneByteOpcode {
	private static int cycles = 4;
	private IProcessor processor;
	private Register to;
	private Register from;

	public LoadRegToReg8( IProcessor processor, Register to, Register from ) {
		this.processor = processor;
		this.to = to;
		this.from = from;
	}
	
	public void execute() {
		this.processor.getRegisters().setRegister( to , 
				this.processor.getRegisters().getRegister( from ));
	}

	public int getCycles() {
		return cycles;
	}

}
