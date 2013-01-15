package gameBoy.cpu.opcodes.load;

import gameBoy.cpu.Register;
import gameBoy.cpu.opcodes.ThreeByteOpcode;
import gameBoy.interfaces.IProcessor;

public class LoadAddrImm16ToA8 extends ThreeByteOpcode {
	private static int cycles = 16;
	private IProcessor processor;
	
	public LoadAddrImm16ToA8( IProcessor processor ) {
		this.processor = processor;
	}
	
	public void execute() {
		this.processor.getRegisters().setRegister(Register.A , 
				this.processor.getMemory().get8BitValue(
						this.processor.getMemory().get16BitValue( 
								this.processor.getRegisters().getRegister(Register.PC) + 1)));
	}

	public int getCycles() {
		return cycles;
	}

}
