package gameBoy.cpu.opcodes.add;

import gameBoy.cpu.Flag;
import gameBoy.cpu.Register;
import gameBoy.cpu.opcodes.OneByteOpcode;
import gameBoy.interfaces.IProcessor;

/**
 * Abstract class which encapsulates adding the specified register to register A.
 * @author John Ruffer
 *
 */
public abstract class Addition8 extends OneByteOpcode {
	private static int cycles = 4;
	private IProcessor processor;
	private Register register;
	
	protected Addition8( IProcessor processor, Register register ) {
		this.processor = processor;
		this.register = register;
	}
	
	@Override
	public void execute() {
		int n = this.processor.getRegisters().getRegister( this.register );
		int A = this.processor.getRegisters().getRegister( Register.A );
		
		byte result = doFlagCheck( n, A );
		
		this.processor.getRegisters().setRegister( Register.A, result );
	}

	@Override
	public int getCycles() {
		return cycles;
	}

	protected byte doFlagCheck( int x, int y ) {
		// Clear the subtract flag
		this.processor.getRegisters().setFlagTo( Flag.N, false );
		
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
		
		byte result = (byte) ( (byte) x + (byte) y );
		
		// if result is zero, set the zero flag
		if( result == 0 ) {
			this.processor.getRegisters().setFlagTo( Flag.Z, true );
		} else {
			this.processor.getRegisters().setFlagTo( Flag.Z, false );
		}
		
		// check upper nibble for data to set or clear half carry flag
		if( ( result & 0xF0 ) != 0 ) {
			this.processor.getRegisters().setFlagTo( Flag.H, true );
		} else {
			this.processor.getRegisters().setFlagTo( Flag.H, false );
		}
		
		return result;
	}
}
