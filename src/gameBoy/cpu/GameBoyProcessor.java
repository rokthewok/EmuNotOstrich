package gameBoy.cpu;

import gameBoy.interfaces.IProcessor;
import gameBoy.interfaces.IRegister;

/**
 * Aggregates the memory and registers of the Gameboy and handles
 * cpu execution.
 * @author John Ruffer
 *
 */
public class GameBoyProcessor implements IProcessor {
	private IRegister registers;
	@Override
	public IRegister getRegisters() {
		// TODO Auto-generated method stub
		return this.registers;
	}

}
