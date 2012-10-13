package mikera.randomz;

import java.util.Random;

/**
 * Static method class for random functions
 * 
 * @author Mike
 *
 */
public class Randomz {

	/**
	 * Creates a random number generator
	 * @return
	 */
	public static java.util.Random getGenerator() {
		return new mikera.util.Random();
	}

}
