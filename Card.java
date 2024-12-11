package src;

public class Card
{
	private int suit;
	private int value;
	private int iD;
	static boolean[] dealt = new boolean[52];
	
	public Card()
	{
		iD = (int)(Math.random()*52);
		while (dealt[iD])
			iD = (int)(Math.random()*52);
		dealt[iD] = true;
		calculateCard();
	}
	
	private void calculateCard()
	{
		value = (iD%13)+1;
		suit = iD/13;
	}
	
	public void setID(int num)
	{
		iD=num;
		calculateCard();
	}
	
	public int getID()
	{
		return iD;
	}
	
	public String toString()
	{
		String returned = "";
		if(value==1)
			returned+='A';
		else if(value==10)
			returned+='X';
		else if(value==11)
			returned+='J';
		else if (value==12)
			returned+='Q';
		else if (value==13)
			returned+='K';
		else returned+=value;
		
		if(suit==0)
			returned+='c';
		else if(suit==1)
			returned+='d';
		else if (suit==2)
			returned+='h';
		else
			returned+='s';
		return returned;
	}
	
	public static void shuffle()
	{
		for (int i=0; i<52; i++)
		{
			dealt[i] = false;
		}
	}
}