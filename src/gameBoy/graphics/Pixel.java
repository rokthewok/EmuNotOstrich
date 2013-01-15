package gameBoy.graphics;

import javax.media.opengl.GL2;

public class Pixel {
	private float screenWidth;
	private float screenHeight;
	private float x;
	private float y;
	private float red;
	private float green;
	private float blue;
	
	
	public Pixel() {
		this( 160.0f, 144.0f );
	}
	
	public Pixel( float screenWidth, float screenHeight ) {
		this.screenWidth = screenWidth;
		this.screenHeight = screenHeight;
	}
	
	public void drawPixel( GL2 gl2 ) {
		gl2.glLoadIdentity();
		gl2.glTranslatef( 2.0f * this.x / this.screenWidth - 1.0f, -2.0f * this.y / this.screenHeight + 1.0f, 0.0f );
		gl2.glScalef( 1.0f / this.screenWidth, 1.0f / this.screenHeight, 0.0f );
		
		gl2.glBegin( GL2.GL_TRIANGLES );
		gl2.glColor3f( this.red, this.green, this.blue );
		gl2.glVertex2f( -1, -1 );
		gl2.glVertex2f( 1, 1 );
		gl2.glVertex2f( -1, 1 );
		
		gl2.glVertex2f( -1, -1 );
		gl2.glVertex2f( 1, -1 );
		gl2.glVertex2f( 1, 1 );
		gl2.glEnd();
	}
	
	public void moveTo( float x, float y ) {
		this.x = x;
		this.y = y;
	}
	
	public void setColor( float r, float g, float b ) {
		this.red = r;
		this.green = g;
		this.blue = b;
	}
}