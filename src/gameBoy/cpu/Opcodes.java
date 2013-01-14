package gameBoy.cpu;

import gameBoy.cpu.opcodes.add.*;
import gameBoy.interfaces.IOpcode;
import gameBoy.interfaces.IOpcodeMap;
import gameBoy.interfaces.IProcessor;

import java.util.Map;
import java.util.HashMap;

public class Opcodes implements IOpcodeMap {
	private Map<Integer, IOpcode> opcodeMap;
	
	public static int NOP = 0x00;
	public static int RLC_A = 0x07;
	
	/*
	 * Increment opcodes (INC)
	 */
	public static int INC_BC = 0x03;		// implemented
	public static int INC_B = 0x04;			// implemented
	public static int INC_C = 0x0C;
	public static int INC_DE = 0x13;
	public static int INC_D = 0x14;
	public static int INC_E = 0x1C;
	public static int INC_HL = 0x23;
	public static int INC_H = 0x24;
	public static int INC_L = 0x2C;
	public static int INC_SP = 0x33;
	public static int INC_ADDR_HL = 0x34;
	public static int INC_A = 0x3C;
	
	/*
	 * Decrement opcodes (DEC)
	 */
	public static int DEC_B = 0x05;
	public static int DEC_BC = 0x0B;
	public static int DEC_C = 0x0D;
	public static int DEC_D = 0x15;
	public static int DEC_DE = 0x1B;
	public static int DEC_E = 0x1D;
	public static int DEC_H = 0x25;
	public static int DEC_HL = 0x2B;
	public static int DEC_L = 0x2D;
	public static int DEC_ADDR_HL = 0x35;
	public static int DEC_SP = 0x3B;
	public static int DEC_A = 0x3D;
	
	/*
	 * Load opcodes (LD)
	 */
	public static int LD_BC_NN = 0x01;
	public static int LD_ADDR_BC_A = 0x02;	// put A at address contained in BC
	public static int LD_B_N = 0x06;	
	public static int LD_ADDR_NN_SP = 0x08;
	public static int LD_A_ADDR_BC = 0x0A;
	public static int LD_C_N = 0x0E;
	public static int LD_DE_NN = 0x11;
	public static int LD_ADDR_DE_A = 0x12;
	public static int LD_D_N = 0x16;
	public static int LD_A_ADDR_DE = 0x1A;
	public static int LD_E_N = 0x1E;
	public static int LD_HL_NN = 0x21;
	public static int LD_H_N = 0x26;
	public static int LD_L_N = 0x2E;
	public static int LD_SP_NN = 0x31;
	public static int LD_ADDR_HL_N = 0x36;
	public static int LD_A_N = 0x3E;
	public static int LD_B_B = 0x40;
	public static int LD_B_C = 0x41;
	public static int LD_B_D = 0x42;
	public static int LD_B_E = 0x43;
	public static int LD_B_H = 0x44;
	public static int LD_B_L = 0x45;
	public static int LD_B_ADDR_HL = 0x46;
	public static int LD_B_A = 0x47;
	public static int LD_C_B = 0x48;
	public static int LD_C_C = 0x49;
	public static int LD_C_D = 0x4A;
	public static int LD_C_E = 0x4B;
	public static int LD_C_H = 0x4C;
	public static int LD_C_L = 0x4D;
	public static int LD_C_ADDR_HL = 0x4E;
	public static int LD_C_A = 0x4F;
	public static int LD_D_B = 0x50;
	public static int LD_D_C = 0x51;
	public static int LD_D_D = 0x51;
	public static int LD_D_E = 0x53;
	public static int LD_D_H = 0x54;
	public static int LD_D_L = 0x55;
	public static int LD_D_ADDR_HL = 0x56;
	public static int LD_D_A = 0x57;
	public static int LD_E_B = 0x58;
	public static int LD_E_C = 0x59;
	public static int LD_E_D = 0x5A;
	public static int LD_E_E = 0x5B;
	public static int LD_E_H = 0x5C;
	public static int LD_E_L = 0x5D;
	public static int LD_E_ADDR_HL = 0x5E;
	public static int LD_E_A = 0x5F;
	public static int LD_H_B = 0x60;
	public static int LD_H_C = 0x61;
	public static int LD_H_D = 0x62;
	
	/*
	 * Add opcodes (ADD)
	 */
	public static int ADD_HL_BC = 0x09;
	public static int ADD_HL_DE = 0x19;
	public static int ADD_HL_HL = 0x29;
	public static int ADD_HL_SP = 0x39;
	public static int ADD_A_B = 0x80;
	public static int ADD_A_C = 0x81;
	public static int ADD_A_D = 0x82;
	public static int ADD_A_E = 0x83;
	public static int ADD_A_H = 0x84;
	public static int ADD_A_L = 0x85;
	public static int ADD_A_ADDR_HL = 0x86;
	public static int ADD_A_A = 0x87;
	public static int ADD_A_N = 0xC6;
	public static int ADD_SP_d = 0xE8;
	
	/*
	 * Subtract opcodes (SUB)
	 */
	public static int SUB_A_B = 0x90;
	public static int SUB_A_C = 0x91;
	public static int SUB_A_D = 0x92;
	public static int SUB_A_E = 0x93;
	public static int SUB_A_H = 0x94;
	public static int SUB_A_L = 0x95;
	public static int SUB_A_ADDR_HL = 0x96;
	public static int SUB_A_A = 0x97;
	public static int SUB_A_N = 0xD6;
	
	@Override
	public void initializeOpcodes( IProcessor processor ) {
		this.opcodeMap = new HashMap<Integer, IOpcode>();
		// add IOpcodes to the map here...
		this.opcodeMap.put( ADD_A_A, new AddAA( processor ) );
		this.opcodeMap.put( ADD_A_ADDR_HL, new AddAAddrHl( processor ) );
		this.opcodeMap.put( ADD_A_B, new AddAB( processor ) );
	}
	
	@Override
	public IOpcode getOpcode( int opcode ) {
		return this.opcodeMap.get( opcode );
	}
}
