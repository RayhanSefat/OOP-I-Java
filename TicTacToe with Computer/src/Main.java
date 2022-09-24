import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Select the first player: ");
		System.out.println("	1.X	2.O");
		
		int chooseCommand = 0;
		while(chooseCommand!=1 &&  chooseCommand!=2) {
			chooseCommand = sc.nextInt();
		}
		
		char player1Sign='X';
		char player2Sign='O';
		
		if(chooseCommand==2) {
			player1Sign='O';
			player2Sign='X';
		}
		
		TicTacToe Board = new TicTacToe();
		
		Board.printBoard();
		
		char moveSign = player1Sign;
		
		for(int i=1; i<=9; i++) {
			int row=-1, collumn=-1;
			
			if(i%2==1) {
				System.out.println("Move for Player 1: ");
			}else {
				System.out.println("Move for Player 2: ");
			}
			
			if(i%2==1) System.out.print("Enter the row and collumn of the cell where you want to perform the move: ");
			
			int result = 0;
			
			while(result==0){
				if(i%2==1) {
					row = sc.nextInt();
					collumn  = sc.nextInt();
				}else {
					row = (int)(Math.random()*3)+1;
					collumn = (int)(Math.random()*3)+1;
				}
				result = Board.performAMove(moveSign, row, collumn, i%2);
			}
			
			Board.printBoard();
			
			if(result!=-1) {
				if(result==chooseCommand) {
					System.out.println("Player 1 wins!");
				}
				
				else {
					System.out.println("Player 1 wins!");
				}
				
				return;
			}
			
			if(moveSign=='X') moveSign='O';
			else moveSign='X';
		}

		System.out.println("The game is drawn!");
	}
}
