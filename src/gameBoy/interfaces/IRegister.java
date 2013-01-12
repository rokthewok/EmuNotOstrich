package gameBoy.interfaces;

import gameBoy.cpu.Register;
import gameBoy.cpu.Flag;

public interface IRegister {
	public void setRegister( Register register, short data );
	public short getRegister( Register register );
	public void setFlagTo( Flag flag, boolean state );
	public byte getFlag( Flag flag );
}
