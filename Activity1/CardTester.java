/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
		Card card1 = new Card("king", "hearts", 13);
		Card card2 = new Card("one", "spades", 1);
		Card card3 = new Card("five", "clubs", 5);

		String x = card1.toString();
		System.out.print(x);
	}
}
