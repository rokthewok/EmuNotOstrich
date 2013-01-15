package gameBoy.cpu.opcodes.load.loadAddrReg16toReg8;

import gameBoy.cpu.Register;
import gameBoy.cpu.opcodes.OneByteOpcode;
import gameBoy.interfaces.IProcessor;

public abstract class LoadAddrReg16ToReg8 extends OneByteOpcode {
	private static int cycles = 8;
	private Register to;
	private Register addr;
	private IProcessor processor;

	public LoadAddrReg16ToReg8( IProcessor processor, Register to , Register addr) {
		this.processor = processor;
		this.to = to;
		this.addr = addr;
	}
	
	public void execute() {
		this.processor.getRegisters().setRegister(to , 
				this.processor.getMemory().get8BitValue(
						this.processor.getRegisters().getRegister( this.addr )));
	}

	public int getCycles() {
		return cycles;
	}

}
