package gameBoy.interfaces;

import gameBoy.cpu.GameBoyRegisters.Register;

public interface IRegister {
	public void setRegister( Register register, short data );
	public short getRegister( Register register );
}
