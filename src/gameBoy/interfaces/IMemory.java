package gameBoy.interfaces;

public interface IMemory {
	public int get16BitValue( int address );
	public int get8BitValue( int address );
	public void set8BitValue( int address, int data );
	public void set16BitValue( int address, int data );
}
