package gameBoy.tests.opcodeTests;

import static org.junit.Assert.*;
import gameBoy.cpu.Flag;
import gameBoy.cpu.GameBoyProcessor;
import gameBoy.cpu.Register;
import gameBoy.cpu.opcodes.xor.*;
import gameBoy.interfaces.IOpcode;
import gameBoy.interfaces.IProcessor;

import org.junit.Before;
import org.junit.Test;

public class XorTests {
	private IProcessor processor;
	
	@Before
	public void setUp() {
		this.processor = new GameBoyProcessor();
	}
	
	@Test
	public void testXorB() {
		IOpcode xor = new XorB( this.processor );
		
		doXorTest( xor, Register.B );
	}
	
	@Test
	public void testXorC() {
		IOpcode xor = new XorC( this.processor );
		
		doXorTest( xor, Register.C );
	}
	
	@Test
	public void testXorD() {
		IOpcode xor = new XorD( this.processor );
		
		doXorTest( xor, Register.D );
	}
	
	@Test
	public void testXorE() {
		IOpcode xor = new XorE( this.processor );
		
		doXorTest( xor, Register.E );
	}
	
	@Test
	public void testXorH() {
		IOpcode xor = new XorH( this.processor );
		
		doXorTest( xor, Register.H );
	}
	
	@Test
	public void testXorL() {
		IOpcode xor = new XorL( this.processor );
		
		doXorTest( xor, Register.L );
	}
	
	@Test
	public void testXorAddrHl() {
		IOpcode xor = new XorAddrHl( this.processor );
		
		this.processor.getMemory().set8BitValue( 0xF0, 0xF0 );
		this.processor.getMemory().set8BitValue( 0x33, 0x33 );

		doXorTest( xor, Register.HL );
	}
	
	@Test
	public void testXorImmToA() {
		IOpcode xor = new XorImmToA( this.processor );
		
		this.processor.getRegisters().setRegister( Register.PC, 0x5 );
		this.processor.getMemory().set8BitValue( 0x6, 0xF0 );
		this.processor.getRegisters().setRegister( Register.A, 0xF0 );
		
		xor.execute();
		
		assertEquals( 0x0, this.processor.getRegisters().getRegister( Register.A ) );
		assertEquals( 1, this.processor.getRegisters().getFlag( Flag.Z ) );
		assertEquals( 0, this.processor.getRegisters().getFlag( Flag.N ) );
		assertEquals( 0, this.processor.getRegisters().getFlag( Flag.H ) );
		assertEquals( 0, this.processor.getRegisters().getFlag( Flag.C ) );
		
		this.processor.getRegisters().setRegister( Register.PC, 0xACDB );
		this.processor.getMemory().set8BitValue( 0xACDC, 0x33 );
		this.processor.getRegisters().setRegister( Register.A, 0xF8 );
		
		xor.execute();
		
		assertEquals( 0xCB, this.processor.getRegisters().getRegister( Register.A ) );
		assertEquals( 0, this.processor.getRegisters().getFlag( Flag.Z ) );
		assertEquals( 0, this.processor.getRegisters().getFlag( Flag.N ) );
		assertEquals( 0, this.processor.getRegisters().getFlag( Flag.H ) );
		assertEquals( 0, this.processor.getRegisters().getFlag( Flag.C ) );
	}
	
	private void doXorTest( IOpcode xor, Register register ) {
		this.processor.getRegisters().setRegister( register, 0xF0 );
		this.processor.getRegisters().setRegister( Register.A, 0xF0 );
		
		xor.execute();
		
		assertEquals( 0x0, this.processor.getRegisters().getRegister( Register.A ) );
		assertEquals( 1, this.processor.getRegisters().getFlag( Flag.Z ) );
		assertEquals( 0, this.processor.getRegisters().getFlag( Flag.N ) );
		assertEquals( 0, this.processor.getRegisters().getFlag( Flag.H ) );
		assertEquals( 0, this.processor.getRegisters().getFlag( Flag.C ) );
		
		this.processor.getRegisters().setRegister( register, 0x33 );
		this.processor.getRegisters().setRegister( Register.A, 0xF8 );
		
		xor.execute();
		
		assertEquals( 0xCB, this.processor.getRegisters().getRegister( Register.A ) );
		assertEquals( 0, this.processor.getRegisters().getFlag( Flag.Z ) );
		assertEquals( 0, this.processor.getRegisters().getFlag( Flag.N ) );
		assertEquals( 0, this.processor.getRegisters().getFlag( Flag.H ) );
		assertEquals( 0, this.processor.getRegisters().getFlag( Flag.C ) );
	}
}
