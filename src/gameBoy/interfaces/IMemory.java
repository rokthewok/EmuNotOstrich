package gameBoy.interfaces;

public interface IMemory {
	public short get16BitValue( int address );
	public byte get8BitValue( int address );
}
