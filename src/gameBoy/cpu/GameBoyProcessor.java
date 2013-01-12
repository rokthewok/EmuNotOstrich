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
	
	public GameBoyProcessor() {
		this( new GameBoyRegisters() );
	}
	
	public GameBoyProcessor( IRegister registers ) {
		this.registers = registers;
	}
	
	@Override
	public IRegister getRegisters() {
		return this.registers;
	}

}
