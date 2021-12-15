package chessPieces;

import chess.Square;

public interface IPiece {

	public Square[] validMoves();
	public Square[] attackSquares();
	public Square[] captureFreeMoves();
	public boolean toBeCaptured();
}
