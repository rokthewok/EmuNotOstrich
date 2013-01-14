package gameBoy.tests.opcodeTests;

import static org.junit.Assert.*;
import gameBoy.cpu.Flag;
import gameBoy.cpu.GameBoyProcessor;
import gameBoy.cpu.Register;
import gameBoy.interfaces.IOpcode;
import gameBoy.interfaces.IProcessor;
import gameBoy.cpu.opcodes.and.*;

import org.junit.Before;
import org.junit.Test;

public class AndTests {
	private IProcessor processor;
	
	@Before
	public void setUp() {
		this.processor = new GameBoyProcessor();
	}

	@Test
	public void testAndA() {
		IOpcode and = new AndA( this.processor );
		
		this.processor.getRegisters().setRegister( Register.A, 0x0 );
		
		and.execute();
		
		assertEquals( 0x0, this.processor.getRegisters().getRegister( Register.A ) );
		assertEquals( 1, this.processor.getRegisters().getFlag( Flag.Z ) );
		assertEquals( 0, this.processor.getRegisters().getFlag( Flag.N ) );
		assertEquals( 1, this.processor.getRegisters().getFlag( Flag.H ) );
		assertEquals( 0, this.processor.getRegisters().getFlag( Flag.C ) );
		
		this.processor.getRegisters().setRegister( Register.A, 0xFF );
		
		and.execute();
		
		assertEquals( 0xFF, this.processor.getRegisters().getRegister( Register.A ) );
		assertEquals( 0, this.processor.getRegisters().getFlag( Flag.Z ) );
		assertEquals( 0, this.processor.getRegisters().getFlag( Flag.N ) );
		assertEquals( 1, this.processor.getRegisters().getFlag( Flag.H ) );
		assertEquals( 0, this.processor.getRegisters().getFlag( Flag.C ) );
	}
	
	@Test
	public void testAndB() {
		IOpcode and = new AndB( this.processor );
		
		doAndTest( and, Register.B );
	}
	
	@Test
	public void testAndC() {
		IOpcode and = new AndC( this.processor );
		
		doAndTest( and, Register.C );
	}
	
	@Test
	public void testAndD() {
		IOpcode and = new AndD( this.processor );
		
		doAndTest( and, Register.D );
	}
	
	@Test
	public void testAndE() {
		IOpcode and = new AndE( this.processor );
		
		doAndTest( and, Register.E );
	}
	
	@Test
	public void testAndH() {
		IOpcode and = new AndH( this.processor );
		
		doAndTest( and, Register.H );
	}
	
	@Test
	public void testAndL() {
		IOpcode and = new AndL( this.processor );
		
		doAndTest( and, Register.L );
	}
	
	@Test
	public void testAndAddrHl() {
		IOpcode and = new AndAddrHl( this.processor );
		
		this.processor.getMemory().set8BitValue( 0x08, 0x08 );
		this.processor.getMemory().set8BitValue( 0x0, 0x0 );
		
		assertEquals( 8, and.getCycles() );
		doAndTest( and, Register.HL );
	}
	
	@Test
	public void testAndImmToA() {
		IOpcode and = new AndImmToA( this.processor );
		
		this.processor.getRegisters().setRegister( Register.PC, 0x5 );
		this.processor.getMemory().set8BitValue( 0x6, 0x8 );
		this.processor.getRegisters().setRegister( Register.A, 0xFF );
		
		and.execute();
		
		assertEquals( 0x08, this.processor.getRegisters().getRegister( Register.A ) );
		assertEquals( 0, this.processor.getRegisters().getFlag( Flag.Z ) );
		assertEquals( 0, this.processor.getRegisters().getFlag( Flag.N ) );
		assertEquals( 1, this.processor.getRegisters().getFlag( Flag.H ) );
		assertEquals( 0, this.processor.getRegisters().getFlag( Flag.C ) );
		
		this.processor.getRegisters().setRegister( Register.PC, 0xACDB );
		this.processor.getMemory().set8BitValue( 0xACDC, 0x0 );
		this.processor.getRegisters().setRegister( Register.A, 0xF7 );
		
		and.execute();
		
		assertEquals( 0x0, this.processor.getRegisters().getRegister( Register.A ) );
		assertEquals( 1, this.processor.getRegisters().getFlag( Flag.Z ) );
		assertEquals( 0, this.processor.getRegisters().getFlag( Flag.N ) );
		assertEquals( 1, this.processor.getRegisters().getFlag( Flag.H ) );
		assertEquals( 0, this.processor.getRegisters().getFlag( Flag.C ) );
	}
	
	private void doAndTest( IOpcode and, Register register ) {
		this.processor.getRegisters().setRegister( register, 0x08 );
		this.processor.getRegisters().setRegister( Register.A, 0xFF );
		
		and.execute();
		
		assertEquals( 0x08, this.processor.getRegisters().getRegister( Register.A ) );
		assertEquals( 0, this.processor.getRegisters().getFlag( Flag.Z ) );
		assertEquals( 0, this.processor.getRegisters().getFlag( Flag.N ) );
		assertEquals( 1, this.processor.getRegisters().getFlag( Flag.H ) );
		assertEquals( 0, this.processor.getRegisters().getFlag( Flag.C ) );
		
		this.processor.getRegisters().setRegister( register, 0x0 );
		this.processor.getRegisters().setRegister( Register.A, 0xF7 );
		
		and.execute();
		
		assertEquals( 0x0, this.processor.getRegisters().getRegister( Register.A ) );
		assertEquals( 1, this.processor.getRegisters().getFlag( Flag.Z ) );
		assertEquals( 0, this.processor.getRegisters().getFlag( Flag.N ) );
		assertEquals( 1, this.processor.getRegisters().getFlag( Flag.H ) );
		assertEquals( 0, this.processor.getRegisters().getFlag( Flag.C ) );
	}
}
