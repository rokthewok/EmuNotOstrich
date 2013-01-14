package gameBoy.cpu.opcodes.load.loadRegToReg;

import gameBoy.cpu.Register;
import gameBoy.cpu.opcodes.OneByteOpcode;
import gameBoy.interfaces.IProcessor;

public abstract class LoadRegToAddrHL extends OneByteOpcode {
	private static int cycles = 8;
	private IProcessor processor;
	private Register from;
	
	public LoadRegToAddrHL( IProcessor processor, Register from ) {
		this.processor = processor;
		this.from = from;
	}
	
	public void execute() {
		this.processor.getMemory().set8BitValue(this.processor.getRegisters().getRegister( Register.HL ), 
				(byte) this.processor.getRegisters().getRegister( from ));
	}

	
	public int getCycles() {
		return cycles;
	}

}
