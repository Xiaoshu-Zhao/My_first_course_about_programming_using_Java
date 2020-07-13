/*
	DiceTester.java - tests the Dice class
	DO NOT MODIFY
*/
public class DiceTester
{
  public static void main( String args[] )
  {
    Dice die1 = new Dice(17);
    Dice die2 = new Dice(3);

	// ROLL DICE 20 TIMES PRINT RESULTS

    System.out.println("\nRolling a pair of dice 20 times.");
    for (int i=0 ; i<20 ; ++i)
            System.out.print( die1.roll() + "," +  die2.roll() + "  "); // Each dice equal chance of 1,2,3,4,5 or 6
   	 System.out.println();

    System.out.println("die1 stats:");
    die1.printStats();
    System.out.println("die2 stats:");
    die2.printStats();

    die1.reset(); // resets all roll counts to 0
 	die2.reset(); // resets all roll counts to 0

	// ROLL DICE 20 TIMES PRINT RESULTS

    System.out.println("\nRolling a pair of dice 20 times.");
    for (int i=0 ; i<20 ; ++i)
            System.out.print( die1.roll() + "," +  die2.roll() + "  "); // Each dice equal chance of 1,2,3,4,5 or 6
   	 System.out.println();

    System.out.println("die1 stats:");
    die1.printStats();
    System.out.println("die2 stats:");
    die2.printStats();

    die1.reset(); // resets all roll counts to 0
 	die2.reset(); // resets all roll counts to 0

   }// END main
}//EOF