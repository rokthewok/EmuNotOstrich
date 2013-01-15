package gameBoy.memory.mocks;

import gameBoy.interfaces.IMemory;

public class MockMemoryForGraphics implements IMemory {
	public static int MEMORY_SIZE = 0xFFFF;	// 0x0000 - 0xFFFF
	private int[] memory;
	
	public MockMemoryForGraphics() {
		this.memory = new int[MEMORY_SIZE];
		
		// smiley face!
		int i = 0x8000;
		this.memory[i] = 0x1;
		this.memory[i+1] = 0x0;
		this.memory[i+2] = 0x1;
		this.memory[i+3] = 0x0;
		this.memory[i+4] = 0x29;
		this.memory[i+5] = 0x28;
		this.memory[i+6] = 0x1;
		this.memory[i+7] = 0x0;
		this.memory[i+8] = 0x83;
		this.memory[i+9] = 0x82;
		this.memory[i+10] = 0x83;
		this.memory[i+11] = 0x82;
		this.memory[i+12] = 0x45;
		this.memory[i+13] = 0x44;
		this.memory[i+14] = 0x39;
		this.memory[i+15] = 0x38;
		
		// enusre tile map all maps to tile 0
		for( int j = 0x9C00; i < 0x9C00 + 1024; i++ ) {
			this.memory[j] = 0;
		}
	}
	
	@Override
	public int get16BitValue( int address ) {
		return 0;
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
		// do nothing
	}
}
