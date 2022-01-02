package chessPieces;

import java.util.ArrayList;
import java.util.List;

import chess.Board;
import chess.BoardUtils;
import chess.Move;
import chess.MoveCalculator;
import chess.Square;

public class Knight extends Piece implements IPiece {
	
	private final static int[] CANDIDATE_MOVES = {-17, -15, -10, -6, 6, 10, 15, 17};
	
	List<Integer>positions = new ArrayList<Integer>();
	List<Square> squares = new ArrayList<Square>();
	List<Move> moves = new ArrayList<Move>();

	Knight(final int position, final PieceColor pieceColor) {
		super(position, pieceColor);
	}

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

	@Override
	public List<Move> calculateMoves(Board board) {
		MoveCalculator calculator = new MoveCalculator(this, board);
		List<Move> moves = calculator.calculate();
		return moves;
	}

	@Override
	public int[] getCandidateMoves() {
		return CANDIDATE_MOVES;
	}
	
	public boolean isFirstColumnExclusion(int currentPosition, int candidateOffset) {
		return BoardUtils.FIRST_COLUMN[currentPosition] && ((candidateOffset == -17 || candidateOffset == -10 || candidateOffset == 6 || candidateOffset == 15 ));
	}
	
	public boolean isSecondColumnExclusion(int currentPosition, int candidateOffset) {
		return BoardUtils.SECOND_COLUMN[currentPosition] && ((candidateOffset == -10 || candidateOffset == 6));
	}
	
	public boolean isSeventhColumnExclusion(int currentPosition, int candidateOffset) {
		return BoardUtils.SEVENTH_COLUMN[currentPosition] && ((candidateOffset == -6 || candidateOffset == 10));
	}
	
	public boolean isEigthColumnExclusion(int currentPosition, int candidateOffset) {
		return BoardUtils.EIGTH_COLUMN[currentPosition] && ((candidateOffset == -15 || candidateOffset == -6 || candidateOffset == 10 || candidateOffset == 17));
	}


}
