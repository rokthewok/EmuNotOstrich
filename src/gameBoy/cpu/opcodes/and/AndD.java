package gameBoy.cpu.opcodes.and;

import gameBoy.cpu.Register;

import gameBoy.interfaces.IProcessor;

public class AndD extends And {

	public AndD( IProcessor processor ) {
		super( processor, Register.D );
	}
}
