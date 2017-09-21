
public class Deck 
{
	private PlayingCard[] myCards;
	
	public Deck()
	{
		myCards = new PlayingCard[52];
		int counter = 0;
		for (int suit = 0; suit < 4; suit++)
			for (int value = 1; value <= 13; value++)
			{
				myCards[counter] = new PlayingCard(suit, value);
				counter++;
			}
	}
	
	public String toString()
	{
		String result = "";
		
		for (PlayingCard c : myCards)
			result += c + "\n";
		return result;
	}
	
	
	
	public void shuffle()
	{
		// swap random cards 100 times.
		for (int i = 0; i< 100; i++)
		{
			int a = (int)(Math.random()*52);
			int b = (int)(Math.random()*52);
			
			PlayingCard temp = myCards[a];
			myCards[a] = myCards[b];
			myCards[b] = temp;
		}
	}
}
