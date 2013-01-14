package gameBoy.tests;

import static org.junit.Assert.*;
import gameBoy.cpu.GameBoyProcessor;
import gameBoy.cpu.GameBoyRegisters;
import gameBoy.interfaces.IMemory;
import gameBoy.interfaces.IProcessor;
import gameBoy.interfaces.IRegister;
import gameBoy.memory.Memory;

import org.junit.Test;

public class GameBoyProcessorTests {
	
	@Test
	public void testGetAndSet() {
		IMemory memory = new Memory();
		IRegister registers = new GameBoyRegisters();
		IProcessor procesor = new GameBoyProcessor( registers, memory );
		
		assertSame( memory, procesor.getMemory() );
		assertSame( registers, procesor.getRegisters() );
	}

}
