package chessPieces;

import chess.Square;

public class Pawn extends Piece implements IPiece{
	
	private boolean promoted;
	private Piece promoteTo;
	
	enum MoveDirection {Up, Down};

	public Square[] validMoves() {
		// TODO Auto-generated method stub
		return null;
	}

	public Square[] attackSquares() {
		// TODO Auto-generated method stub
		return null;
	}

	public Square[] captureFreeMoves() {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean toBeCaptured() {
		// TODO Auto-generated method stub
		return false;
	}

}
