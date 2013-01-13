package gameBoy.interfaces;

public interface IMemory {
	public short get16BitValue( int address );
	public byte get8BitValue( int address );
	public void set8BitValue( int address, byte data );
	public void set16BitValue( int address, short data );
}
