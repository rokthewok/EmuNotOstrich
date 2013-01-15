package gameBoy.tests.opcodeTests;

import static org.junit.Assert.*;
import gameBoy.cpu.GameBoyProcessor;
import gameBoy.cpu.Register;
import gameBoy.cpu.opcodes.load.loadRegToAddrReg.*;
import gameBoy.interfaces.IOpcode;
import gameBoy.interfaces.IProcessor;

import org.junit.Before;
import org.junit.Test;

public class LoadReg8ToAddrReg16 {
	private IProcessor processor;
	private IOpcode opcode;
	
	@Before
	public void setUp() throws Exception {
		this.processor = new GameBoyProcessor();
	}

	@Test
	public void testLoadAToAddrReg16() {
		this.opcode = new LoadAToAddrBC8( this.processor );
		this.loadReg8ToAddrReg16(Register.A, Register.BC);
		this.opcode = new LoadAToAddrDE8( this.processor );
		this.loadReg8ToAddrReg16(Register.A, Register.DE);
		this.opcode = new LoadAToAddrHL8( this.processor );
		this.loadReg8ToAddrReg16(Register.A, Register.HL);
	}
	
	private void loadReg8ToAddrReg16( Register reg8, Register reg16) {
		int data = 0x88;
		int address = 0x8888;
		this.processor.getRegisters().setRegister( reg8 , data);
		this.processor.getRegisters().setRegister( reg16, address );
		
		this.opcode.execute();
		
		assertEquals(data, this.processor.getMemory().get8BitValue(address));
	}

}
