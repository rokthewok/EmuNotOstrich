package gameBoy.cpu.opcodes.load.loadRegToAddrReg;

import gameBoy.cpu.Register;
import gameBoy.interfaces.IProcessor;

public class LoadAToAddrHLThenDecHL extends LoadAToAddrHL8 {
	private IProcessor processor;
	
	public LoadAToAddrHLThenDecHL(IProcessor processor) {
		super(processor);
		this.processor = processor;
	}
	
	@Override
	public void execute() {
		super.execute();
		this.processor.getRegisters().setRegister( Register.HL , 
				this.processor.getRegisters().getRegister( Register.HL ) - 1);
	}

}
