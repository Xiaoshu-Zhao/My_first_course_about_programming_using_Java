
	//Exercise1.java
	
	//- WRITE A SINGLE DO LOOP THAT DOES THE FOLLOWING UNTIL THE USER ENTERS A VALID INPUT FILENAME
	//- PROMPT THE USER FOR A FILENAME AND USE TRY CATCH TO RE-PROMPT
	//- IF INPUT IS NOT AN INT YOU MUST CLERA THE BUFFER BECUASE THAT BOGUS STRING IS STILL IN THERE 
	//- ONCE OUT OF THE LOOP JUST DO THE CODE THAT PRINTS THE TOKENS FROM THE FILE.

	
import java.io.*;
import java.util.*;
public class Exercise1
{
	public static void main( String args[] ) 
	{
		if (args.length < 1)
		{
			System.out.println("\nYou must enter an input filename on cmd line!\n");
			System.exit(0);
		}

		
		// MODIFY, REPLACE, ADD LOOP CODE, ADD TRY CATCH BLOCK(S) AS NEEDED BELOW
		String filename = args[0];
		Scanner keyboard = new Scanner(System.in);
		Scanner infile = null;

		do{
			try{
				infile = new Scanner( new File(filename));
			}
			catch(FileNotFoundException e){
				System.out.println("please re-enter the filename");
				filename = keyboard.nextLine();
			}
		}while(infile == null);




		// THE CODE BELOW IS -AFTER, BELOW AND OUTSIDE OF- THE ABOVE LOOP 
		
		while (infile.hasNext())
		{
			String token = infile.next(); // read a string from infile
			System.out.printf("%s\n", token);
		}
	}
} //END CLASS