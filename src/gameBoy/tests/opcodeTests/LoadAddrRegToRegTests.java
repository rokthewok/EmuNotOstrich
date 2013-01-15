package gameBoy.tests.opcodeTests;

import junit.framework.Assert;
import gameBoy.cpu.GameBoyProcessor;
import gameBoy.cpu.Register;
import gameBoy.cpu.opcodes.load.loadAddrReg16toReg8.*;
import gameBoy.interfaces.IOpcode;
import gameBoy.interfaces.IProcessor;

import org.junit.Before;
import org.junit.Test;

public class LoadAddrRegToRegTests {
	private IProcessor processor;
	private IOpcode opcode;
	
	@Before
	public void setUp() throws Exception {
		this.processor = new GameBoyProcessor();
	}

	@Test
	public void testLoadAddrHLToReg8() {
		this.opcode = new LoadAddrHLToA8( this.processor );
		this.loadAddrReg16ToReg8( Register.A, Register.HL);
		this.opcode = new LoadAddrHLToB8( this.processor );
		this.loadAddrReg16ToReg8( Register.B, Register.HL);
		this.opcode = new LoadAddrHLToC8( this.processor );
		this.loadAddrReg16ToReg8( Register.C, Register.HL);
		this.opcode = new LoadAddrHLToD8( this.processor );
		this.loadAddrReg16ToReg8( Register.D, Register.HL);
		this.opcode = new LoadAddrHLToE8( this.processor );
		this.loadAddrReg16ToReg8( Register.E, Register.HL);
		this.opcode = new LoadAddrHLToH8( this.processor );
		this.loadAddrReg16ToReg8( Register.H, Register.HL);
		this.opcode = new LoadAddrHLToL8( this.processor );
		this.loadAddrReg16ToReg8( Register.L, Register.HL);
	}
	
	@Test
	public void testLoadAddrReg16ToA8() {
		this.opcode = new LoadAddrBCToA8( this.processor );
		this.loadAddrReg16ToReg8( Register.A, Register.BC );
		this.opcode = new LoadAddrDEToA8( this.processor );
		this.loadAddrReg16ToReg8( Register.A, Register.DE );
		this.opcode = new LoadAddrHLToA8( this.processor );
		this.loadAddrReg16ToReg8( Register.A, Register.HL );
	}
	
	private void loadAddrReg16ToReg8( Register register , Register addr ) {
		int address = 0xC000;
		int data = 20;
		this.processor.getMemory().set8BitValue(address, data);
		this.processor.getRegisters().setRegister(addr, address);
		
		this.opcode.execute();
		
		Assert.assertEquals(data, this.processor.getRegisters().getRegister(register));
	}
	
	@Test
	public void LoadAddrHLToAThenDecHL() {
		this.opcode = new LoadAddrHLToAThenIncHL( this.processor );
		int address = 0xC000;
		int data = 20;
		this.processor.getMemory().set8BitValue(address, data);
		this.processor.getRegisters().setRegister(Register.HL, address);
		
		this.opcode.execute();
		address--;
		
		Assert.assertEquals(data, this.processor.getRegisters().getRegister(Register.A));
		
		Assert.assertEquals(address, this.processor.getRegisters().getRegister(Register.HL));
	}
	
}
