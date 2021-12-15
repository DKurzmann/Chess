package chess;

import java.util.*;
import chessPieces.*;

public class PieceSet {
	
	private List<IPiece> pieces = new ArrayList<IPiece>(16);
	private PieceColor color;
	
	public PieceSet(PieceColor color) {
		this.color = color;
		generatePieces();
	}

	private void generatePieces() {
		pieces.add(new King());
		pieces.add(new Queen());
		pieces.add(new Knight());
		pieces.add(new Knight());
		pieces.add(new Bishop());
		pieces.add(new Bishop());
		pieces.add(new Rook());
		pieces.add(new Rook());
		pieces.add(new Pawn());
		pieces.add(new Pawn());
		pieces.add(new Pawn());
		pieces.add(new Pawn());
		pieces.add(new Pawn());
		pieces.add(new Pawn());
		pieces.add(new Pawn());
		pieces.add(new Pawn());
	}

}
