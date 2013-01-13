package gameBoy.tests.opcodeTests;

import static org.junit.Assert.*;
import gameBoy.cpu.GameBoyProcessor;
import gameBoy.cpu.Register;
import gameBoy.cpu.opcodes.increment.*;
import gameBoy.interfaces.IOpcode;
import gameBoy.interfaces.IProcessor;

import org.junit.Test;

public class IncrementTests {

	@Test
	public void testIncBcExecution() {
		short bcValue = 14;
		IProcessor processor = new GameBoyProcessor();
		processor.getRegisters().setRegister( Register.BC, bcValue );
		IOpcode incBc = new IncBc( processor );
		
		incBc.execute();
		bcValue++;
		
		assertEquals( bcValue, processor.getRegisters().getRegister( Register.BC ) );
		
		bcValue = 32514;
		processor.getRegisters().setRegister( Register.BC, bcValue );
		
		incBc.execute();
		bcValue++;
		
		assertEquals( bcValue, processor.getRegisters().getRegister( Register.BC ) );
	}

	@Test
	public void testIncBExecution() {
		byte value = 14;
		IProcessor processor = new GameBoyProcessor();
		processor.getRegisters().setRegister( Register.B, value );
		IOpcode incB = new IncB( processor );
		
		incB.execute();
		value++;
		
		assertEquals( value, processor.getRegisters().getRegister( Register.B ) );
		
		value = (byte) 255;
		processor.getRegisters().setRegister( Register.B, value );
		
		incB.execute();
		value++;
		
		assertEquals( value, processor.getRegisters().getRegister( Register.B ) );
	}
	
	@Test
	public void testIncCExecution() {
		byte value = 14;
		IProcessor processor = new GameBoyProcessor();
		processor.getRegisters().setRegister( Register.C, value );
		IOpcode incC = new IncC( processor );
		
		incC.execute();
		value++;
		
		assertEquals( value, processor.getRegisters().getRegister( Register.C ) );
		
		value = (byte) 255;
		processor.getRegisters().setRegister( Register.C, value );
		
		incC.execute();
		value++;
		
		assertEquals( value, processor.getRegisters().getRegister( Register.C ) );
	}
	
	@Test
	public void testIncDeExecution() {
		short value = 14;
		IProcessor processor = new GameBoyProcessor();
		processor.getRegisters().setRegister( Register.DE, value );
		IOpcode incDe = new IncDe( processor );
		
		incDe.execute();
		value++;
		
		assertEquals( value, processor.getRegisters().getRegister( Register.DE ) );
		
		value = 32514;
		processor.getRegisters().setRegister( Register.DE, value );
		
		incDe.execute();
		value++;
		
		assertEquals( value, processor.getRegisters().getRegister( Register.DE ) );
	}
	
	@Test
	public void testIncDExcecution() {
		byte value = 14;
		IProcessor processor = new GameBoyProcessor();
		processor.getRegisters().setRegister( Register.D, value );
		IOpcode incD = new IncD( processor );
		
		incD.execute();
		value++;
		
		assertEquals( value, processor.getRegisters().getRegister( Register.D ) );
		
		value = (byte) 255;
		processor.getRegisters().setRegister( Register.D, value );
		
		incD.execute();
		value++;
		
		assertEquals( value, processor.getRegisters().getRegister( Register.D ) );
	}
}
