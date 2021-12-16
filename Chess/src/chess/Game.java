package chess;

import java.util.*;

import chessPieces.*;

public class Game {
	private List<Move> playedMoves;
	private PieceColor turn;
	private Player player1;
	private Player player2;
	private Result result;
	private CheckStatus checkStatus;
	private Board board;
	
	public Game(ComputerPlayer computerPlayer1, ComputerPlayer computerPlayer2) {
		this.player1 = new Player(computerPlayer1, PieceColor.White);
		this.player2 = new Player(computerPlayer2, PieceColor.Black);
		this.refresh();
	}
	
	public void addMove() {
		Player player;
		if(turn == PieceColor.White) {
			player = player1;
		} else {
			player = player2;
		}
		
		Move move = player.makeMove(board);
		
		//Move in played Moves eintragen
			
	}
	
	public void refresh() {
		playedMoves = new ArrayList<Move>();
		turn = PieceColor.White;
		result = Result.None;
		checkStatus = CheckStatus.None;
		board = new Board();
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
		Game game = new Game(new ComputerPlayer(), new ComputerPlayer());
		while(!game.isEnded()) {
			game.addMove();
		}
	}

}
