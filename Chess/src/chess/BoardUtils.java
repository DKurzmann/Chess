package chess;

public class BoardUtils {

	public static final boolean[] FIRST_COLUMN = initColumn(0);
	public static final boolean[] SECOND_COLUMN = initColumn(1);
	public static final boolean[] SEVENTH_COLUMN = initColumn(6);
	public static final boolean[] EIGTH_COLUMN = initColumn(7);
	
	public static final int NUM_TILES = 64;
	public static final int NUM_TILES_PER_ROW = 8;
	
	private static boolean[] initColumn(int columnNumber) {
		boolean[] column = new boolean[NUM_TILES];
		do {
			column[columnNumber] = true;
			columnNumber += NUM_TILES_PER_ROW;
		} while(columnNumber < NUM_TILES);
		
		return column;
	}

	public static boolean isValidPosition(int position) {
		return position >= 0 && position <= BoardUtils.NUM_TILES;
	}

}
