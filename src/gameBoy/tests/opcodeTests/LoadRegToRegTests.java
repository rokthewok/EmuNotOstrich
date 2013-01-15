package gameBoy.tests.opcodeTests;

import junit.framework.Assert;
import gameBoy.cpu.GameBoyProcessor;
import gameBoy.cpu.Register;
import gameBoy.cpu.opcodes.load.loadRegToReg.*;
import gameBoy.interfaces.IOpcode;
import gameBoy.interfaces.IProcessor;

import org.junit.Before;
import org.junit.Test;

public class LoadRegToRegTests {
	private IProcessor processor;
	private IOpcode opcode;

	@Before
	public void setUp() throws Exception {
		this.processor = new GameBoyProcessor();
	}

	@Test
	public void testLoadReg8ToReg8() {
		//A
		this.opcode = new LoadAToA8( this.processor );
		this.loadRegToReg8(Register.A, Register.A);
		this.opcode = new LoadBToA8( this.processor );
		this.loadRegToReg8(Register.A, Register.B);
		this.opcode = new LoadCToA8( this.processor );
		this.loadRegToReg8(Register.A, Register.C);
		this.opcode = new LoadDToA8( this.processor );
		this.loadRegToReg8(Register.A, Register.D);
		this.opcode = new LoadEToA8( this.processor );
		this.loadRegToReg8(Register.A, Register.E);
		this.opcode = new LoadHToA8( this.processor );
		this.loadRegToReg8(Register.A, Register.H);
		this.opcode = new LoadLToA8( this.processor );
		this.loadRegToReg8(Register.A, Register.L);
		//B
		this.opcode = new LoadAToB8( this.processor );
		this.loadRegToReg8(Register.B, Register.A);
		this.opcode = new LoadBToB8( this.processor );
		this.loadRegToReg8(Register.B, Register.B);
		this.opcode = new LoadCToB8( this.processor );
		this.loadRegToReg8(Register.B, Register.C);
		this.opcode = new LoadDToB8( this.processor );
		this.loadRegToReg8(Register.B, Register.D);
		this.opcode = new LoadEToB8( this.processor );
		this.loadRegToReg8(Register.B, Register.E);
		this.opcode = new LoadHToB8( this.processor );
		this.loadRegToReg8(Register.B, Register.H);
		this.opcode = new LoadLToB8( this.processor );
		this.loadRegToReg8(Register.B, Register.L);
		//C
		this.opcode = new LoadAToC8( this.processor );
		this.loadRegToReg8(Register.C, Register.A);
		this.opcode = new LoadBToC8( this.processor );
		this.loadRegToReg8(Register.C, Register.B);
		this.opcode = new LoadCToC8( this.processor );
		this.loadRegToReg8(Register.C, Register.C);
		this.opcode = new LoadDToC8( this.processor );
		this.loadRegToReg8(Register.C, Register.D);
		this.opcode = new LoadEToC8( this.processor );
		this.loadRegToReg8(Register.C, Register.E);
		this.opcode = new LoadHToC8( this.processor );
		this.loadRegToReg8(Register.C, Register.H);
		this.opcode = new LoadLToC8( this.processor );
		this.loadRegToReg8(Register.C, Register.L);
		//D
		this.opcode = new LoadAToD8( this.processor );
		this.loadRegToReg8(Register.D, Register.A);
		this.opcode = new LoadBToD8( this.processor );
		this.loadRegToReg8(Register.D, Register.B);
		this.opcode = new LoadCToD8( this.processor );
		this.loadRegToReg8(Register.D, Register.C);
		this.opcode = new LoadDToD8( this.processor );
		this.loadRegToReg8(Register.D, Register.D);
		this.opcode = new LoadEToD8( this.processor );
		this.loadRegToReg8(Register.D, Register.E);
		this.opcode = new LoadHToD8( this.processor );
		this.loadRegToReg8(Register.D, Register.H);
		this.opcode = new LoadLToD8( this.processor );
		this.loadRegToReg8(Register.D, Register.L);
		//E
		this.opcode = new LoadAToE8( this.processor );
		this.loadRegToReg8(Register.E, Register.A);
		this.opcode = new LoadBToE8( this.processor );
		this.loadRegToReg8(Register.E, Register.B);
		this.opcode = new LoadCToE8( this.processor );
		this.loadRegToReg8(Register.E, Register.C);
		this.opcode = new LoadDToE8( this.processor );
		this.loadRegToReg8(Register.E, Register.D);
		this.opcode = new LoadEToE8( this.processor );
		this.loadRegToReg8(Register.E, Register.E);
		this.opcode = new LoadHToE8( this.processor );
		this.loadRegToReg8(Register.E, Register.H);
		this.opcode = new LoadLToE8( this.processor );
		this.loadRegToReg8(Register.E, Register.L);
		//H
		this.opcode = new LoadAToH8( this.processor );
		this.loadRegToReg8(Register.H, Register.A);
		this.opcode = new LoadBToH8( this.processor );
		this.loadRegToReg8(Register.H, Register.B);
		this.opcode = new LoadCToH8( this.processor );
		this.loadRegToReg8(Register.H, Register.C);
		this.opcode = new LoadDToH8( this.processor );
		this.loadRegToReg8(Register.H, Register.D);
		this.opcode = new LoadEToH8( this.processor );
		this.loadRegToReg8(Register.H, Register.E);
		this.opcode = new LoadHToH8( this.processor );
		this.loadRegToReg8(Register.H, Register.H);
		this.opcode = new LoadLToH8( this.processor );
		this.loadRegToReg8(Register.H, Register.L);
		//L
		this.opcode = new LoadAToL8( this.processor );
		this.loadRegToReg8(Register.L, Register.A);
		this.opcode = new LoadBToL8( this.processor );
		this.loadRegToReg8(Register.L, Register.B);
		this.opcode = new LoadCToL8( this.processor );
		this.loadRegToReg8(Register.L, Register.C);
		this.opcode = new LoadDToL8( this.processor );
		this.loadRegToReg8(Register.L, Register.D);
		this.opcode = new LoadEToL8( this.processor );
		this.loadRegToReg8(Register.L, Register.E);
		this.opcode = new LoadHToL8( this.processor );
		this.loadRegToReg8(Register.L, Register.H);
		this.opcode = new LoadLToL8( this.processor );
		this.loadRegToReg8(Register.L, Register.L);	
	}
	
	private void loadRegToReg8( Register r1, Register r2) {
		int data = 20;
		this.processor.getRegisters().setRegister( r2, (short) data );
		
		this.opcode.execute();
		
		Assert.assertEquals( data, this.processor.getRegisters().getRegister( r1 ));
	}
}
