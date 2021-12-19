package chessPieces;

import java.util.List;

import chess.Board;
import chess.Move;
import chess.Square;

public interface IPiece {

	public Square[] validMoves();
	public Square[] attackSquares();
	public Square[] captureFreeMoves();
	public boolean toBeCaptured();
	public List<Move> calculateMoves(final Board board);
}
