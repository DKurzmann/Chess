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

}
