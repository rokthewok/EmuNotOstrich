package gameBoy.graphics;

import gameBoy.interfaces.IPalette;

import javax.media.opengl.GL2;

public class WindowRenderer {
	private Pixel pixel;
	private IPalette palette;

	public WindowRenderer() {
		this.pixel = new Pixel();
		float[] shade = new float[4];
		shade[0] = 1;
		shade[1] = 0.66f;
		shade[2] = 0.33f;
		shade[3] = 0.0f;
		this.palette = new Palette( shade, shade, shade );
	}
	
	public void drawWindow( int windowWidth, int windowHeight,
				int offsetX, int offsetY, int[][] window, GL2 gl2 ) {
		// TODO handle window wrapping
		
		for( int y = 0; y < windowHeight; y++ ) {
			for( int x = 0; x < windowWidth; x++ ) {
				float color = this.palette.getBlue( window[x + offsetX][y + offsetY] );
				this.pixel.setColor( color, color, color );
				this.pixel.moveTo( x, y );
				this.pixel.drawPixel( gl2 );
			}
		}
	}
}
