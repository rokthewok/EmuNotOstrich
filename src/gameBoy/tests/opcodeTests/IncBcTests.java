package gameBoy.tests.opcodeTests;

import static org.junit.Assert.*;
import gameBoy.cpu.GameBoyProcessor;
import gameBoy.cpu.GameBoyRegisters.Register;
import gameBoy.cpu.opcodes.IncBc;
import gameBoy.interfaces.IOpcode;
import gameBoy.interfaces.IProcessor;

import org.junit.Test;

public class IncBcTests {

	@Test
	public void testExecution() {
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

}
