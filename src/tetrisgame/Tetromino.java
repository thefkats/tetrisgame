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

	public int[] rotateR() {
		orientation++;
		return null;
	}

	public int[] rotateL() {
		orientation--;
		return null;
	}

	public char getPiece() {
		return piece;
	}

	private boolean testRotation(int[] transition) {

		return false;
	}

	/**
	 * 4D boolean array :D. First index specifies piece (i, j, l, o, s, t, z),
	 * 2nd specifies rotation, 3rd specifies row, 4th specifies column. Eg:
	 * PIECES[1][2][0][1] = false (J piece, upside down, row 0, column 1).
	 */
	private static final boolean[][][][] PIECES = {
			{ { { false, false, false, false }, { true, true, true, true }, { false, false, false, false },
					{ false, false, false, false } },
					{ { false, false, true, false }, { false, false, true, false }, { false, false, true, false },
							{ false, false, true, false } },
					{ { false, false, false, false }, { false, false, false, false }, { true, true, true, true },
							{ false, false, false, false } },
					{ { false, true, false, false }, { false, true, false, false }, { false, true, false, false },
							{ false, true, false, false } } },
			{ { { true, false, false }, { true, true, true }, { false, false, false } },
					{ { false, true, true }, { false, true, false }, { false, true, false } },
					{ { false, false, false }, { true, true, true }, { false, false, true } },
					{ { false, true, false }, { false, true, false }, { true, true, false } } },
			{ { { false, false, true }, { true, true, true }, { false, false, false } },
					{ { false, true, false }, { false, true, false }, { false, true, true } },
					{ { false, false, false }, { true, true, true }, { true, false, false } },
					{ { true, true, false }, { false, true, false }, { false, true, false } } },
			{ { { true, true }, { true, true } }, { { true, true }, { true, true } },
					{ { true, true }, { true, true } }, { { true, true }, { true, true } } },
			{ { { false, true, true }, { true, true, false }, { false, false, false } },
					{ { false, true, false }, { false, true, true }, { false, false, true } },
					{ { false, false, false }, { false, true, true }, { true, true, false } },
					{ { true, false, false }, { true, true, false }, { false, true, false } } },
			{ { { false, true, false }, { true, true, true }, { false, false, false } },
					{ { false, true, false }, { false, true, true }, { false, true, false } },
					{ { false, false, false }, { true, true, true }, { false, true, false } },
					{ { false, true, false }, { true, true, false }, { false, true, false } } },
			{ { { true, true, false }, { false, true, true }, { false, false, false } },
					{ { false, false, true }, { false, true, true }, { false, true, false } },
					{ { false, false, false }, { true, true, false }, { false, true, true } },
					{ { false, true, false }, { true, true, false }, { true, false, false } } } };
}
