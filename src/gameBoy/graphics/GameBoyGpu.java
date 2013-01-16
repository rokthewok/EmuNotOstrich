package gameBoy.graphics;

import gameBoy.interfaces.IMemory;
import gameBoy.interfaces.IPalette;

public class GameBoyGpu {
	private int baseMapAddress;
	private int baseTileAddress;
	private int scrollX;
	private int scrollY;
	private IMemory memory;
	private int[][] window;
	private IPalette palette;
	
	public GameBoyGpu( IMemory memory ) {
		this.memory = memory;
		this.window = new int[256][256];
		
		this.updateScroll();
		this.setTileMap( 0x9C00 ); // TODO HACK, remove asap
		this.updatePalette();
	}
	
	public void updateWindow() {
		updatePalette();
		updateScroll();
		putTiles();
		putSprites();
	}
	
	private void updatePalette() {
		int paletteValue = this.memory.get8BitValue( 0xFF47 );
		float[] shades = new float[4];
		shades[paletteValue & 0x3] = 1;
		shades[( paletteValue & 0xC ) >> 2] = 0.66f;
		shades[( paletteValue & 0x30 ) >> 4] = 0.33f;
		shades[( paletteValue & 0xC0 ) >> 6] = 0;
		this.palette = new Palette( shades );
	}
	
	private void updateScroll() {
		this.scrollX = this.memory.get8BitValue( 0xFF43 );	// SCX = 0xFF43
		this.scrollY = this.memory.get8BitValue( 0xFF42 );	// SCY = 0xFF42
	}
	
	public void putSprites() {
		// TODO implement, por favor
	}
	
	private void putTiles() {
		for( int i = 0, j = 0; i < 1024; i++, j += 8 ) {
			int rawTile[] = createRawTile( this.baseTileAddress + getTileOffset( this.baseMapAddress + i ) );
			
			this.putTile( ( j % 256 ), ( j / 256 ) * 8, rawTile );
		}
	}
	
	private int[] createRawTile( int tileAddress ) {
		int[] tile = new int[16];
		for( int i = 0; i < tile.length; i++ ) {
			tile[i] = this.memory.get8BitValue( tileAddress + i );
		}
		
		return tile;
	}
	
	private int getTileOffset( int mapAddress ) {
		return this.memory.get8BitValue( mapAddress );
	}
	
	private void putTile( int offsetX, int offsetY, int[] rawTile ) {
		assert rawTile.length == 16;
		
		for( int y = offsetY, rawY = 0; y < offsetY + 8 && rawY < 16; y++, rawY += 2 ) {
			getHighBits( offsetX, y, rawTile[rawY + 1] );
			getLowBits( offsetX, y, rawTile[rawY] );
		}
	}
	
	private void getHighBits( int offsetX, int y, int highByte ) {
		for( int x = offsetX; x < offsetX + 8; x++ ) {
			this.window[x][y] = ( ( highByte & ( 1 << 7 - ( x - offsetX ) ) ) >> ( 7 - ( x - offsetX ) ) );
		}
	}
	
	private void getLowBits( int offsetX, int y, int lowByte ) {
		for( int x = offsetX; x < offsetX + 8; x++ ) {
			this.window[x][y] = ( this.window[x][y] << 1 ) | ( lowByte & ( 1 << 7 - ( x - offsetX ) ) ) >> ( 7 - ( x - offsetX ) );
		}
	}
	
	public IPalette getPalette() {
		return this.palette;
	}
	
	public int getScrollX() {
		return this.scrollX;
	}
	
	public int getScrollY() {
		return this.scrollY;
	}
	
	public int[][] getWindowBuffer() {
		return this.window;
	}
	
	public void setTileMap( int address ) {
		switch( address ) {
		case 0x9800:
			this.baseMapAddress = address;
			this.baseTileAddress = 0x8800;
			break;
		case 0x9C00:
			this.baseMapAddress = address;
			this.baseTileAddress = 0x8000; 
			break;
		default:
			this.baseMapAddress = 0x9C00;
			this.baseTileAddress = 0x8000;
		}
	}
}
