package connect4;

public class Q1_ValidBoardSquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		// solved

		System.out.println(Q1_ValidBoardSquare('E'));


	}
       // Method for checking board imputs.
	public static boolean Q1_ValidBoardSquare(char c) {

		if (c == 'R') {

			return true;
		} else if (c == 'Y') {

			return true;
		} else if (c == '.') {

			return true;
		} else {

			return false;
		}

	}
}
