/*
	Coin.java THIS IS THE ONLY FILE YOU HAND IN
	THERE IS NO MAIN METHOD IN THIS CLASS!
*/
import java.util.Random;
public class Coin
{
	private final int TAILS = 0;
	private final int HEADS = 1;
	private Random r;
	private int numHeads, numTails;

	//access to get numheads and numtails;
	public int getNumHeads()
	{
		return numHeads;
	}
	public int getNumTails()
	{
		return numTails;
	}


    //method to set value in the HEADS
	private void setNumHeads(int h)
	{
		numHeads = h;
	}
	private void setNumTails(int t)
	{
		numTails = t;
	}


	// create the fake random number
	public Coin( int seed )
	{
		r = new Random( seed );
		reset();
	}


    // create the method filp
	public String flip()
	{
		int side = r.nextInt(2);
		if (side == HEADS) {
			setNumHeads(getNumHeads() + 1);
			return "H";			
		}


		else
		{
			setNumTails(getNumTails() + 1);
			return "T";
		}
	}

		public void reset()
		{
			setNumTails(0);
			setNumHeads(0);
		} 
} // END COIN CLASS