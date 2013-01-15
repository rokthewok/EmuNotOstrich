package gameBoy.cpu.opcodes.subtract;

import gameBoy.cpu.Register;
import gameBoy.interfaces.IProcessor;

public class SubL extends Sub {

	public SubL( IProcessor processor ) {
		super( processor, Register.L );
	}
}
