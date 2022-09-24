public class TicTacToe {
	private char[][] board = {
			{' ', ' ', ' '},
			{' ', ' ', ' '},
			{' ', ' ', ' '}
	};
	
	public int performAMove(char playerSign, int row, int collumn, int human) {
		if(row<1 || row>3 || collumn<1 || collumn>3) {
			if(human==1) System.out.print("Invalid move. Pleaser enter the row and collumn again: ");
			return 0;
		}
		
		if(this.board[row-1][collumn-1]!=' ') {
			if(human==1) System.out.print("Invalid move. Pleaser enter the row and collumn again: ");
			return 0;
		}
		
		this.board[row-1][collumn-1]=playerSign;
		
		boolean thePlayerWins = checkResult();
		
		if(thePlayerWins) {
			if(playerSign=='X') return 1;
			return 2;
		}
		
		return -1;
	}
	
	private boolean checkResult() {
		for(int i=0; i<3; i++) {
			if(board[i][0]!=' ' && board[i][0]==board[i][1] && board[i][0]==board[i][2]) {
				return true;
			}
			
			if(board[0][i]!=' ' && board[0][i]==board[1][i] && board[0][i]==board[2][i]) {
				return true;
			}
		}
		
		if(board[0][0]!=' ' && board[0][0]==board[1][1] && board[1][1]==board[2][2]) {
			return true;
		}
		
		if(board[0][2]!=' ' && board[0][2]==board[1][1] && board[1][1]==board[2][0]) {
			return true;
		}
		
		return false;
	}
	
	public void printBoard() {
		System.out.println("|-|-|-| ");
		for(int i=0; i<3; i++) {
			System.out.print("|");
			for(int j=0; j<3; j++) {
				System.out.print(board[i][j]+"|");
			}
			System.out.println("");
			System.out.println("|-|-|-|");
		}
	}
}
