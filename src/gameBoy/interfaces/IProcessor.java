package gameBoy.interfaces;

public interface IProcessor {
	public IRegister getRegisters();
	public void initialize();
	public IMemory getMemory();
	public IMemory getVideoMemory();
	public void executeCycle();
}
