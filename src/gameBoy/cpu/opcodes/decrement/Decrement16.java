package gameBoy.cpu.opcodes.decrement;

import gameBoy.cpu.Register;
import gameBoy.interfaces.IOpcode;
import gameBoy.interfaces.IProcessor;

public abstract class Decrement16 implements IOpcode {
	private static int cycles = 8;
	private Register register;
	private IProcessor processor;
	
	public Decrement16( IProcessor processor, Register register ) {
		this.processor = processor;
		this.register = register;
	}
	
	public void setRegister(Register register) {
		this.register = register;
	}
	
	public Register getRegister(Register register) {
		return this.register;
	}
	
	public void execute() {
		assert processor != null && register != null;
		
		// No flags are affected
		this.processor.getRegisters().setRegister( this.register, 
				(short) ( this.processor.getRegisters().getRegister( this.register ) - 1 ));
	}
	
	public int getCycles() {
		return cycles;
	}
}