package gameBoy.tests.opcodeTests;

import static org.junit.Assert.*;
import gameBoy.cpu.Flag;
import gameBoy.cpu.GameBoyProcessor;
import gameBoy.cpu.Register;
import gameBoy.cpu.opcodes.subtract.*;
import gameBoy.interfaces.IOpcode;
import gameBoy.interfaces.IProcessor;

import org.junit.Before;
import org.junit.Test;

public class SubtractionTests {
	private IProcessor processor;
	
	@Before
	public void setUp() throws Exception {
		this.processor = new GameBoyProcessor();
	}

	@Test
	public void testSubB() {
		IOpcode sub = new SubB( this.processor );
		
		doSubTest( sub, Register.B );
	}
	
	@Test
	public void testSubC() {
		IOpcode sub = new SubC( this.processor );
		
		doSubTest( sub, Register.C );
	}
	
	@Test
	public void testSubD() {
		IOpcode sub = new SubD( this.processor );
		
		doSubTest( sub, Register.D );
	}
	
	@Test
	public void testSubE() {
		IOpcode sub = new SubE( this.processor );
		
		doSubTest( sub, Register.E );
	}
	
	@Test
	public void testSubH() {
		IOpcode sub = new SubH( this.processor );
		
		doSubTest( sub, Register.H );
	}
	
	@Test
	public void testSubL() {
		IOpcode sub = new SubL( this.processor );
		
		doSubTest( sub, Register.L );
	}
	
	@Test
	public void testSubAddrHl() {
		IOpcode sub = new SubAddrHl( this.processor );
		
		this.processor.getMemory().set8BitValue( 0xD, 0xD );
		this.processor.getMemory().set8BitValue( 0x24, 0x24 );
		this.processor.getMemory().set8BitValue( 0x44, 0x44 );
		this.processor.getMemory().set8BitValue( 0x4D, 0x4D );
		
		doSubTest( sub, Register.HL );
	}
	
	@Test
	public void testSubA() {
		IOpcode sub = new SubA( this.processor );
		
		this.processor.getRegisters().setRegister( Register.A, 0x2A );	// 42
		
		sub.execute();
		
		assertEquals( 0x0, this.processor.getRegisters().getRegister( Register.A ) );	// Always zero
		assertEquals( 1, this.processor.getRegisters().getFlag( Flag.Z ) );
		assertEquals( 1, this.processor.getRegisters().getFlag( Flag.N ) );
		assertEquals( 0, this.processor.getRegisters().getFlag( Flag.H ) );
		assertEquals( 0, this.processor.getRegisters().getFlag( Flag.C ) );
	}

	public void doSubTest( IOpcode sub, Register register ) {
		this.processor.getRegisters().setRegister( Register.A, 0x2A );	// 42
		this.processor.getRegisters().setRegister( register, 0xD );		// 13
		
		sub.execute();
		
		assertEquals( 0x1D, this.processor.getRegisters().getRegister( Register.A ) );	// 29
		assertEquals( 0, this.processor.getRegisters().getFlag( Flag.Z ) );
		assertEquals( 1, this.processor.getRegisters().getFlag( Flag.N ) );
		assertEquals( 1, this.processor.getRegisters().getFlag( Flag.H ) );
		assertEquals( 0, this.processor.getRegisters().getFlag( Flag.C ) );
		
		this.processor.getRegisters().setRegister( Register.A, 0x6D );	// 109
		this.processor.getRegisters().setRegister( register, 0x24 );	// 36
		
		sub.execute();
		
		assertEquals( 0x49, this.processor.getRegisters().getRegister( Register.A ) );	// 73
		assertEquals( 0, this.processor.getRegisters().getFlag( Flag.Z ) );
		assertEquals( 1, this.processor.getRegisters().getFlag( Flag.N ) );
		assertEquals( 0, this.processor.getRegisters().getFlag( Flag.H ) );
		assertEquals( 0, this.processor.getRegisters().getFlag( Flag.C ) );
		
		this.processor.getRegisters().setRegister( Register.A, 0x39 );	// 57
		this.processor.getRegisters().setRegister( register, 0x44 );	// 68
		
		sub.execute();
		
		assertEquals( 0xFFFFFFF5, this.processor.getRegisters().getRegister( Register.A ) );	// -11
		assertEquals( 0, this.processor.getRegisters().getFlag( Flag.Z ) );
		assertEquals( 1, this.processor.getRegisters().getFlag( Flag.N ) );
		assertEquals( 0, this.processor.getRegisters().getFlag( Flag.H ) );
		assertEquals( 1, this.processor.getRegisters().getFlag( Flag.C ) );
		
		this.processor.getRegisters().setRegister( Register.A, 0x3A );	// 58
		this.processor.getRegisters().setRegister( register, 0x4D );	// 77
		
		sub.execute();
		
		assertEquals( 0xFFFFFFED, this.processor.getRegisters().getRegister( Register.A ) );	// -19
		assertEquals( 0, this.processor.getRegisters().getFlag( Flag.Z ) );
		assertEquals( 1, this.processor.getRegisters().getFlag( Flag.N ) );
		assertEquals( 1, this.processor.getRegisters().getFlag( Flag.H ) );
		assertEquals( 1, this.processor.getRegisters().getFlag( Flag.C ) );
	}
}
