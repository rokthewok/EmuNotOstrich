package gameBoy.cpu.opcodes;

import gameBoy.interfaces.IOpcode;

public abstract class ThreeByteOpcode implements IOpcode {
	private byte opcodeLength = 3;
	
	public byte getOpcodeLength() {
		return opcodeLength;
	}
}
