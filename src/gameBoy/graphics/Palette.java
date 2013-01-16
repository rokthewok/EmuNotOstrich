package gameBoy.graphics;

import gameBoy.interfaces.IPalette;

public class Palette implements IPalette {
	private final float[] red;
	private final float[] green;
	private final float[] blue;
	private final float[] shades;
	
	public Palette( float[] red, float[] green, float[] blue ) {
		this.red = red;
		this.green = green;
		this.blue = blue;
		this.shades = new float[3];
		this.shades[0] = ( this.red[0] + this.green[0] + this.blue[0] ) / 3.0f;
		this.shades[1] = ( this.red[1] + this.green[1] + this.blue[1] ) / 3.0f;
		this.shades[2] = ( this.red[2] + this.green[2] + this.blue[2] ) / 3.0f;
		this.shades[3] = ( this.red[3] + this.green[3] + this.blue[3] ) / 3.0f;
	}
	
	public Palette( float[] shades ) {
		this.red = shades;
		this.green = shades;
		this.blue = shades;
		this.shades = shades;
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
		return this.shades[code];
	}	
}