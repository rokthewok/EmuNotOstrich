package gameBoy.tests.opcodeTests;

import static org.junit.Assert.*;
import junit.framework.Assert;
import gameBoy.cpu.GameBoyProcessor;
import gameBoy.cpu.Register;
import gameBoy.cpu.opcodes.load.loadRegToReg.LoadAToA8;
import gameBoy.cpu.opcodes.load.loadRegToReg.LoadImmToAddrHL;
import gameBoy.interfaces.IOpcode;
import gameBoy.interfaces.IProcessor;

import org.junit.Before;
import org.junit.Test;

public class LoadRegToRegTests {
	private IProcessor processor;
	private IOpcode opcode;

	@Before
	public void setUp() throws Exception {
		this.processor = new GameBoyProcessor();
	}

	@Test
	public void testLoadImmToAddrHL() {
		this.opcode = new LoadImmToAddrHL( this.processor );
		
		byte value = (byte) 0xFF;
		short address = (short) 0xC000;
		this.processor.getRegisters().setRegister( Register.PC , (short)(0xFF00));
		Assert.assertEquals((short)0xFF00, this.processor.getRegisters().getRegister(Register.PC));
		this.processor.getRegisters().setRegister(Register.HL, address);
		
		this.opcode.execute();
		
		Assert.assertEquals((byte) 0xFF, this.processor.getMemory().get8BitValue(address));
	}
	
	@Test
	public void testLoadRegToReg8() {
		this.opcode = new LoadAToA8( this.processor );
		this.loadRegToReg8(Register.A, Register.A);
	}
	
	private void loadRegToReg8( Register r1, Register r2) {
		int data = 20;
		this.processor.getRegisters().setRegister( r2, (short) data );
		
		this.opcode.execute();
		
		Assert.assertEquals( data, this.processor.getRegisters().getRegister( r1 ));
	}
}
