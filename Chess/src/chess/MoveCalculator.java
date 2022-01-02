package chess;

import java.util.ArrayList;
import java.util.List;

import chess.Move.AttackMove;
import chess.Move.MajorMove;
import chessPieces.Piece;

public class MoveCalculator {
	
	private Piece piece;
	private int[] candidateMoves;
	private  Board board;
	private int currentPosition;
	private List<Integer>positions = new ArrayList<Integer>();
	private List<Square> squares = new ArrayList<Square>();
	private List<Move> moves = new ArrayList<Move>();
	
	public MoveCalculator(Piece piece, Board board) {
		this.piece = piece;
		this.candidateMoves = piece.getCandidateMoves();
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
			if(piece.isFirstColumnExclusion(currentPosition, candidate_move) ||
					piece.isSecondColumnExclusion(currentPosition, candidate_move) ||
					piece.isSeventhColumnExclusion(currentPosition, candidate_move) ||
					piece.isEigthColumnExclusion(currentPosition, candidate_move)){
				positions.add(currentPosition + candidate_move);
			}
		}
		return positions;
	}
	
	private List<Square> getSquares(List<Integer> positions, Board board) {
		for(final int position : positions) {
			if(BoardUtils.isValidPosition(position)) {
				squares.add(board.getSquare(position));
			}
		}
		return squares;
	}

	private List<Move> getMoves(List<Square> squares) {
		for(Square square : squares) {
			if( square.isOccupied() == false) {
				moves.add(new MajorMove(board, piece, square.coordinate));
			} else if(isOccupiedWithOtherPlayersPiece(square)){
				moves.add(new AttackMove(board, piece, square.coordinate, square.getPiece()));
			}
		}
		return moves;
	}
	

	
	private boolean isOccupiedWithOtherPlayersPiece(Square square) {
		return square.isOccupied() && !square.getPiece().getPieceColor().equals(piece.getPieceColor());
	}
}
