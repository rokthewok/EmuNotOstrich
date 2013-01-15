package gameBoy.tests.graphicsTests;

import gameBoy.graphics.GameBoyGpu;
import gameBoy.graphics.WindowRenderer;

import javax.media.opengl.GL;
import javax.media.opengl.GL2;
import javax.media.opengl.GLAutoDrawable;
import javax.media.opengl.GLEventListener;


public class SimpleScreen implements GLEventListener {
	private WindowRenderer renderer;
	private GameBoyGpu gpu;
	
	public SimpleScreen( GameBoyGpu gpu, WindowRenderer renderer ) {
		this.renderer = renderer;
		this.gpu = gpu;
	}
	
	@Override
	public void display( GLAutoDrawable drawable ) {
		// TODO Auto-generated method stub
		update();
		render( drawable );
	}

	@Override
	public void dispose( GLAutoDrawable drawable ) {
		// TODO Auto-generated method stub
	}

	@Override
	public void init( GLAutoDrawable drawable ) {
		// TODO Auto-generated method stub
		drawable.getGL().getGL2().glBegin( GL.GL_POINTS );
		drawable.getGL().getGL2().glClear(  GL.GL_COLOR_BUFFER_BIT );
		drawable.getGL().getGL2().glEnd();
	}

	@Override
	public void reshape( GLAutoDrawable arg0, int arg1, int arg2, int arg3,
			int arg4 ) {
		// TODO Auto-generated method stub

	}
	
	private void update() {
		this.gpu.updateWindow();
	}
	
	private void render( GLAutoDrawable drawable ) {
		GL2 gl = drawable.getGL().getGL2();
		
		gl.glBegin(  GL.GL_TRIANGLES );
		gl.glColor3f( 1, 1, 1 );
		gl.glVertex2f( -1, -1 );
		gl.glVertex2f( 1, 1 );
		gl.glVertex2f( 1, -1 );
		
		gl.glVertex2f( -1, -1 );
		gl.glVertex2f( -1, 1 );
		gl.glVertex2f( 1, 1 );
		gl.glEnd();
		
		this.gpu.updateWindow();
		this.renderer.drawWindow( 160, 144, this.gpu.getScrollX(), this.gpu.getScrollY(), this.gpu.getWindowBuffer(), gl );
	}
}
