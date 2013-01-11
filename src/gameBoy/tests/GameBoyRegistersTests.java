package gameBoy.tests;

import gameBoy.cpu.GameBoyRegisters;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class GameBoyRegistersTests {

	private GameBoyRegisters registers;
	@Before
	public void setUp() throws Exception {
		registers = new GameBoyRegisters();
	}

	@Test
	public void testRegisters() {
		registers.setRegister(GameBoyRegisters.Register.A, (short)12);
		Assert.assertEquals(registers.getRegister(GameBoyRegisters.Register.A), 12);
		registers.setRegister(GameBoyRegisters.Register.DE, (short)12);
		Assert.assertEquals(registers.getRegister(GameBoyRegisters.Register.D), 0);
		Assert.assertEquals(registers.getRegister(GameBoyRegisters.Register.E), 12);
		registers.setRegister(GameBoyRegisters.Register.PC, (short)12);
		Assert.assertEquals(registers.getRegister(GameBoyRegisters.Register.PC), 12);
	}

}
