package gameBoy.tests;

import gameBoy.cpu.GameBoyRegisters;
import gameBoy.cpu.Flag;
import gameBoy.cpu.Register;

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
		registers.setRegister(Register.A, 12);
		Assert.assertEquals(12, registers.getRegister(Register.A));
		
		registers.setRegister(Register.DE, 257);
		Assert.assertEquals(1, registers.getRegister(Register.D));
		Assert.assertEquals(1, registers.getRegister(Register.E));
		Assert.assertEquals(257, registers.getRegister(Register.DE));
		
		registers.setRegister(Register.HL, 0xFF00);
		Assert.assertEquals(0, registers.getRegister(Register.L));
		Assert.assertEquals(0xFF, registers.getRegister(Register.H));
		Assert.assertEquals(0xFF00, registers.getRegister(Register.HL));
		
		registers.setRegister(Register.PC, 12);
		Assert.assertEquals(12, registers.getRegister(Register.PC));
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
