package gameBoy.tests;

import static org.junit.Assert.*;
import gameBoy.interfaces.IMemory;
import gameBoy.memory.Memory;

import org.junit.Test;

public class MemoryTests {

	@Test
	public void test8BitMemory() {
		int eightBitAddr = 0x100;
		
		IMemory memory = new Memory();
		assertEquals(  (byte) 0, memory.get8BitValue( eightBitAddr ) );
		
		memory.set8BitValue( eightBitAddr, (byte) 100 );
		assertEquals( (byte) 100, memory.get8BitValue( eightBitAddr ) );
	}

	@Test
	public void test16BitMemory() {
		int sixteenBitAddr = 0x3000;
		IMemory memory = new Memory();
		
		assertEquals( (short) 0, memory.get16BitValue( sixteenBitAddr ) );
		
		memory.set16BitValue( sixteenBitAddr, (short) 36812 );
		assertEquals( (short) 36812, memory.get16BitValue( sixteenBitAddr ) );
	}
}
