package tetrisgame;

import java.util.Random;

/**
 * Generator used to generate tetrominos.
 * 
 * @author James Fkat
 *
 */
public class Generator {

	/**
	 * Seed this generator is using to generate new pieces.
	 */
	private long seed;

	/**
	 * Number of pieces this generator has generated.
	 */
	private int count;

	/**
	 * Random object that generates random numbers.
	 */
	private Random rand;

	/**
	 * Constructs a new generator with specified seed. The same seed will
	 * generate the random numbers in the same order.
	 * 
	 * @param seed
	 *            seed to make this generator with
	 */
	public Generator(long seed) {
		setup(seed);
	}

	/**
	 * Constructs a new generator with a randomly generated seed.
	 */
	public Generator() {
		Random r = new Random();
		setup(r.nextLong());
	}

	/**
	 * Sets up a generator.
	 * 
	 * @param seed
	 *            seed to use in this new generator
	 */
	private void setup(long seed) {
		this.seed = seed;
		rand = new Random(seed);
		count = 0;
	}

	/**
	 * Generates the next piece from this generator.
	 * 
	 * @return tetromino piece generated
	 */
	public Tetromino nextPiece() {
		count++;
		return new Tetromino(toChar(nextInt(rand)));
	}

	/**
	 * Gets the piece specified by int count. Eg: the second tetromino can be
	 * found by entering getPiece(2).
	 * 
	 * @param count
	 *            tetromino number generated
	 * @return tetromino which was generated after 'count' generations
	 * @throws IllegalArgumentException
	 *             count must be greater than 0
	 */
	public Tetromino getPiece(int count) throws IllegalArgumentException {
		if (count <= 0) {
			throw new IllegalArgumentException("int count must be greater than 0. Was: " + count);
		}

		int tempCount = 0;
		Random tempRand = new Random(seed);
		int num = 0;

		while (tempCount != count) {
			num = nextInt(tempRand);
			tempCount++;
		}

		return new Tetromino(toChar(num));
	}

	/**
	 * Returns the seed this generator is using.
	 * 
	 * @return a long number that this generator is using
	 */
	public long getSeed() {
		return seed;
	}

	/**
	 * This resets the generator so that it goes back to the state where no
	 * numbers have been generated.
	 */
	public void reset() {
		rand.setSeed(seed);
		count = 0;
	}

	/**
	 * Returns how many pieces this generator has generated.
	 * 
	 * @return and int that specifies the number of tetrominos generated
	 */
	public int getCount() {
		return count;
	}

	/**
	 * Gets the next character.
	 * 
	 * @return randomly generated character from this generator
	 */
	public char getChar() {
		return toChar(nextInt(rand));
	}

	/**
	 * Converts an int to a char. Chars correspond to the different tetrominos:
	 * i, j, l, o, s, t, and z. They are numbered alphabetically starting from 0
	 * (j is 1, z is 6).
	 * 
	 * @param pieceNum
	 *            number of the piece
	 * @return char which is either i, j, l, o, s, t, or z
	 * @throws IllegalArgumentException
	 *             pieceNum must be between 0 and 6 (inclusive)
	 */
	private static char toChar(int pieceNum) throws IllegalArgumentException {

		char piece;
		switch (pieceNum) {
		case 0:
			piece = 'i';
			break;
		case 1:
			piece = 'j';
			break;
		case 2:
			piece = 'l';
			break;
		case 3:
			piece = 'o';
			break;
		case 4:
			piece = 's';
			break;
		case 5:
			piece = 't';
			break;
		case 6:
			piece = 'z';
			break;
		default:
			throw new IllegalArgumentException(
					"The int pieceNum must be between 0 and 6 (inclusive). Was: " + pieceNum);
		}

		return piece;
	}

	/**
	 * Gets the next int from specified Random class.
	 * 
	 * @param rand
	 *            Random object to use
	 * @return int between 0 and 6 inclusive
	 */
	private static int nextInt(Random rand) {
		int next = (int) (rand.nextDouble() * 7);
		return next;
	}
}
