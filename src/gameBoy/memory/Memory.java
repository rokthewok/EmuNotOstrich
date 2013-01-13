package gameBoy.memory;

import gameBoy.interfaces.IMemory;

public class Memory implements IMemory {
	public static int MEMORY_SIZE = 8192 * 1024;	// 8kB of memory
	private byte[] memory;
	
	public Memory() {
		this.memory = new byte[MEMORY_SIZE];
	}
	
	@Override
	public short get16BitValue( int address ) {
		if( address >= 0 || address < MEMORY_SIZE -1 ) {
			short value = this.memory[address];
			value = (short) ( value << 8 );
			value |= ( (short) ( 0x00FF & this.memory[address + 1] ) );
			return value;
		} else {
			return 0;
		}
	}
	
	@Override
	public byte get8BitValue( int address ) {
		if( address >= 0 || address < MEMORY_SIZE ) {
			return this.memory[address];
		} else {
			return 0;
		}
	}

	@Override
	public void set8BitValue( int address, byte data ) {
		assert address >= 0 && address < MEMORY_SIZE;
		
		this.memory[address] = data;
	}

	@Override
	public void set16BitValue( int address, short data ) {
		assert address >= 0 && address < MEMORY_SIZE -1;
		
		this.set8BitValue( address, (byte) ( ( data & 0xFF00 ) >> 8 ) );
		this.set8BitValue( address + 1, (byte) ( data & 0x00FF ) );
	}
}
