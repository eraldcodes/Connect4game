package connect4;

import java.util.ArrayList;

public class Q3_ValidMove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[][] board = { 
				{ 'Y', '.', 'T', 'Y', 'Y', 'Y', 'Y' },
				{ 'R', 'R', 'R', 'R', 'Y', 'Y', 'R' },
				{ 'R', 'R', 'R', 'Y', 'Y', 'Y', 'R' },
				{ 'R', 'R', 'R', 'Y', 'Y', 'Y', 'Y' },
				{ 'R', 'R', 'R', 'Y', 'Y', 'Y', 'Y' },
				{ 'R', 'R', 'R', 'Y', 'Y', 'Y', 'Y' },

		};
		System.out.println(Q3_ValidMove(1, board));
	}

    // Method for checking if a move is possible within a certain column.
	
	
public static boolean Q3_ValidMove(int col , char board[][]) {
		
		
		
		ArrayList<Character> currentColumn = new ArrayList<>();
		
		
        if (col >= 0 && col <=6) {
        	for (int j = 5; j > -1; j--) {
        		currentColumn.add(board[j][col]);
        	}
        	if (currentColumn.get(5) == '.') {
        		return true;
        	}
        }
		return false;
		}
      
        





}
	
	

			