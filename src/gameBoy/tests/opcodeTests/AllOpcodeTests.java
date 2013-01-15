package gameBoy.tests.opcodeTests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ IncrementTests.class, AdditionTests.class, DecrementTests.class, 
	AndTests.class, OrTests.class, LoadImmToRegTests.class, LoadRegToRegTests.class,
	LoadAddrRegToRegTests.class, LoadRegToAddrRegTests.class, MiscLoadTests.class })
public class AllOpcodeTests {

}
