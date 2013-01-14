package gameBoy.memory;

import gameBoy.interfaces.IMemory;

public class Memory implements IMemory {
	public static int MEMORY_SIZE = 0xFFFF;	// 0x0000 - 0xFFFF
	private int[] memory;
	
	public Memory() {
		this.memory = new int[MEMORY_SIZE];
	}
	
	@Override
	public int get16BitValue( int address ) {
		if( address >= 0 || address < MEMORY_SIZE -1 ) {
			int value = this.memory[address];
			value = (short) ( value << 8 );
			value |= ( (short) ( 0x00FF & this.memory[address + 1] ) );
			return value;
		} else {
			return 0;
		}
	}
	
	@Override
	public int get8BitValue( int address ) {
		if( address >= 0 && address < MEMORY_SIZE ) {
			return this.memory[address];
		} else {
			return 0;
		}
	}

	@Override
	public void set8BitValue( int address, int data ) {
		assert address >= 0 && address < MEMORY_SIZE;
		
		this.memory[address] = data;
	}

	@Override
	public void set16BitValue( int address, int data ) {
		assert address >= 0 && address < MEMORY_SIZE -1;
		
		this.set8BitValue( address, (byte) ( ( data & 0xFF00 ) >> 8 ) );
		this.set8BitValue( address + 1, (byte) ( data & 0x00FF ) );
	}
}
