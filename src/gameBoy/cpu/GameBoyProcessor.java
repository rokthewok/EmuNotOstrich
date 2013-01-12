package gameBoy.cpu;

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
	
	private void switchHighNibble( byte opcode ) {
		byte highNibble = (byte) ( opcode >> 4 );
		byte lowNibble = (byte) ( opcode & 0x0F );
		
		switch( highNibble ) {
		case 0x0:
			this.switch0LowNibble( opcode, lowNibble );
			break;
		case 0x1:
			this.switch1LowNibble( opcode, lowNibble );
			break;
		case 0x2:
			this.switch2LowNibble( opcode, lowNibble );
			break;
		case 0x3:
			this.switch3LowNibble( opcode, lowNibble );
			break;
		case 0x4:
			this.switch4LowNibble( opcode, lowNibble );
			break;
		case 0x5:
			this.switch5LowNibble( opcode, lowNibble );
			break;
		case 0x6:
			this.switch6LowNibble( opcode, lowNibble );
			break;
		case 0x7:
			this.switch7LowNibble( opcode, lowNibble );
			break;
		case 0x8:
			this.switch8LowNibble( opcode, lowNibble );
			break;
		case 0x9:
			this.switch9LowNibble( opcode, lowNibble );
			break;
		case 0xA:
			this.switchALowNibble( opcode, lowNibble );
			break;
		case 0xB:
			this.switchBLowNibble( opcode, lowNibble );
			break;
		case 0xC:
			this.switchCLowNibble( opcode, lowNibble );
			break;
		case 0xD:
			this.switchDLowNibble( opcode, lowNibble );
			break;
		case 0xE:
			this.switchELowNibble( opcode, lowNibble );
			break;
		case 0xF:
			this.switchFLowNibble( opcode, lowNibble );
			break;
		default:
			System.out.printf( "Opcode 0x%2x not valid or implemented opcode", opcode );
			break;
		}
	}
	
	private void switch0LowNibble( byte opcode, byte lowNibble ) {
		switch( lowNibble ) {
		case 0x0:
			break;
		case 0x1:
			break;
		case 0x2:
			break;
		case 0x3:
			break;
		case 0x4:
			break;
		case 0x5:
			break;
		case 0x6:
			break;
		case 0x7:
			break;
		case 0x8:
			break;
		case 0x9:
			break;
		case 0xA:
			break;
		case 0xB:
			break;
		case 0xC:
			break;
		case 0xD:
			break;
		case 0xE:
			break;
		case 0xF:
			break;
		default:
			System.out.printf( "Opcode 0x%2x not valid or implemented opcode", opcode );
			break;
		}
	}
	
	private void switch1LowNibble( byte opcode, byte lowNibble ) {
		switch( lowNibble ) {
		case 0x0:
			break;
		case 0x1:
			break;
		case 0x2:
			break;
		case 0x3:
			break;
		case 0x4:
			break;
		case 0x5:
			break;
		case 0x6:
			break;
		case 0x7:
			break;
		case 0x8:
			break;
		case 0x9:
			break;
		case 0xA:
			break;
		case 0xB:
			break;
		case 0xC:
			break;
		case 0xD:
			break;
		case 0xE:
			break;
		case 0xF:
			break;
		default:
			System.out.printf( "Opcode 0x%2x not valid or implemented opcode", opcode );
			break;
		}
	}
	
	private void switch2LowNibble( byte opcode, byte lowNibble ) {
		switch( lowNibble ) {
		case 0x0:
			break;
		case 0x1:
			break;
		case 0x2:
			break;
		case 0x3:
			break;
		case 0x4:
			break;
		case 0x5:
			break;
		case 0x6:
			break;
		case 0x7:
			break;
		case 0x8:
			break;
		case 0x9:
			break;
		case 0xA:
			break;
		case 0xB:
			break;
		case 0xC:
			break;
		case 0xD:
			break;
		case 0xE:
			break;
		case 0xF:
			break;
		default:
			System.out.printf( "Opcode 0x%2x not valid or implemented opcode", opcode );
			break;
		}
	}
	
	private void switch3LowNibble( byte opcode, byte lowNibble ) {
		switch( lowNibble ) {
		case 0x0:
			break;
		case 0x1:
			break;
		case 0x2:
			break;
		case 0x3:
			break;
		case 0x4:
			break;
		case 0x5:
			break;
		case 0x6:
			break;
		case 0x7:
			break;
		case 0x8:
			break;
		case 0x9:
			break;
		case 0xA:
			break;
		case 0xB:
			break;
		case 0xC:
			break;
		case 0xD:
			break;
		case 0xE:
			break;
		case 0xF:
			break;
		default:
			System.out.printf( "Opcode 0x%2x not valid or implemented opcode", opcode );
			break;
		}
	}
	
	private void switch4LowNibble( byte opcode, byte lowNibble ) {
		switch( lowNibble ) {
		case 0x0:
			break;
		case 0x1:
			break;
		case 0x2:
			break;
		case 0x3:
			break;
		case 0x4:
			break;
		case 0x5:
			break;
		case 0x6:
			break;
		case 0x7:
			break;
		case 0x8:
			break;
		case 0x9:
			break;
		case 0xA:
			break;
		case 0xB:
			break;
		case 0xC:
			break;
		case 0xD:
			break;
		case 0xE:
			break;
		case 0xF:
			break;
		default:
			System.out.printf( "Opcode 0x%2x not valid or implemented opcode", opcode );
			break;
		}
	}
	
	private void switch5LowNibble( byte opcode, byte lowNibble ) {
		switch( lowNibble ) {
		case 0x0:
			break;
		case 0x1:
			break;
		case 0x2:
			break;
		case 0x3:
			break;
		case 0x4:
			break;
		case 0x5:
			break;
		case 0x6:
			break;
		case 0x7:
			break;
		case 0x8:
			break;
		case 0x9:
			break;
		case 0xA:
			break;
		case 0xB:
			break;
		case 0xC:
			break;
		case 0xD:
			break;
		case 0xE:
			break;
		case 0xF:
			break;
		default:
			System.out.printf( "Opcode 0x%2x not valid or implemented opcode", opcode );
			break;
		}
	}
	
	private void switch6LowNibble( byte opcode, byte lowNibble ) {
		switch( lowNibble ) {
		case 0x0:
			break;
		case 0x1:
			break;
		case 0x2:
			break;
		case 0x3:
			break;
		case 0x4:
			break;
		case 0x5:
			break;
		case 0x6:
			break;
		case 0x7:
			break;
		case 0x8:
			break;
		case 0x9:
			break;
		case 0xA:
			break;
		case 0xB:
			break;
		case 0xC:
			break;
		case 0xD:
			break;
		case 0xE:
			break;
		case 0xF:
			break;
		default:
			System.out.printf( "Opcode 0x%2x not valid or implemented opcode", opcode );
			break;
		}
	}
	
	private void switch7LowNibble( byte opcode, byte lowNibble ) {
		switch( lowNibble ) {
		case 0x0:
			break;
		case 0x1:
			break;
		case 0x2:
			break;
		case 0x3:
			break;
		case 0x4:
			break;
		case 0x5:
			break;
		case 0x6:
			break;
		case 0x7:
			break;
		case 0x8:
			break;
		case 0x9:
			break;
		case 0xA:
			break;
		case 0xB:
			break;
		case 0xC:
			break;
		case 0xD:
			break;
		case 0xE:
			break;
		case 0xF:
			break;
		default:
			System.out.printf( "Opcode 0x%2x not valid or implemented opcode", opcode );
			break;
		}
	}
	
	private void switch8LowNibble( byte opcode, byte lowNibble ) {
		switch( lowNibble ) {
		case 0x0:
			break;
		case 0x1:
			break;
		case 0x2:
			break;
		case 0x3:
			break;
		case 0x4:
			break;
		case 0x5:
			break;
		case 0x6:
			break;
		case 0x7:
			break;
		case 0x8:
			break;
		case 0x9:
			break;
		case 0xA:
			break;
		case 0xB:
			break;
		case 0xC:
			break;
		case 0xD:
			break;
		case 0xE:
			break;
		case 0xF:
			break;
		default:
			System.out.printf( "Opcode 0x%2x not valid or implemented opcode", opcode );
			break;
		}
	}
	
	private void switch9LowNibble( byte opcode, byte lowNibble ) {
		switch( lowNibble ) {
		case 0x0:
			break;
		case 0x1:
			break;
		case 0x2:
			break;
		case 0x3:
			break;
		case 0x4:
			break;
		case 0x5:
			break;
		case 0x6:
			break;
		case 0x7:
			break;
		case 0x8:
			break;
		case 0x9:
			break;
		case 0xA:
			break;
		case 0xB:
			break;
		case 0xC:
			break;
		case 0xD:
			break;
		case 0xE:
			break;
		case 0xF:
			break;
		default:
			System.out.printf( "Opcode 0x%2x not valid or implemented opcode", opcode );
			break;
		}
	}
	
	private void switchALowNibble( byte opcode, byte lowNibble ) {
		switch( lowNibble ) {
		case 0x0:
			break;
		case 0x1:
			break;
		case 0x2:
			break;
		case 0x3:
			break;
		case 0x4:
			break;
		case 0x5:
			break;
		case 0x6:
			break;
		case 0x7:
			break;
		case 0x8:
			break;
		case 0x9:
			break;
		case 0xA:
			break;
		case 0xB:
			break;
		case 0xC:
			break;
		case 0xD:
			break;
		case 0xE:
			break;
		case 0xF:
			break;
		default:
			System.out.printf( "Opcode 0x%2x not valid or implemented opcode", opcode );
			break;
		}
	}
	
	private void switchBLowNibble( byte opcode, byte lowNibble ) {
		switch( lowNibble ) {
		case 0x0:
			break;
		case 0x1:
			break;
		case 0x2:
			break;
		case 0x3:
			break;
		case 0x4:
			break;
		case 0x5:
			break;
		case 0x6:
			break;
		case 0x7:
			break;
		case 0x8:
			break;
		case 0x9:
			break;
		case 0xA:
			break;
		case 0xB:
			break;
		case 0xC:
			break;
		case 0xD:
			break;
		case 0xE:
			break;
		case 0xF:
			break;
		default:
			System.out.printf( "Opcode 0x%2x not valid or implemented opcode", opcode );
			break;
		}
	}
	
	private void switchCLowNibble( byte opcode, byte lowNibble ) {
		switch( lowNibble ) {
		case 0x0:
			break;
		case 0x1:
			break;
		case 0x2:
			break;
		case 0x3:
			break;
		case 0x4:
			break;
		case 0x5:
			break;
		case 0x6:
			break;
		case 0x7:
			break;
		case 0x8:
			break;
		case 0x9:
			break;
		case 0xA:
			break;
		case 0xB:
			break;
		case 0xC:
			break;
		case 0xD:
			break;
		case 0xE:
			break;
		case 0xF:
			break;
		default:
			System.out.printf( "Opcode 0x%2x not valid or implemented opcode", opcode );
			break;
		}
	}
	
	private void switchDLowNibble( byte opcode, byte lowNibble ) {
		switch( lowNibble ) {
		case 0x0:
			break;
		case 0x1:
			break;
		case 0x2:
			break;
		case 0x3:
			break;
		case 0x4:
			break;
		case 0x5:
			break;
		case 0x6:
			break;
		case 0x7:
			break;
		case 0x8:
			break;
		case 0x9:
			break;
		case 0xA:
			break;
		case 0xB:
			break;
		case 0xC:
			break;
		case 0xD:
			break;
		case 0xE:
			break;
		case 0xF:
			break;
		default:
			System.out.printf( "Opcode 0x%2x not valid or implemented opcode", opcode );
			break;
		}
	}
	
	private void switchELowNibble( byte opcode, byte lowNibble ) {
		switch( lowNibble ) {
		case 0x0:
			break;
		case 0x1:
			break;
		case 0x2:
			break;
		case 0x3:
			break;
		case 0x4:
			break;
		case 0x5:
			break;
		case 0x6:
			break;
		case 0x7:
			break;
		case 0x8:
			break;
		case 0x9:
			break;
		case 0xA:
			break;
		case 0xB:
			break;
		case 0xC:
			break;
		case 0xD:
			break;
		case 0xE:
			break;
		case 0xF:
			break;
		default:
			System.out.printf( "Opcode 0x%2x not valid or implemented opcode", opcode );
			break;
		}
	}
	
	private void switchFLowNibble( byte opcode, byte lowNibble ) {
		switch( lowNibble ) {
		case 0x0:
			break;
		case 0x1:
			break;
		case 0x2:
			break;
		case 0x3:
			break;
		case 0x4:
			break;
		case 0x5:
			break;
		case 0x6:
			break;
		case 0x7:
			break;
		case 0x8:
			break;
		case 0x9:
			break;
		case 0xA:
			break;
		case 0xB:
			break;
		case 0xC:
			break;
		case 0xD:
			break;
		case 0xE:
			break;
		case 0xF:
			break;
		default:
			System.out.printf( "Opcode 0x%2x not valid or implemented opcode", opcode );
			break;
		}
	}
}
