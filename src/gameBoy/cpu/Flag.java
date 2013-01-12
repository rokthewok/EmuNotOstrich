package gameBoy.cpu;

public enum Flag {
	Z, 	// Set when the result of a math operation is zero or two values 
		// match when using the CP instruction
	N, 	// Set when the last math operation performed was subtraction
	H, 	// Set when a carry occurred in the lower nibble of the last operation
	C	// Set if a carry occurred in the last operation or
		// if register A is the smaller value when executing the CP instruction
}
