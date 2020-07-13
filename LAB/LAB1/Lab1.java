// Lab1.java STARTER FILE

import java.io.*; // I/O
import java.util.*; // Scanner class

public class Lab1
{
	public static void main( String args[] ) 
	{
		final double MILES_PER_MARATHON = 26.21875; // i.e 26 miles 285 yards

		Scanner kbd = new Scanner (System.in); // DO NOT USE COMMAND ARGS

		// THE FOLLOWING THREE VARIABLES ARE PRINTED OUT AT THE END OF THE PROGRAM
		double aveMPH=0, aveMinsPerMile=0, aveSecsPerMile=0;

		// YOUR JOB IS TO DO WHAT YOU HAVE TO TO TO PUT THE CORRECT VALUES INTO THEM
		// BEFORE THEY GET PRINTED OUT AT THE BOTTOM

		System.out.print("Enter marathon time in hrs minutes seconds: "); // i.e. 3 49 37
		// DO NOT WRITE OR MODIFY ANYTHING ABOVE THIS LINE


		// ========================================================================================
		//  - - - - - - - - - - - A L L   Y O U R   C O D E   H E R E - - - - - - - - - - - - - - - 
		// USE 3 SEPARATE CALLS TO .nextDouble() TO READ NUMBERS USER IS TYPING ON KEYBOARD
		double hours = kbd.nextDouble();
		double minutes = kbd.nextDouble();
		double seconds = kbd.nextDouble();

		double totalHours = hours + minutes/60 + seconds/3600;
		double totalMinutes = hours*60 +minutes + seconds/60;
		double totalSeconds = hours*3600 + minutes*60 + seconds;

		aveMPH = MILES_PER_MARATHON/totalHours;

		double totalMinutesPerMile = totalMinutes/MILES_PER_MARATHON;
		int testInMinutes = (int) totalMinutesPerMile;
		aveMinsPerMile = testInMinutes;

		double totalSecondsPerMile = totalSeconds/MILES_PER_MARATHON;
		aveSecsPerMile = totalSecondsPerMile - aveMinsPerMile*60;    

		// ========================================================================================


		// DO NOT WRITE OR MODIFY ANYTHING BELOW THIS LINE. JUST LET MY CODE PRINT THE VALUES YOU PUT INTO THE 3 VARS
		System.out.println();
		System.out.format("Average MPH was: %.2f mph\n", aveMPH  );
		System.out.format("Average mile split was %.0f mins %.1f seconds per mile", aveMinsPerMile, aveSecsPerMile );
		System.out.println();

	} // END MAIN METHOD
} // EOF