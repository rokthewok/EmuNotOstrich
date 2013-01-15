package gameBoy.tests.opcodeTests;

import gameBoy.cpu.GameBoyProcessor;
import gameBoy.cpu.Register;
import gameBoy.cpu.opcodes.load.loadRegToAddrReg.*;
import gameBoy.interfaces.IOpcode;
import gameBoy.interfaces.IProcessor;
import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

public class LoadRegToAddrRegTests {
	private IProcessor processor;
	private IOpcode opcode;

	@Before
	public void setUp() throws Exception {
		this.processor = new GameBoyProcessor();
	}

	@Test
	public void testLoadRegToAddrHL8() {
		this.opcode = new LoadBToAddrHL8( this.processor );
		this.loadRegToAddrHL8( Register.B );
		this.opcode = new LoadCToAddrHL8( this.processor );
		this.loadRegToAddrHL8( Register.C );
		this.opcode = new LoadDToAddrHL8( this.processor );
		this.loadRegToAddrHL8( Register.D );
		this.opcode = new LoadEToAddrHL8( this.processor );
		this.loadRegToAddrHL8( Register.E );
		this.opcode = new LoadHToAddrHL8( this.processor );
		this.loadRegToAddrHL8( Register.H );
		this.opcode = new LoadLToAddrHL8( this.processor );
		this.loadRegToAddrHL8( Register.L );
	}
	
	private void loadRegToAddrHL8( Register register ) {
		int address = 0xC000;
		int data = 20;
		this.processor.getRegisters().setRegister( Register.HL, address);
		this.processor.getRegisters().setRegister( register, data );
		
		this.opcode.execute();
		
		Assert.assertEquals(data, this.processor.getMemory().get8BitValue(address));
	}
	
	@Test
	public void testLoadAToAddrHLThenDecHL() {
		this.opcode = new LoadAToAddrHLThenDecHL( this.processor );
		int address = 0xC000;
		int data = 20;
		this.processor.getRegisters().setRegister( Register.HL, address);
		this.processor.getRegisters().setRegister( Register.A, data );
		
		this.opcode.execute();
		
		Assert.assertEquals(data, this.processor.getMemory().get8BitValue(address));
		address--;
		Assert.assertEquals(address, this.processor.getRegisters().getRegister( Register.HL ));
		
	}
}
