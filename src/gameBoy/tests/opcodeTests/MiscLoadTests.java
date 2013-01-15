package gameBoy.tests.opcodeTests;

import static org.junit.Assert.*;
import gameBoy.cpu.GameBoyProcessor;
import gameBoy.cpu.Register;
import gameBoy.cpu.opcodes.load.LoadAddrImm16ToA8;
import gameBoy.interfaces.IOpcode;
import gameBoy.interfaces.IProcessor;

import org.junit.Before;
import org.junit.Test;

public class MiscLoadTests {
	private IProcessor processor;
	private IOpcode opcode;
	
	@Before
	public void setUp() throws Exception {
		this.processor = new GameBoyProcessor();
	}

	@Test
	public void testLoadImmAddr16ToRegA8() {
		this.opcode = new LoadAddrImm16ToA8( this.processor );
		int PCaddress = 0xC000;
		int immediateAddress = 0xCCCC;
		int immediate = 0xCC;
		
		this.processor.getRegisters().setRegister( Register.PC, PCaddress);
		this.processor.getMemory().set16BitValue(PCaddress + 1, immediateAddress);
		this.processor.getMemory().set8BitValue(immediateAddress, immediate);
		
		this.opcode.execute();
		
		assertEquals(immediate, this.processor.getRegisters().getRegister(Register.A));
	}
}
