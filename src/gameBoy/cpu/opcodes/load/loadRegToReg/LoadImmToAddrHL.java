package gameBoy.cpu.opcodes.load.loadRegToReg;

import gameBoy.cpu.Register;
import gameBoy.cpu.opcodes.TwoByteOpcode;
import gameBoy.interfaces.IProcessor;

public class LoadImmToAddrHL extends TwoByteOpcode {
	private static int cycles = 12;
	private IProcessor processor;
	
	public LoadImmToAddrHL( IProcessor processor ) {
		this.processor = processor;
	}
	
	@Override
	public void execute() {
		short HL = this.processor.getRegisters().getRegister( Register.HL );
		System.out.println(HL);
		byte immediate = this.processor.getMemory().get8BitValue(
				this.processor.getRegisters().getRegister( Register.PC ) + 0x100);
		System.out.println(immediate);
		this.processor.getMemory().set8BitValue(HL, immediate);
	}

	public int getCycles() {
		return cycles;
	}

}
