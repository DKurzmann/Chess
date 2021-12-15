package chess;

import java.util.List;

import chessPieces.*;

public class Game {
	private List<Move> playedMoves;
	private PieceColor turn;
	private Player[] players;
	private Result result;
	private CheckStatus checkStatus;
	
	public void addMove() {
		
	}
	
	public void create() {
		
	}
	
	public boolean isEnded() {
		return checkStatus == CheckStatus.WhiteCheckmated || checkStatus == CheckStatus.BlackCheckmated;
	}
	
	public boolean isChecked() {
		return true;
	}
	
	public void operation() {
		
	}
	
	public boolean isCheckmated() {
		return true;
	}
	
	public static void main(String[] args) {
		Game game = new Game();
		while(!game.isEnded()) {
			game.addMove();
		}
	}

}
