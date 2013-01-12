package gameBoy.cpu;

public class Opcodes {
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
	public static int LD_A_ADDR_BC = 0x0A;	
	public static int LD_ADDR_NN_SP = 0x08;
	
	/*
	 * Add opcodes (ADD)
	 */
	public static int ADD_HL_BC = 0x09;
}
