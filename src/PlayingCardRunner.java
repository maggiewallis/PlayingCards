
public class PlayingCardRunner 
{

	public static void main(String[] args) 
	{
		Deck testDeck = new Deck();
		System.out.println(testDeck);
		System.out.println("Shuffling\n--------------------------------");
		testDeck.shuffle();
		System.out.println(testDeck);
	}

}
