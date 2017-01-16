package tetrisgame;

public class Tetromino {
	/**
	 * Character this piece is: either i, j, l, o, s, t, z.
	 */
	private char piece;

	/**
	 * Integer that stores orientation, between 0 and 3 (inclusive). Starts at
	 * 0, adds 1 when rotated right (CW), subtracts 1 when rotated left (CCW).
	 */
	private int orientation;

	/**
	 * Constructs a tetromino from specified character.
	 * 
	 * @param piece
	 */
	public Tetromino(char piece) {
		this.piece = piece;
		orientation = 0;
	}

	/**
	 * Constructs a random tetromino. No way to regenerate this, as generator
	 * used isn't saved.
	 */
	public Tetromino() {
		Generator g = new Generator();
		piece = g.getChar();
		orientation = 0;
	}

	public boolean rotateR() {
		orientation++;
		return true;

	}

	public boolean rotateL() {
		orientation--;
		return true;
	}

	public char getPiece() {
		return piece;
	}
}
