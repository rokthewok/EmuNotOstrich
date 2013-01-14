package gameBoy.cpu.opcodes.add;

import gameBoy.interfaces.IOpcode;
import gameBoy.interfaces.IProcessor;

public class AddImmToSp implements IOpcode {
	private static int cycles = 16;
	private IProcessor processor;
	
	public AddImmToSp( IProcessor processor ) {
		this.processor = processor;
	}
	
	@Override
	public void execute() {
		
	}

	@Override
	public int getCycles() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public byte getOpcodeLength() {
		// TODO Auto-generated method stub
		return 0;
	}

}
