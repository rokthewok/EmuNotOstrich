package gameBoy.cpu.opcodes.load.loadRegToReg;

import gameBoy.cpu.Register;
import gameBoy.cpu.opcodes.TwoByteOpcode;
import gameBoy.interfaces.IProcessor;

public class LoadImmToAddrHL8 extends TwoByteOpcode {
	private static int cycles = 12;
	private IProcessor processor;
	
	public LoadImmToAddrHL8( IProcessor processor ) {
		this.processor = processor;
	}
	
	public void execute() {
		int HL = this.processor.getRegisters().getRegister( Register.HL );
		int immediate = this.processor.getMemory().get8BitValue(
							this.processor.getRegisters().getRegister( Register.PC ) + 1);
		System.out.println(immediate);
		this.processor.getMemory().set8BitValue(HL, immediate);
	}

	public int getCycles() {
		return cycles;
	}

}