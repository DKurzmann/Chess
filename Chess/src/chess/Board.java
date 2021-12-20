package chess;

import chessPieces.PieceColor;

public class Board {
	
	private Square[] squares;
	private PieceSet[] pieceSets;
	private PieceColor pieceSetOnTop;
	
	public void create(){
		
	}

	public Square getSquare(int position) {
		return squares[position];
	}

}
