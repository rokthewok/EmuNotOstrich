package gameBoy.cpu;

import gameBoy.cpu.GameBoyRegisters.Register;
import gameBoy.interfaces.IMemory;
import gameBoy.interfaces.IProcessor;
import gameBoy.interfaces.IRegister;
import gameBoy.interfaces.IVideoMemory;

/**
 * Aggregates the memory and registers of the Gameboy and handles
 * cpu execution.
 * @author John Ruffer
 *
 */
public class GameBoyProcessor implements IProcessor {
	private IRegister registers;
	private IMemory memory;
	private IVideoMemory videoMemory;
	
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
		
		this.registers.setRegister( Register.SP, (short) 0xFFFE );
		this.registers.setRegister( Register.PC, (short) 0x100 );
	}
	
	private void initializeOpcodes() {
		
	}

	@Override
	public IMemory getMemory() {
		return this.memory;
	}

	@Override
	public IMemory getVideoMemory() {
		return this.videoMemory;
	}

	@Override
	public void executeCycle() {
		// TODO execute one machine code
	}
}
