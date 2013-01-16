package gameBoy.graphics;

import gameBoy.interfaces.IPalette;

import javax.media.opengl.GL2;

public class WindowRenderer {
	private Pixel pixel;

	public WindowRenderer() {
		this.pixel = new Pixel();
	}
	
	public void drawWindow( int windowWidth, int windowHeight,
				int offsetX, int offsetY, int[][] window, IPalette palette, GL2 gl2 ) {
		// TODO handle window wrapping
		
		for( int y = 0; y < windowHeight; y++ ) {
			for( int x = 0; x < windowWidth; x++ ) {
				float color = palette.getShade( window[x + offsetX][y + offsetY] );
				this.pixel.setColor( color, color, color );
				this.pixel.moveTo( x, y );
				this.pixel.drawPixel( gl2 );
			}
		}
	}
}
