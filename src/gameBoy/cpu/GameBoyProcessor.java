package gameBoy.cpu;

import gameBoy.interfaces.IMemory;
import gameBoy.interfaces.IProcessor;
import gameBoy.interfaces.IRegister;
import gameBoy.interfaces.IOpcodeMap;
import gameBoy.memory.Memory;

/**
 * Aggregates the memory and registers of the Gameboy and handles
 * cpu execution.
 * @author John Ruffer
 *
 */
public class GameBoyProcessor implements IProcessor {
	private IRegister registers;
	private IMemory memory;
	private IOpcodeMap opcodeMap;
	
	public GameBoyProcessor() {
		this( new GameBoyRegisters(), new Memory() );
	}
	
	public GameBoyProcessor( IRegister registers, IMemory memory ) {
		this( registers, memory, new Opcodes() );
	}
	
	public GameBoyProcessor( IRegister registers, IMemory memory, IOpcodeMap opcodeMap ) {
		this.registers = registers;
		this.memory = memory;
		this.opcodeMap = opcodeMap;
	}
	
	@Override
	public IRegister getRegisters() {
		return this.registers;
	}
	
	@Override
	public void initialize() {
		this.opcodeMap.initializeOpcodes( this );
		
		this.registers.setRegister( Register.SP, 0xFFFE );
		this.registers.setRegister( Register.PC, 0x100 );
	}

	@Override
	public IMemory getMemory() {
		return this.memory;
	}

	@Override
	public void executeCycle() {
		// TODO execute one machine code
	}
}
