package gameBoy.cpu.opcodes.load;

import gameBoy.cpu.Flag;
import gameBoy.cpu.Register;
import gameBoy.cpu.opcodes.TwoByteOpcode;
import gameBoy.interfaces.IProcessor;

public class LoadSPPlusSignedImm8IntoHL extends TwoByteOpcode {
	private static int cycles = 12;
	private IProcessor processor;
	
	public LoadSPPlusSignedImm8IntoHL( IProcessor processor ) {
		this.processor = processor;
	}
	
	@Override
	public void execute() {
		this.processor.getRegisters().clearFlags();
		
		int x = this.processor.getRegisters().getRegister( Register.SP );
		int y = (byte) this.processor.getMemory().get8BitValue(
				this.processor.getRegisters().getRegister( Register.PC ) + 1);
		
		// Check for overflow to set or clear Carry flag
		if( ( x > 0 ) && ( y > 0 ) &&
				( x + y > Byte.MAX_VALUE ) ) {
			this.processor.getRegisters().setFlagTo( Flag.C, true );
		} else if( ( x < 0 ) && ( y < 0 ) &&
				( x + y < Byte.MIN_VALUE ) ) {
			this.processor.getRegisters().setFlagTo( Flag.C, true );
		} else {
			this.processor.getRegisters().setFlagTo( Flag.C, false );
		}
		
		int result = x + y;
				
		
		// check upper nibble for data to set or clear half carry flag
		if( ( result & 0xF0 ) != 0 ) {
			this.processor.getRegisters().setFlagTo( Flag.H, true );
		} else {
			this.processor.getRegisters().setFlagTo( Flag.H, false );
		}
		
		this.processor.getRegisters().setRegister(Register.HL, result);
	}

	@Override
	public int getCycles() {
		return cycles;
	}

}
