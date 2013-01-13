package gameBoy.tests.opcodeTests;

import static org.junit.Assert.*;
import gameBoy.cpu.Flag;
import gameBoy.cpu.GameBoyProcessor;
import gameBoy.cpu.Register;
import gameBoy.cpu.opcodes.add.*;
import gameBoy.interfaces.IOpcode;
import gameBoy.interfaces.IProcessor;

import org.junit.Test;

public class AdditionTests {

	@Test
	public void testAddAB() {
		IProcessor processor = new GameBoyProcessor();
		IOpcode add = new AddAB( processor );
		
		this.do8BitTest( Register.B, add, processor );

	}

	@Test
	public void testAddAC() {
		IProcessor processor = new GameBoyProcessor();
		IOpcode add = new AddAC( processor );
		
		this.do8BitTest( Register.C, add, processor );

	}
	
	@Test
	public void testAddAD() {
		IProcessor processor = new GameBoyProcessor();
		IOpcode add = new AddAD( processor );
		
		this.do8BitTest( Register.D, add, processor );

	}
	
	@Test
	public void testAddAE() {
		IProcessor processor = new GameBoyProcessor();
		IOpcode add = new AddAE( processor );
		
		this.do8BitTest( Register.E, add, processor );

	}
	
	@Test
	public void testAddAH() {
		IProcessor processor = new GameBoyProcessor();
		IOpcode add = new AddAH( processor );
		
		this.do8BitTest( Register.H, add, processor );

	}
	
	@Test
	public void testAddAL() {
		IProcessor processor = new GameBoyProcessor();
		IOpcode add = new AddAL( processor );
		
		this.do8BitTest( Register.L, add, processor );

	}
	
	@Test
	public void testAddAA() {
		IProcessor processor = new GameBoyProcessor();
		IOpcode add = new AddAA( processor );
		
		add.execute();
		
		assertEquals( 0, processor.getRegisters().getRegister( Register.A ) );
		assertEquals( 0, processor.getRegisters().getFlag( Flag.C ) );
		assertEquals( 1, processor.getRegisters().getFlag( Flag.Z ) );
		assertEquals( 0, processor.getRegisters().getFlag( Flag.H ) );
		assertEquals( 0, processor.getRegisters().getFlag( Flag.N ) );
		
		processor.getRegisters().setRegister( Register.A, (byte) 1 );
		
		add.execute();
		
		assertEquals( 2, processor.getRegisters().getRegister( Register.A ) );
		assertEquals( 0, processor.getRegisters().getFlag( Flag.C ) );
		assertEquals( 0, processor.getRegisters().getFlag( Flag.Z ) );
		assertEquals( 0, processor.getRegisters().getFlag( Flag.H ) );
		assertEquals( 0, processor.getRegisters().getFlag( Flag.N ) );
		
		processor.getRegisters().setRegister( Register.A, (byte) 8 );
		
		add.execute();
		
		assertEquals( 16, processor.getRegisters().getRegister( Register.A ) );
		assertEquals( 0, processor.getRegisters().getFlag( Flag.C ) );
		assertEquals( 0, processor.getRegisters().getFlag( Flag.Z ) );
		assertEquals( 1, processor.getRegisters().getFlag( Flag.H ) );
		assertEquals( 0, processor.getRegisters().getFlag( Flag.N ) );
		
		processor.getRegisters().setRegister( Register.A, (byte) 127 );
		
		add.execute();
		
		assertEquals( -2, processor.getRegisters().getRegister( Register.A ) );
		assertEquals( 1, processor.getRegisters().getFlag( Flag.C ) );
		assertEquals( 0, processor.getRegisters().getFlag( Flag.Z ) );
		assertEquals( 1, processor.getRegisters().getFlag( Flag.H ) );
		assertEquals( 0, processor.getRegisters().getFlag( Flag.N ) );

	}
	
	@Test
	public void testAddAAddrHl() {
		short address = 0x100;
		IProcessor processor = new GameBoyProcessor();
		IOpcode add = new AddAAddrHl( processor );
		
		processor.getRegisters().setRegister( Register.HL, address );
		
		add.execute();
		
		assertEquals( 0, processor.getRegisters().getRegister( Register.A ) );
		assertEquals( 0, processor.getRegisters().getFlag( Flag.C ) );
		assertEquals( 1, processor.getRegisters().getFlag( Flag.Z ) );
		assertEquals( 0, processor.getRegisters().getFlag( Flag.H ) );
		assertEquals( 0, processor.getRegisters().getFlag( Flag.N ) );
		
		processor.getRegisters().setRegister( Register.A, (byte) 1 );
		processor.getMemory().set8BitValue( address, (byte) 1 );
		
		add.execute();
		
		assertEquals( 2, processor.getRegisters().getRegister( Register.A ) );
		assertEquals( 0, processor.getRegisters().getFlag( Flag.C ) );
		assertEquals( 0, processor.getRegisters().getFlag( Flag.Z ) );
		assertEquals( 0, processor.getRegisters().getFlag( Flag.H ) );
		assertEquals( 0, processor.getRegisters().getFlag( Flag.N ) );
		
		processor.getRegisters().setRegister( Register.A, (byte) 2 );
		processor.getMemory().set8BitValue( address, (byte) 14 );
		
		add.execute();
		
		assertEquals( 16, processor.getRegisters().getRegister( Register.A ) );
		assertEquals( 0, processor.getRegisters().getFlag( Flag.C ) );
		assertEquals( 0, processor.getRegisters().getFlag( Flag.Z ) );
		assertEquals( 1, processor.getRegisters().getFlag( Flag.H ) );
		assertEquals( 0, processor.getRegisters().getFlag( Flag.N ) );
		
		processor.getRegisters().setRegister( Register.A, (byte) 127 );
		processor.getMemory().set8BitValue( address, (byte) 1 );
		
		add.execute();
		
		assertEquals( -128, processor.getRegisters().getRegister( Register.A ) );
		assertEquals( 1, processor.getRegisters().getFlag( Flag.C ) );
		assertEquals( 0, processor.getRegisters().getFlag( Flag.Z ) );
		assertEquals( 1, processor.getRegisters().getFlag( Flag.H ) );
		assertEquals( 0, processor.getRegisters().getFlag( Flag.N ) );

	}
	
	private void do8BitTest( Register register, IOpcode add, IProcessor processor ) {
		add.execute();
		
		assertEquals( 0, processor.getRegisters().getRegister( Register.A ) );
		assertEquals( 0, processor.getRegisters().getFlag( Flag.C ) );
		assertEquals( 1, processor.getRegisters().getFlag( Flag.Z ) );
		assertEquals( 0, processor.getRegisters().getFlag( Flag.H ) );
		assertEquals( 0, processor.getRegisters().getFlag( Flag.N ) );
		
		processor.getRegisters().setRegister( Register.A, (byte) 1 );
		processor.getRegisters().setRegister( register, (byte) 1 );
		
		add.execute();
		
		assertEquals( 2, processor.getRegisters().getRegister( Register.A ) );
		assertEquals( 0, processor.getRegisters().getFlag( Flag.C ) );
		assertEquals( 0, processor.getRegisters().getFlag( Flag.Z ) );
		assertEquals( 0, processor.getRegisters().getFlag( Flag.H ) );
		assertEquals( 0, processor.getRegisters().getFlag( Flag.N ) );
		
		processor.getRegisters().setRegister( register, (byte) 14 );
		
		add.execute();
		
		assertEquals( 16, processor.getRegisters().getRegister( Register.A ) );
		assertEquals( 0, processor.getRegisters().getFlag( Flag.C ) );
		assertEquals( 0, processor.getRegisters().getFlag( Flag.Z ) );
		assertEquals( 1, processor.getRegisters().getFlag( Flag.H ) );
		assertEquals( 0, processor.getRegisters().getFlag( Flag.N ) );
		
		processor.getRegisters().setRegister( Register.A, (byte) 127 );
		processor.getRegisters().setRegister( register, (byte) 1 );
		
		add.execute();
		
		assertEquals( -128, processor.getRegisters().getRegister( Register.A ) );
		assertEquals( 1, processor.getRegisters().getFlag( Flag.C ) );
		assertEquals( 0, processor.getRegisters().getFlag( Flag.Z ) );
		assertEquals( 1, processor.getRegisters().getFlag( Flag.H ) );
		assertEquals( 0, processor.getRegisters().getFlag( Flag.N ) );
	}
}
