package gameBoy.interfaces;

public interface IOpcodeMap {
	public void initializeOpcodes( IProcessor processor );
	public IOpcode getOpcode( int opcode );
}
