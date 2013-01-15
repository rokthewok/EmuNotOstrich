package gameBoy.graphics;

import gameBoy.interfaces.IPalette;

public class Palette implements IPalette {
	private final float[] red;
	private final float[] green;
	private final float[] blue;
	
	public Palette( float[] red, float[] green, float[] blue ) {
		this.red = red;
		this.green = green;
		this.blue = blue;
	}
	
	@Override
	public float getRed( int code ) {
		return this.red[code];
	}

	@Override
	public float getGreen( int code ) {
		return this.green[code];
	}

	@Override
	public float getBlue( int code ) {
		return this.blue[code];
	}

	@Override
	public float getShade( int code ) {
		return ( this.red[code] + this.green[code] + this.blue[code] ) / 3.0f;
	}	
}