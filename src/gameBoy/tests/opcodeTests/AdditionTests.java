package gameBoy.tests.opcodeTests;

import static org.junit.Assert.*;
import gameBoy.cpu.Flag;
import gameBoy.cpu.GameBoyProcessor;
import gameBoy.cpu.Register;
import gameBoy.cpu.opcodes.add.AddAB;
import gameBoy.interfaces.IOpcode;
import gameBoy.interfaces.IProcessor;

import org.junit.Test;

public class AdditionTests {

	@Test
	public void testAddABExecution() {
		IProcessor processor = new GameBoyProcessor();
		IOpcode add = new AddAB( processor );
		
		add.execute();
		
		assertEquals( 0, processor.getRegisters().getRegister( Register.A ) );
		assertEquals( 0, processor.getRegisters().getFlag( Flag.C ) );
		assertEquals( 1, processor.getRegisters().getFlag( Flag.Z ) );
		assertEquals( 0, processor.getRegisters().getFlag( Flag.H ) );
		assertEquals( 0, processor.getRegisters().getFlag( Flag.N ) );
		
		processor.getRegisters().setRegister( Register.A, (byte) 1 );
		processor.getRegisters().setRegister( Register.B, (byte) 1 );
		
		add.execute();
		
		assertEquals( 2, processor.getRegisters().getRegister( Register.A ) );
		assertEquals( 0, processor.getRegisters().getFlag( Flag.C ) );
		assertEquals( 0, processor.getRegisters().getFlag( Flag.Z ) );
		assertEquals( 0, processor.getRegisters().getFlag( Flag.H ) );
		assertEquals( 0, processor.getRegisters().getFlag( Flag.N ) );
		
		processor.getRegisters().setRegister( Register.B, (byte) 14 );
		
		add.execute();
		
		assertEquals( 16, processor.getRegisters().getRegister( Register.A ) );
		assertEquals( 0, processor.getRegisters().getFlag( Flag.C ) );
		assertEquals( 0, processor.getRegisters().getFlag( Flag.Z ) );
		assertEquals( 1, processor.getRegisters().getFlag( Flag.H ) );
		assertEquals( 0, processor.getRegisters().getFlag( Flag.N ) );
		
		processor.getRegisters().setRegister( Register.A, (byte) 127 );
		processor.getRegisters().setRegister( Register.B, (byte) 1 );
		
		add.execute();
		
		assertEquals( -128, processor.getRegisters().getRegister( Register.A ) );
		assertEquals( 1, processor.getRegisters().getFlag( Flag.C ) );
		assertEquals( 0, processor.getRegisters().getFlag( Flag.Z ) );
		assertEquals( 1, processor.getRegisters().getFlag( Flag.H ) );
		assertEquals( 0, processor.getRegisters().getFlag( Flag.N ) );
	}

}
