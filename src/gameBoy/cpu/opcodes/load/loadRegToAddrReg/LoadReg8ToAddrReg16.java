package gameBoy.cpu.opcodes.load.loadRegToAddrReg;

import gameBoy.cpu.Register;
import gameBoy.cpu.opcodes.OneByteOpcode;
import gameBoy.interfaces.IProcessor;

public abstract class LoadReg8ToAddrReg16 extends OneByteOpcode {
	private static int cycles = 8;
	private IProcessor processor;
	private Register from, addr;
	
	public LoadReg8ToAddrReg16 ( IProcessor processor, Register from, Register addr) {
		this.processor = processor;
		this.from = from;
		this.addr = addr;
	}
	
	@Override
	public void execute() {
		this.processor.getMemory().set8BitValue(
				this.processor.getRegisters().getRegister( this.addr ),
				this.processor.getRegisters().getRegister( this.from ));
	}

	@Override
	public int getCycles() {
		return cycles;
	}

}
