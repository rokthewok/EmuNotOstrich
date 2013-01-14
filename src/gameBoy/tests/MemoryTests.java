package gameBoy.tests;

import static org.junit.Assert.*;
import gameBoy.cpu.GameBoyProcessor;
import gameBoy.cpu.Register;
import gameBoy.interfaces.IMemory;
import gameBoy.interfaces.IProcessor;
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
		assertEquals( 36812, memory.get16BitValue( sixteenBitAddr ) );
	}
	
	@Test
	public void testOverflow() {
		IProcessor processor = new GameBoyProcessor();
		processor.getRegisters().setRegister( Register.SP, 0xFFFE );
		processor.getMemory().set8BitValue( 0xFFFE, 15 );
		
		int actual = processor.getMemory().get8BitValue( processor.getRegisters().getRegister( Register.SP ) );
		
		assertEquals( 15, actual );
	}
}
