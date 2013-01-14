package gameBoy.cpu.opcodes.add;

import gameBoy.cpu.Flag;
import gameBoy.cpu.Register;
import gameBoy.interfaces.IOpcode;
import gameBoy.interfaces.IProcessor;

public class Addition16 implements IOpcode {
	private static int cycles = 8;
	private IProcessor processor;
	private Register register;
	
	protected Addition16( IProcessor processor, Register register ) {
		this.processor = processor;
		this.register = register;
	}
	
	@Override
	public void execute() {
		int hl = this.processor.getRegisters().getRegister( Register.HL );
		int nn = this.processor.getRegisters().getRegister( this.register );
		
		short result = this.doFlagCheck( hl, nn );
		
		this.processor.getRegisters().setRegister( Register.HL, result );
	}

	@Override
	public int getCycles() {
		return cycles;
	}

	protected short doFlagCheck( int x, int y ) {
		this.processor.getRegisters().setFlagTo( Flag.N, false );
		
		int intResult = ( x + y );
		
		if( ( x > 0 ) && ( y > 0 ) && 
				intResult > Short.MAX_VALUE ) {
			this.processor.getRegisters().setFlagTo( Flag.C, true );
		} else {
			this.processor.getRegisters().setFlagTo( Flag.C, false );
		}
		
		short result = (short) intResult;
		
		if( ( result & 0xF000 ) != 0 ) {
			this.processor.getRegisters().setFlagTo( Flag.H, true );
		} else {
			this.processor.getRegisters().setFlagTo( Flag.H, false );
		}
		
		return result;
	}
}
