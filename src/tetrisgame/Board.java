package tetrisgame;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JPanel;

public class Board extends JPanel {

	/**
	 * Serial Version UID.
	 */
	private static final long serialVersionUID = 5445690255082936398L;

	private UpNext upNext;
	
	/**
	 * Mode this board is in. 0 is default, 1 is 4 pre-setup 4 wide.
	 */
	private int mode;

	/**
	 * 2D array of characters that stores this board's state. Tetromino colors:
	 * i, j, l, o, s, t, z. Other colors: g = garbage, '-' = empty.
	 */
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
		setPreferredSize(new Dimension(200, 400));
		setBackground(Color.BLACK);
		
		upNext = new UpNext();

		this.mode = mode;
		board = new char[20][10];

		switch (mode) {
		case 1:
			for (int row = 0; row < 20; row++) {
				for (int col = 0; col < 10; col++) {
					if (col > 2 && row < 7)
						board[row][col] = '-';
					else
						board[row][col] = 'g';
				}
			}
			break;
		default:
			for (int row = 0; row < 20; row++) {
				for (int col = 0; col < 10; col++) {
					board[row][col] = '-';
				}
			}
		}
	}

	/**
	 * Tries to add a piece.
	 * 
	 * @return true if successful, false if game is ended
	 */
	public boolean addPiece() {
		return false;
	}
}

class UpNext extends JPanel{

	/**
	 * Serial Version UID
	 */
	private static final long serialVersionUID = -487853774346700236L;
	
	private Tetromino[] upNext;
	
	UpNext() {
		setup();
	}
	
	private void setup() {
		setPreferredSize(new Dimension(200, 400));
		setBackground(Color.BLACK);
		
		
		upNext = new Tetromino[7];
	}
	
}
