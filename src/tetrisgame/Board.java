package tetrisgame;

public class Board {

	private int mode;

	private char[][] board;

	public Board() {
		setup(0);
	}

	public Board(int mode) {
		setup(mode);
	}

	/**
	 * Sets up a new blank board with specified mode. Set mode to 0 for blank
	 * board.
	 * 
	 * @param mode
	 *            mode to use for this board
	 */
	private void setup(int mode) {
		this.mode = mode;
		board = new char[20][10];

		switch (mode) {
		case 1:
			
			break;
		default:
			for (int row = 0; row < 20; row++) {
				for (int col = 0; col < 10; col++) {
					board[row][col] = '-';
				}
			}
		}

	}

}
