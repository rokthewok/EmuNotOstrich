package gameBoy.tests;

import gameBoy.tests.opcodeTests.IncrementTests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ GameBoyProcessorTests.class, GameBoyRegistersTests.class, MemoryTests.class, IncrementTests.class })
public class AllTests {

}
