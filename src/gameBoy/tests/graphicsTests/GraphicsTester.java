package gameBoy.tests.graphicsTests;

import gameBoy.cpu.mocks.MockProcessorForGraphics;
import gameBoy.graphics.GameBoyGpu;
import gameBoy.graphics.WindowRenderer;
import gameBoy.interfaces.IMemory;
import gameBoy.interfaces.IProcessor;
import gameBoy.memory.mocks.MockMemoryForGraphics;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.media.opengl.GLCapabilities;
import javax.media.opengl.GLProfile;
import javax.media.opengl.awt.GLCanvas;



public class GraphicsTester {
	public static void main( String [] args ) {
		IMemory memory = new MockMemoryForGraphics();
		IProcessor processor = new MockProcessorForGraphics( memory, null );
		WindowRenderer renderer = new WindowRenderer();
		GameBoyGpu gpu = new GameBoyGpu( processor );
		
		GLProfile.initSingleton();
		GLProfile glProfile = GLProfile.getDefault();
		GLCapabilities glCapabilities = new GLCapabilities( glProfile );
		GLCanvas canvas = new GLCanvas( glCapabilities );
		
		canvas.addGLEventListener( new SimpleScreen( gpu, renderer ) );
		
		Frame frame = new Frame( "JOGL is Fun!" );
		frame.setSize(  160 * 5, 144 * 5 );
		frame.add( canvas );
		frame.setVisible( true );
		
		frame.addWindowListener( new WindowAdapter() {
			public void windowClosing( WindowEvent e ) {
				System.exit( 0 );
			}
		} );
	}
}
