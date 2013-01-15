package gameBoy.tests.opcodeTests;

import junit.framework.Assert;
import gameBoy.cpu.opcodes.load.loadImmToReg.*;
import gameBoy.cpu.GameBoyProcessor;
import gameBoy.cpu.Register;
import gameBoy.interfaces.IOpcode;
import gameBoy.interfaces.IProcessor;

import org.junit.Before;
import org.junit.Test;

public class LoadImmToRegTests {
	private IProcessor processor;
	private IOpcode opcode;
	
	@Before
	public void setUp() throws Exception {
		this.processor = new GameBoyProcessor();
	}

	@Test
	public void testLoadImm8ToReg8() {
		this.opcode = new LoadImm8ToB8( processor );
		this.loadImm8ToReg8( Register.B );
		this.opcode = new LoadImm8ToC8( processor );
		this.loadImm8ToReg8( Register.C );
		this.opcode = new LoadImm8ToD8( processor );
		this.loadImm8ToReg8( Register.D );
		this.opcode = new LoadImm8ToE8( processor );
		this.loadImm8ToReg8( Register.E );
		this.opcode = new LoadImm8ToH8( processor );
		this.loadImm8ToReg8( Register.H );
		this.opcode = new LoadImm8ToL8( processor );
		this.loadImm8ToReg8( Register.L );
		
	}
	
	private void loadImm8ToReg8(Register register) {
		int value = 30;
		int address = 0xC000;
		this.processor.getRegisters().setRegister( Register.PC, address);
		this.processor.getMemory().set8BitValue(address + 1, value);
		
		opcode.execute();
		
		Assert.assertEquals(value, this.processor.getRegisters().getRegister(register));
	}
	
	@Test
	public void testLoadImm16ToReg16() {
		this.opcode = new LoadImm16ToBC( processor );
		this.loadImm16ToReg16( Register.BC );
		this.opcode = new LoadImm16ToDE( processor );
		this.loadImm16ToReg16( Register.DE );
		this.opcode = new LoadImm16ToHL( processor );
		this.loadImm16ToReg16( Register.HL );
		
	}
	
	private void loadImm16ToReg16( Register register ) {
		short value = 3000;
		int address = 0xC000;
		this.processor.getRegisters().setRegister( Register.PC, address);
		this.processor.getMemory().set16BitValue(address + 1, value);
		
		opcode.execute();
		
		Assert.assertEquals(value, this.processor.getRegisters().getRegister(register));
	}
	
	@Test
	public void testLoadImm8ToAddrHL() {
		this.opcode = new LoadImm8ToAddrHL8( this.processor );
		
		int value = 0xFF;
		int address = 0xA000;
		//Set PC to location of opcode
		this.processor.getRegisters().setRegister( Register.PC , 0xC000 );
		//Set parameter of opcode
		this.processor.getMemory().set8BitValue(0xC001, value);
		this.processor.getRegisters().setRegister(Register.HL, address);
		
		this.opcode.execute();
		
		Assert.assertEquals(value, this.processor.getMemory().get8BitValue(address));
	}

}
