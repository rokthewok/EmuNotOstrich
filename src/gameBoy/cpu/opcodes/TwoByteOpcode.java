package gameBoy.cpu.opcodes;

import gameBoy.interfaces.IOpcode;

public abstract class TwoByteOpcode implements IOpcode {
	private static byte opcodeLength = 2;
	
	public byte getOpcodeLength() {
		return opcodeLength;
	}
}
