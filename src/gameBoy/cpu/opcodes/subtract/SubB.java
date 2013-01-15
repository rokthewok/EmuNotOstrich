package gameBoy.cpu.opcodes.subtract;

import gameBoy.cpu.Register;

import gameBoy.interfaces.IProcessor;

public class SubB extends Sub {

	public SubB( IProcessor processor ) {
		super( processor, Register.B );
	}
}
