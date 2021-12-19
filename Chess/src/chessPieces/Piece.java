package chessPieces;

import chess.Square;

public abstract class Piece {
	
	 private PieceType type;
	 private Square placeAt;
	 private boolean moved;
	 protected final PieceColor pieceColor;
	 protected final int position;
	 
	 Piece(final int position, final PieceColor pieceColor){
		 this.position = position;
		 this.pieceColor = pieceColor;
	 }

}
