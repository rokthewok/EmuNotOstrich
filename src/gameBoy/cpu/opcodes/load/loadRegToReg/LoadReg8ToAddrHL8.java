package gameBoy.cpu.opcodes.load.loadRegToReg;

import gameBoy.cpu.Register;
import gameBoy.cpu.opcodes.OneByteOpcode;
import gameBoy.interfaces.IProcessor;

public abstract class LoadReg8ToAddrHL8 extends OneByteOpcode {
	private static int cycles = 8;
	private IProcessor processor;
	private Register from;
	
	public LoadReg8ToAddrHL8( IProcessor processor, Register from ) {
		this.processor = processor;
		this.from = from;
	}
	
	public void execute() {
		this.processor.getMemory().set8BitValue(this.processor.getRegisters().getRegister( Register.HL ), 
				this.processor.getRegisters().getRegister( from ));
	}

	
	public int getCycles() {
		return cycles;
	}

}
