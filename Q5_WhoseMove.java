package connect4;

public class Q5_WhoseMove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[][] board = { 
				{ 'R', '.', 'Y', 'Y', 'Y', 'Y', 'R' },
				{ 'R', 'R', 'R', 'R', 'Y', 'Y', 'R' },
				{ 'R', 'R', 'R', 'Y', 'Y', 'Y', 'R' },
				{ 'R', 'R', 'R', 'Y', 'Y', 'Y', 'Y' },
				{ 'R', 'R', 'R', 'Y', 'Y', 'Y', 'Y' },
				{ 'R', 'R', 'R', 'Y', 'Y', 'Y', 'Y' },

		};
		System.out.println(Q5_WhoseMove(board));
	}

	
	


	
	
    // Method which decides who's move is.	
	
	public static char Q5_WhoseMove(char board[][]) {

		int Rcount = 0;
		int Ycount = 0;
	
		char result = 'x';

		
			for (int i = 5; i >= 0; i--) {

				for (int j = 0; j < 7; j++) {

					if (board[i][j] == 'R') {
						Rcount = Rcount + 1;
					}
					if (board[i][j] == 'Y') {
						Ycount = Ycount + 1;
					}
				}
			}
			;
			

			if (Rcount + Ycount == 42) {
				result = '.';
				return result;

			}
			if (Rcount - Ycount == 0) {

				result = 'R';

				return result;
			}
			if (Rcount - Ycount == 1) {

				result = 'Y';

				return result;
			}
			if (Rcount - Ycount == -1) {

				result = 'R';
				return result;
			}

	

		return result;

	}
	
	
	
	
}
