package gameBoy.tests;

import gameBoy.tests.opcodeTests.AllOpcodeTests;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ GameBoyProcessorTests.class, GameBoyRegistersTests.class,
		MemoryTests.class, AllOpcodeTests.class })
public class AllTests {

}
