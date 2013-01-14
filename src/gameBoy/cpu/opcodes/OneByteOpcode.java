package gameBoy.cpu.opcodes;

import gameBoy.interfaces.IOpcode;

public abstract class OneByteOpcode implements IOpcode {
	private static byte opcodeLength = 1;
	
	public byte getOpcodeLength() {
		return opcodeLength;
	}
}
