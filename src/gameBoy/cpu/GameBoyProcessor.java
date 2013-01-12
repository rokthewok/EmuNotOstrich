package gameBoy.cpu;

import gameBoy.interfaces.IMemory;
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
	private IMemory memory;
	private IMemory videoMemory;
	
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
	
	@Override
	public void initialize() {
		this.initializeOpcodes();
	}
	
	private void initializeOpcodes() {
		
	}

	@Override
	public IMemory getMemory() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IMemory getVideoMemory() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void executeCycle() {
		// TODO Auto-generated method stub
		
	}
}
