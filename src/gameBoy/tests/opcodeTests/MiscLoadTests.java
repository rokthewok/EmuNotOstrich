package gameBoy.tests.opcodeTests;

import static org.junit.Assert.*;
import gameBoy.cpu.GameBoyProcessor;
import gameBoy.cpu.Register;
import gameBoy.cpu.opcodes.load.*;
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
	public void testLoadRegA8ToImmAddr16() {
		this.opcode = new LoadA8ToAddrImm16( this.processor ); 
		int PCaddress = 0xC000;
		int immediate = 0xCCCC;
		int A8value = 0xCC;
		
		this.processor.getRegisters().setRegister( Register.PC, PCaddress);
		this.processor.getMemory().set16BitValue(PCaddress + 1, immediate);
		this.processor.getRegisters().setRegister( Register.A , A8value );
		
		this.opcode.execute();
		
		assertEquals(A8value, this.processor.getMemory().get8BitValue(immediate));
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
	
	@Test 
	public void testLoadAddrFF00PlusCToA() {
		this.opcode = new LoadAddrFF00PlusCToA( this.processor );
		int data = 0xDC;
		int cData = 0xCC;
		this.processor.getRegisters().setRegister(Register.C, cData);
		this.processor.getMemory().set8BitValue(0xFF00 + cData, data);
		
		this.opcode.execute();
		
		assertEquals( data, this.processor.getRegisters().getRegister( Register.A ));
	}
	
	@Test
	public void testLoadAToAddrFF00PlusC() {
		this.opcode = new LoadAToAddrFF00PlusC( this.processor );
		int data = 0xDC;
		int cData = 0xCC;
		this.processor.getRegisters().setRegister( Register.A , data);
		this.processor.getRegisters().setRegister( Register.C, cData);
		
		this.opcode.execute();
		
		assertEquals( data, this.processor.getMemory().get8BitValue(0xFF00 + cData) );
	}
	
	@Test 
	public void testLoadAToAddrFF00PlusImm8() {
		this.opcode = new LoadAToAddrFF00PlusImm8( this.processor );
		int data = 0xDC;
		int pcAddress = 0xDCDC;
		int immData = 0xCC;
		this.processor.getRegisters().setRegister( Register.A , data);
		this.processor.getRegisters().setRegister(Register.PC, pcAddress);
		this.processor.getMemory().set8BitValue(pcAddress + 1, immData);
		
		this.opcode.execute();
		
		assertEquals( data, this.processor.getMemory().get8BitValue(0xFF00 + immData) );
	}
	
	@Test
	public void testAddrFF00PlusImm8ToA8() {
		this.opcode = new LoadAddrFF00PlusImm8ToA8( this.processor );
		int data = 0xDC;
		int pcAddress = 0xDCDC;
		int immData = 0xDD;
		this.processor.getRegisters().setRegister(Register.PC, pcAddress);
		this.processor.getMemory().set8BitValue(pcAddress + 1, immData);
		this.processor.getMemory().set8BitValue(0xFF00 + immData, data);
		
		this.opcode.execute();
		
		assertEquals( data, this.processor.getRegisters().getRegister( Register.A ));
	}
	
	@Test
	public void testLoadSPToAddrImm16() {
		this.opcode = new LoadSPToAddrImm16( this.processor );
		int immediate = 0xFFF0;
		int spData = 0xAAAA;
		int pcData = 0xCCCC;
		this.processor.getRegisters().setRegister( Register.SP, spData );
		this.processor.getRegisters().setRegister( Register.PC , pcData );
		this.processor.getMemory().set16BitValue( pcData + 1, immediate );
		
		this.opcode.execute();
		
		assertEquals( spData, this.processor.getMemory().get16BitValue(immediate));
		assertEquals(20, this.opcode.getCycles() );
	}
	
	@Test
	public void testLoadSPPlusSignedImm8IntoHL() {
		this.opcode = new LoadSPPlusSignedImm8IntoHL( this.processor );
		int spData = 0xCCCC;
		int immediate = 0x0A;
		int pcData = 0xDDDD;
		this.processor.getRegisters().setRegister(Register.SP, spData);
		this.processor.getRegisters().setRegister(Register.PC, pcData);
		this.processor.getMemory().set8BitValue(pcData + 1, immediate);
		
		this.opcode.execute();
		
		assertEquals(spData + immediate, this.processor.getRegisters().getRegister(Register.HL));
		
		immediate = 0xDC;
		this.processor.getMemory().set8BitValue(pcData + 1, immediate);
		
		this.opcode.execute();
		
		assertEquals(spData + (byte) immediate, this.processor.getRegisters().getRegister(Register.HL));
		assertEquals(12, this.opcode.getCycles());
	}
}
