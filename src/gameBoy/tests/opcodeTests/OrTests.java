package gameBoy.tests.opcodeTests;

import static org.junit.Assert.*;
import gameBoy.cpu.Flag;
import gameBoy.cpu.GameBoyProcessor;
import gameBoy.cpu.Register;
import gameBoy.cpu.opcodes.or.*;
import gameBoy.interfaces.IOpcode;
import gameBoy.interfaces.IProcessor;

import org.junit.Before;
import org.junit.Test;

public class OrTests {
	private IProcessor processor;
	
	@Before
	public void setUp() {
		this.processor = new GameBoyProcessor();
	}
	
	@Test
	public void testOrB() {
		IOpcode or = new OrB( this.processor );
		
		doOrTest( or, Register.B );
	}
	
	@Test
	public void testOrC() {
		IOpcode or = new OrC( this.processor );
		
		doOrTest( or, Register.C );
	}
	
	@Test
	public void testOrD() {
		IOpcode or = new OrD( this.processor );
		
		doOrTest( or, Register.D );
	}
	
	@Test
	public void testOrE() {
		IOpcode or = new OrE( this.processor );
		
		doOrTest( or, Register.E );
	}
	
	@Test
	public void testOrH() {
		IOpcode or = new OrH( this.processor );
		
		doOrTest( or, Register.H );
	}
	
	@Test
	public void testOrL() {
		IOpcode or = new OrL( this.processor );
		
		doOrTest( or, Register.L );
	}
	
	@Test
	public void testOrAddrHl() {
		IOpcode or = new OrAddrHl( this.processor );
		
		this.processor.getMemory().set8BitValue( 0x08, 0x08 );
		this.processor.getMemory().set8BitValue( 0x0, 0x0 );
		
		doOrTest( or, Register.HL );
	}
	
	@Test
	public void testOrImmToA() {
		IOpcode or = new OrImmToA( this.processor );
		
		this.processor.getRegisters().setRegister( Register.PC, 0x5 );
		this.processor.getMemory().set8BitValue( 0x6, 0x8 );
		this.processor.getRegisters().setRegister( Register.A, 0xF0 );
		
		or.execute();
		
		assertEquals( 0xF8, this.processor.getRegisters().getRegister( Register.A ) );
		assertEquals( 0, this.processor.getRegisters().getFlag( Flag.Z ) );
		assertEquals( 0, this.processor.getRegisters().getFlag( Flag.N ) );
		assertEquals( 0, this.processor.getRegisters().getFlag( Flag.H ) );
		assertEquals( 0, this.processor.getRegisters().getFlag( Flag.C ) );
		
		this.processor.getRegisters().setRegister( Register.PC, 0xACDB );
		this.processor.getMemory().set8BitValue( 0xACDC, 0x0 );
		this.processor.getRegisters().setRegister( Register.A, 0x0 );
		
		or.execute();
		
		assertEquals( 0x0, this.processor.getRegisters().getRegister( Register.A ) );
		assertEquals( 1, this.processor.getRegisters().getFlag( Flag.Z ) );
		assertEquals( 0, this.processor.getRegisters().getFlag( Flag.N ) );
		assertEquals( 0, this.processor.getRegisters().getFlag( Flag.H ) );
		assertEquals( 0, this.processor.getRegisters().getFlag( Flag.C ) );
	}
	
	private void doOrTest( IOpcode or, Register register ) {
		this.processor.getRegisters().setRegister( register, 0x08 );
		this.processor.getRegisters().setRegister( Register.A, 0xF0 );
		
		or.execute();
		
		assertEquals( 0xF8, this.processor.getRegisters().getRegister( Register.A ) );
		assertEquals( 0, this.processor.getRegisters().getFlag( Flag.Z ) );
		assertEquals( 0, this.processor.getRegisters().getFlag( Flag.N ) );
		assertEquals( 0, this.processor.getRegisters().getFlag( Flag.H ) );
		assertEquals( 0, this.processor.getRegisters().getFlag( Flag.C ) );
		
		this.processor.getRegisters().setRegister( register, 0x0 );
		this.processor.getRegisters().setRegister( Register.A, 0x0 );
		
		or.execute();
		
		assertEquals( 0x0, this.processor.getRegisters().getRegister( Register.A ) );
		assertEquals( 1, this.processor.getRegisters().getFlag( Flag.Z ) );
		assertEquals( 0, this.processor.getRegisters().getFlag( Flag.N ) );
		assertEquals( 0, this.processor.getRegisters().getFlag( Flag.H ) );
		assertEquals( 0, this.processor.getRegisters().getFlag( Flag.C ) );
	}
}
