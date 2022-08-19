package connect4;

import java.util.ArrayList;

public class Q4_ValidMoves {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[][] board = { { '.', '.', 'Y', 'Y', 'Y', 'Y', 'R' }, { 'R', 'R', 'R', 'R', 'Y', 'Y', 'R' },
				{ 'R', 'R', 'R', 'Y', 'Y', 'Y', 'R' }, { 'R', 'R', 'R', 'Y', 'Y', 'Y', 'Y' },
				{ 'R', 'R', 'R', 'Y', 'Y', 'Y', 'Y' }, { 'R', 'R', 'R', 'Y', 'Y', 'Y', 'Y' },

		};
		System.out.println(Q4_ValidMoves(board));
	}

    // Method that returns all possible moves that can be made within the board.
	
	public static ArrayList<Integer> Q4_ValidMoves(char board[][]) {
		ArrayList<Integer> Listofmoves = new ArrayList<>();
		
			if (board[0][0] == '.') {
				Listofmoves.add(0);
			}
			if (board[0][1] == '.') {
				Listofmoves.add(1);
			}
			if (board[0][2] == '.') {
				Listofmoves.add(2);
			}
			if (board[0][3] == '.') {
				Listofmoves.add(3);
			}
			if (board[0][4] == '.') {
				Listofmoves.add(4);
			}
			if (board[0][5] == '.') {
				Listofmoves.add(5);
			}
			if (board[0][6] == '.') {
				Listofmoves.add(6);
			}
			return Listofmoves;
		
	}
	
	
}
