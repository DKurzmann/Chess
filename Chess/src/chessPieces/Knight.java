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
		List<Move> moves = new ArrayList<Move>();
		for(final int candidate_move : CANDIDATE_MOVES) {
			int candidate_position = current_position + candidate_move;
			//is in board range?
			if(candidate_position >= 0 && candidate_position <= 64) {
				final Square candidateSquare = board.getSquare(candidate_position);
				//isOccupied?
				if(candidateSquare.isOccupied()) {
					//occupied with other players piece?
					if(!candidateSquare.getPiece().pieceColor.equals(this.pieceColor)){
						//This is a MOVE!
						moves.add(new Move());
					}
				} else {
				//not occupied?
					//this is a MOVE!
						moves.add(new Move());
				}
			}
		}
		return moves;
	}

}
