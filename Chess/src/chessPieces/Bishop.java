package chessPieces;

import java.util.ArrayList;
import java.util.List;

import chess.Board;
import chess.Move;
import chess.Square;

public class Bishop extends Piece implements IPiece {
	
	private final static int[] CANDIDATE_MOVE_VECTOR_COORDINATES = {-9, -7, 7, 9};
	private int[] candidate_moves;

	public Bishop(final int position, final PieceColor pieceColor) {
		super(position, pieceColor);
	}
	
	public Square[] validMoves() {
		
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
		ArrayList<Integer> moves = new ArrayList<Integer>();
		for(int candidateCoordinateOffset : CANDIDATE_MOVE_VECTOR_COORDINATES) {
			do moves.add()
		}
		return null;
	}

	@Override
	public int[] getCandidateMoves() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isFirstColumnExclusion(int currentPosition, int candidate_move) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isSecondColumnExclusion(int currentPosition, int candidate_move) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isSeventhColumnExclusion(int currentPosition, int candidate_move) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isEigthColumnExclusion(int currentPosition, int candidate_move) {
		// TODO Auto-generated method stub
		return false;
	}

}
