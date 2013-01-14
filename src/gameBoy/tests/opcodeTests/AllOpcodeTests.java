package gameBoy.tests.opcodeTests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ IncrementTests.class, AdditionTests.class, DecrementTests.class, 
	LoadImmToRegTests.class, LoadRegToRegTests.class, AndTests.class, OrTests.class })
public class AllOpcodeTests {

}
