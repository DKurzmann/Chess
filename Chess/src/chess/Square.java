package chess;

import com.google.common.collect.*;

public abstract class Square {
	
	protected final int coordinate;
	
//	private static final Map<Integer, EmptySquare> EMPTY_SQUARES = createAllPossibleEmptySquare();
	
	private Square(int coordinate) {
		this.coordinate = coordinate;
	}

//	private Map<Integer, EmptySquare> createAllPossibleEmptyTiles() {
//		final Map<Integer, EmptyTile> emptySquareMap = new HashMap<>();
//		for(int i = 0; i < 64; i++) {
//			emptySquareMap.put(i, new EmptySquare(i));
//		}
//		return ImmutableMap.
//	}
	
	public static final class EmptySquare extends Square{

		EmptySquare(final int coordinate) {
			super(coordinate);
		}
		
	}

}
