package chessPieces;

import chess.Square;

public abstract class Piece {
	
	 private PieceType type;
	 private Square placeAt;
	 private boolean moved;
	 protected final PieceColor pieceColor;
	 protected final int current_position;
	 
	 
	 Piece(final int position, final PieceColor pieceColor){
		 this.current_position = position;
		 this.pieceColor = pieceColor;
	 }
	 
	 public PieceColor getPieceColor() {
		 return pieceColor;
	 }
	 
	 public int getCurrentPosition() {
		 return current_position;
	 }

	public abstract int[] getCandidateMoves();

	public abstract boolean isFirstColumnExclusion(int currentPosition, int candidate_move);

	public abstract boolean isSecondColumnExclusion(int currentPosition, int candidate_move);

	public abstract boolean isSeventhColumnExclusion(int currentPosition, int candidate_move);

	public abstract boolean isEigthColumnExclusion(int currentPosition, int candidate_move);

}
