package chess;

import java.util.HashMap;
import java.util.Map;

import com.google.common.collect.*;

import chessPieces.Piece;

public abstract class Square {
	
	protected final int coordinate;
	
	private static final Map<Integer, EmptySquare> EMPTY_SQUARES = createAllPossibleEmptySquares();
	
	private Square(int coordinate) {
		this.coordinate = coordinate;
	}

	private static Map<Integer, EmptySquare> createAllPossibleEmptySquares() {
		final Map<Integer, EmptySquare> emptySquareMap = new HashMap<>();
		for(int i = 0; i < 64; i++) {
			emptySquareMap.put(i, new EmptySquare(i));
		}
		return ImmutableMap.copyOf(emptySquareMap);
	}
	
	public abstract boolean isOccupied();
	
	public abstract Piece getPiece();
	
	private static final class EmptySquare extends Square{

		EmptySquare(final int coordinate) {
			super(coordinate);
		}

		@Override
		public boolean isOccupied() {
			return false;
		}

		@Override
		public Piece getPiece() {
			return null;
		}
		
	}
	
	private static final class OccupiedSquare extends Square{
		
		private final Piece piece;
		
		OccupiedSquare(final int coordinate, final Piece piece) {
			super(coordinate);
			this.piece = piece;
			
		}

		@Override
		public boolean isOccupied() {
			return false;
		}

		@Override
		public Piece getPiece() {
			return piece;
		}
	}

}
