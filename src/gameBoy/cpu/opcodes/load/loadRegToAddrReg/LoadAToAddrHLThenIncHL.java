package gameBoy.cpu.opcodes.load.loadRegToAddrReg;

import gameBoy.cpu.Register;
import gameBoy.interfaces.IProcessor;

public class LoadAToAddrHLThenIncHL extends LoadAToAddrHL8 {
	private IProcessor processor;
	
	public LoadAToAddrHLThenIncHL(IProcessor processor) {
		super(processor);
		this.processor = processor;
	}
	
	@Override
	public void execute() {
		super.execute();
		this.processor.getRegisters().setRegister( Register.HL , 
				this.processor.getRegisters().getRegister( Register.HL ) + 1);
	}

}
