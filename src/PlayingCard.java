
public class PlayingCard {

	private int mySuit, myValue;
	private String[] suits = {"Clubs","Hearts","Diamonds","Spades"};
	private String[] values = {"","Ace","2","3","4","5","6","7","8","9","10","Jack","Queen","King"};
	
	public PlayingCard(int s, int v)
	{
		mySuit = s;
		myValue = v;
	}
	
	public String toString()
	{
		return values[myValue]+" of "+suits[mySuit];
	}

	public int getMySuit() 
	{
		return mySuit;
	}

	public int getMyValue() 
	{
		return myValue;
	}
}
