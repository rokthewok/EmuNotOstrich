package gameBoy.cpu.mocks;

import gameBoy.interfaces.IMemory;
import gameBoy.interfaces.IProcessor;
import gameBoy.interfaces.IRegister;

public class MockProcessorForGraphics implements IProcessor {
	private IMemory memory;
	private IRegister registers;
	
	public MockProcessorForGraphics( IMemory memory, IRegister registers ) {
		this.memory = memory;
		this.registers = registers;
	}
	
	@Override
	public IRegister getRegisters() {
		return this.registers;
	}

	@Override
	public void initialize() {
		// do nothing
	}

	@Override
	public IMemory getMemory() {
		return this.memory;
	}
	
	@Override
	public void executeCycle() {
		// do nothing
	}

}
