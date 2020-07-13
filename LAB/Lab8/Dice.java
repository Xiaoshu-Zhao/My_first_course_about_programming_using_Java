import java.util.Random;
public class Dice
{
	private Random r;
	private int[] numDice = new int[6];

	public int getNumDice( int index)
	{
		return numDice[index];
	}

	public int setNumDice( int index, int value )
	{
		return numDice[index] = value;
	}

	public Dice( int seed )
	{
		r = new Random( seed );
		reset();
	}


    // create the method roll
	public int roll()
	{
		int side = r.nextInt(6);
		setNumDice( side, getNumDice(side) + 1);
		return side + 1;
	}


	public void printStats()
	{
		for (int i = 0; i < 6 ; i++ ) {
			System.out.println( (i + 1) + ":" + " " + getNumDice(i) );
		}

	}
		public void reset()
		{
			for (int i = 0; i < 6 ; i++ ) {
				setNumDice(i , 0);
			}
		} 
}