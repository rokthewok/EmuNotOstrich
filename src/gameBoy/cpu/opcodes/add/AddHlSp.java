package gameBoy.cpu.opcodes.add;

import gameBoy.cpu.Register;
import gameBoy.interfaces.IProcessor;

public class AddHlSp extends Addition16 {

	public AddHlSp( IProcessor processor ) {
		super( processor, Register.SP );
	}
}
