package chess;

import chessPieces.*;

public class Player {

	private PieceColor pieceColor;
	private PlayerEngine engine;
	
	public Player(PlayerEngine engine, PieceColor pieceColor) {
		this.engine = engine;
		this.pieceColor = pieceColor;
	}

	public Move makeMove(Board board) {
		// TODO Auto-generated method stub
		return null;
	}
}
