import java.util.Scanner;
public class TicTacToeGame 
{
	public static void main(String[] args)
	{
		boolean done;
		int player = 1;
		char[][] board = new char[3][3];

		initBoard(board);
		displayBoard(board);
		do {
			makeMove(board, player);
			done = checkWin(board, player);
			displayBoard(board);
			if (player == 1) 
				player = 2;
			else if (player == 2)
				player = 1;
		} while (done == false);
		if (player == 2)
			System.out.println("Player 1 wins the game!");
		else 
			System.out.println("Player 2 wins the game!");
	}
	public static void initBoard(char[][] boardMatrix) 
	{
		int i,j;
		for (i=0; i<3; i++)
			for (j=0; j<3; j++)
				boardMatrix[i][j] = ' ';
	}
	public static void displayBoard(char[][] boardMatrix)	
	{
		int t;
		System.out.println("[1] [2] [3]");
		for (t=0; t<3; t++) 
		{
			System.out.print(" "+ boardMatrix[t][0] + "   " + boardMatrix[t][1] + "   " + 
			boardMatrix[t][2] + "\t  " + "[" + (t+1) + "]");
			if (t != 2)
				System.out.print("\n---|---|---\n");
		}
		System.out.println();
	}
	public static void makeMove(char[][] boardMatrix, int player)
	{
		int x,y;
		Scanner sc = new Scanner(System.in);

		do {
			System.out.print("Player " + player + 
				" - Enter X and Y coordinates: ");
			x = sc.nextInt();
			y = sc.nextInt();
			if (boardMatrix[x-1][y-1] != ' ') 
				System.out.println("Invalid move! Try again...");
		} 	while (boardMatrix[x-1][y-1] != ' ');
		if (player == 1) 
			boardMatrix[x-1][y-1] = 'X';
		else 
			boardMatrix[x-1][y-1] = 'O';
	}
	public static boolean checkWin(char[][] boardMatrix, int player) 
	{
		int i,j;
		char ch;
		boolean status = false;

		if (player == 1)
			ch = 'X';
		else
			ch = 'O';

		// check diagonals for winning pattern
		if (boardMatrix[0][0] == ch && boardMatrix[1][1] == ch 
			&& boardMatrix[2][2] == ch) 
 			return status = true;
 						
		else if	(boardMatrix[2][0] == ch && boardMatrix[1][1] == ch && boardMatrix[0][2] == ch)
  			return status = true;

// check rows for winning pattern
for (i=0; i<3; ++i) 
{
if (boardMatrix[i][0] == ch && boardMatrix[i][1] == ch && boardMatrix[i][2] == ch)
	return status = true;
		}

// check columns for winning pattern
for (j=0; j<3; ++j)
if (boardMatrix[0][j] == ch && boardMatrix[1][j] == ch && boardMatrix[2][j] == ch)
	return status = true;

		return status;
	}

}					


