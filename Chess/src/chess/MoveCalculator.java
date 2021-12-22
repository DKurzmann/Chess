package chess;

import java.util.ArrayList;
import java.util.List;

import chessPieces.Piece;

public class MoveCalculator {
	
	private Piece piece;
	private int[] candidateMoves;
	private  Board board;
	private int currentPosition;
	private List<Integer>positions = new ArrayList<Integer>();
	private List<Square> squares = new ArrayList<Square>();
	private List<Move> moves = new ArrayList<Move>();
	
	public MoveCalculator(Piece piece, int[] candidateMoves, Board board) {
		this.piece = piece;
		this.candidateMoves = candidateMoves;
		this.board = board;
		this.currentPosition = piece.getCurrentPosition();
	}
	
	public List<Move> calculate(){
		positions = getPositions();
		squares = getSquares(positions, board);
		moves = getMoves(squares); 
		return moves;
	}

	private List<Integer> getPositions() {
		for(final int candidate_move : candidateMoves) {
			positions.add(currentPosition + candidate_move);
		}
		return positions;
	}
	
	private List<Square> getSquares(List<Integer> positions, Board board) {
		for(final int position : positions) {
			if(isValidPosition(position)) {
				squares.add(board.getSquare(position));
			}
		}
		return squares;
	}

	private List<Move> getMoves(List<Square> squares) {
		for(Square square : squares) {
			if( square.isOccupied() == false) {
				moves.add(new Move());
			} else if(isOccupiedWithOtherPlayersPiece(square)){
				moves.add(new Move());
			}
		}
		return moves;
	}
	
	private boolean isValidPosition(int position) {
		return position >= 0 && position <= 64;
	}
	
	private boolean isOccupiedWithOtherPlayersPiece(Square square) {
		return square.isOccupied() && !square.getPiece().getPieceColor().equals(piece.getPieceColor());
	}
}
