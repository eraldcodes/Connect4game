package connect4;

public class Q2_ValidBoard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char [][] board={
				{'.' , '.' , '.' , '.' , '.' , '.' , '.'},
				{'.' , '.' , '.' , '.' , '.' , '.' , '.'},
				{'.' , '.' , '.' , '.' , '.' , '.' , '.'},
				{'.' , '.' , '.' , '.' , '.' , '.' , '.'},
				{'.' , '.' , '.' , '.' , 'R' , '.' , '.'},
				{'Y' , 'Y' , 'Y' , 'R' , 'R' , 'R' , 'Y'},
				
		};

		
		System.out.println(Q2_ValidBoard(board));
		

	    // Method for checking board validity.
	}
public static boolean Q2_ValidBoard(char board[][]) {
		
		// test1
		if (board != null) {
			int hight = board.length;
			int length = board[0].length;
			int Rcount = 0;
			int Ycount = 0;
			boolean Q2_ValidBoard = true;
			// test2
			if (length != 7 || hight != 6) {
				Q2_ValidBoard = false;
				return Q2_ValidBoard;
			}
			{
				// scanning the board to see if there is any invalid characters.
				for (int i = 5; i >= 0; i--) {
					for (int j = 0; j < 7; j++) {

						if (board[i][j] == 'R') {
							Rcount = Rcount + 1;
						}
						if (board[i][j] == 'Y') {
							Ycount = Ycount + 1;
						}
						// test3
						if ((board[i][j] != 'R') && (board[i][j] != 'Y') && (board[i][j] != '.')) {

							Q2_ValidBoard = false;
							return Q2_ValidBoard;
						}

						// test5
						if (i < 5) {
							if ((board[i][j] == 'R' || board[i][j] == 'Y') && board[i + 1][j] == '.') {

								Q2_ValidBoard = false;
								return Q2_ValidBoard;
							}
						}
					}
				} // test4
					// checking to see if there is difference between the number of R's and Y's
				if (Rcount + 1 == Ycount || Ycount + 1 == Rcount || Ycount == Rcount) {
					Q2_ValidBoard = true;
					return Q2_ValidBoard;
				} else {

					Q2_ValidBoard = false;
					return Q2_ValidBoard;
				}
				
			}

		}
		
		

		else {
			return false;
		}
		
	}
}
			
			
		 
