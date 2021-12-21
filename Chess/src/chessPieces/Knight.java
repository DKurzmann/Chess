package chessPieces;

import java.util.ArrayList;
import java.util.List;

import chess.Board;
import chess.Move;
import chess.Square;

public class Knight extends Piece implements IPiece {
	
	private final static int[] CANDIDATE_MOVES = {-17, -15, -10, -6, 6, 10, 15, 17};

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
		List<Integer>positions = getPositions();
		List<Square> squares = getSquares(positions, board);
		List<Move> moves = getMoves(squares); 
		return moves;
	}
	
	private List<Move> getMoves(List<Square> squares) {
		List<Move> moves = new ArrayList<Move>();
		for(Square square : squares) {
			if( square.isOccupied() == false) {
				moves.add(new Move());
			} else if(isOccupiedWithOtherPlayersPiece(square)){
				moves.add(new Move());
			}
		}
		return moves;
	}

	private List<Square> getSquares(List<Integer> positions, Board board) {
		List<Square> squares = new ArrayList<Square>();
		for(final int position : positions) {
			if(isValidPosition(position)) {
				squares.add(board.getSquare(position));
			}
		}
		return squares;
	}

	private List<Integer> getPositions() {
		List<Integer> positions = new ArrayList<Integer>();
		for(final int candidate_move : CANDIDATE_MOVES) {
			positions.add(current_position + candidate_move);
		}
		return positions;
	}

	private boolean isValidPosition(int position) {
		return position >= 0 && position <= 64;
	}
	
	private boolean isOccupiedWithOtherPlayersPiece(Square square) {
		return square.isOccupied() && !square.getPiece().pieceColor.equals(this.pieceColor);
	}

}
