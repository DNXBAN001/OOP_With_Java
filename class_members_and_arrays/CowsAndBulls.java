package class_members_and_arrays;

/**
*Date : 20 July 2020
*@author Bandile Danxa
*/
public class CowsAndBulls
{

	//Constants
	public final static int NUM_DIGITS = 4;
	public final static int MAX_VALUE = 9876;
	public final static int MIN_VALUE = 1234;
	public final static int MAX_GUESSES = 10;
	private int numberOfGuesses;
	private NumberPicker n;
	private int secret;
	
	//Constructors
	public CowsAndBulls(int seed)
	{
		// Create a CowsAndBulls game using the given randomisation seed value to generate
		// a mystery number of NUM_DIGITS length, and that gives the player MAX_GUESSES guesses.
		 n = new NumberPicker(seed, MIN_VALUE, MAX_VALUE);
		 secret = n.nextInt();
		
	}
	/**
	 * Obtain the number of guesses remaining.
	 * @return remaining guesses
	 */
	public int guessesRemaining()
	{
		return this.MAX_GUESSES - this.numberOfGuesses;
	}
	/**
	 * Evaluates a guess that the mystery number is guessNumber, returning the outcome in the form
	 * of a Result object. Decrements guesses remaining.
	 * Assumes that game is not over.
	 * @param guessNumber
	 * @return
	 */
	public Result guess(int guessNumber)
	{
		int cows = NumberUtils.countIntersect(guessNumber, secret);
		int bulls = NumberUtils.countMatches(guessNumber, secret);
		Result result = new Result(cows, bulls);
		this.numberOfGuesses++;
		return result;
	}
	
	public int giveUp()
	{
		// End the game, returning the secretNumber.
		return secret;
	}
	
	public boolean gameOver()
	{
		// Returns true if (i) the secret number has been guessed, or (ii) there are no more guesses.
		return guessesRemaining()==0? true : false;
	}
}