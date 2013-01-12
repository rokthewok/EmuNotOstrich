package gameBoy.tests;

import gameBoy.cpu.GameBoyRegisters;
import gameBoy.cpu.GameBoyRegisters.Flag;

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
		Assert.assertEquals(12, registers.getRegister(GameBoyRegisters.Register.A));
		
		registers.setRegister(GameBoyRegisters.Register.DE, (short)257);
		Assert.assertEquals(1, registers.getRegister(GameBoyRegisters.Register.D));
		Assert.assertEquals(1, registers.getRegister(GameBoyRegisters.Register.E));
		Assert.assertEquals(257, registers.getRegister(GameBoyRegisters.Register.DE));
		
		registers.setRegister(GameBoyRegisters.Register.PC, (short)12);
		Assert.assertEquals(12, registers.getRegister(GameBoyRegisters.Register.PC));
	}
	
	public void testFlags() {
		registers.setFlagTo(Flag.Z, true);
		Assert.assertEquals(registers.getFlag(Flag.Z), 1);
		
		registers.setFlagTo(Flag.Z, false);
		Assert.assertEquals(registers.getFlag(Flag.Z), 0);
		
		registers.setFlagTo(Flag.H, true);
		Assert.assertEquals(registers.getFlag(Flag.H), 1);
		Assert.assertEquals(registers.getFlag(Flag.Z), 0);
	}

}
