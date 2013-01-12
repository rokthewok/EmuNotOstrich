package gameBoy.cpu.opcodes.increment;

import gameBoy.cpu.GameBoyRegisters.Register;
import gameBoy.interfaces.IOpcode;
import gameBoy.interfaces.IProcessor;

/**
 * Command implementation of the opcode INC BC.
 * @author John Ruffer
 *
 */
public class IncBc implements IOpcode {
	private IProcessor processor;
	
	public IncBc( IProcessor processor ) {
		this.processor = processor;
	}
	@Override
	public void execute() {
		// get register BC, increment it, and move it back into the register
		this.processor.getRegisters().setRegister( Register.BC,
				(short) ( this.processor.getRegisters().getRegister( Register.BC ) + 1 ) );
	}

}
