package gameBoy.cpu.opcodes.increment;

import gameBoy.cpu.Register;
import gameBoy.interfaces.IOpcode;
import gameBoy.interfaces.IProcessor;

/**
 * Holds the Increment Opcode logic
 * Child classes need to call the parent constructor and implement
 *  getCycles()
 * @author Kevin Pike
 *
 */

public abstract class Increment16 implements IOpcode {
	private static byte opcodeLength = 1;
	private static int cycles = 8;
	private Register register;
	private IProcessor processor;
	
	protected Increment16( IProcessor processor, Register register ) {
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
		
		this.processor.getRegisters().setRegister( this.register,
				(short) ( this.processor.getRegisters().getRegister( this.register ) + 1 ) );
	}
	
	public int getCycles() {
		return cycles;
	}
	
	@Override
	public byte getOpcodeLength() {
		return opcodeLength;
	}
}