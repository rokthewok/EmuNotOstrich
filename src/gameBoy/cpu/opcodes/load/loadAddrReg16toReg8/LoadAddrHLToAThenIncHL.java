package gameBoy.cpu.opcodes.load.loadAddrReg16toReg8;

import gameBoy.cpu.Register;
import gameBoy.interfaces.IProcessor;

public class LoadAddrHLToAThenIncHL extends LoadAddrHLToA8 {
	private IProcessor processor;
	
	public LoadAddrHLToAThenIncHL(IProcessor processor) {
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
