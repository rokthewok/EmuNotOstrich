package gameBoy.cpu.opcodes.increment;

import gameBoy.cpu.GameBoyRegisters.Register;
import gameBoy.interfaces.IOpcode;
import gameBoy.interfaces.IProcessor;

/**
 * Implementation of the INC B instruction.
 * @author John Ruffer
 *
 */
public class IncB implements IOpcode {
	private IProcessor processor;
	
	public IncB( IProcessor processor ) {
		this.processor = processor;
	}
	
	@Override
	public void execute() {
		this.processor.getRegisters().setRegister( Register.B,
				(short) ( this.processor.getRegisters().getRegister( Register.B ) + 1 ) );
	}

}
