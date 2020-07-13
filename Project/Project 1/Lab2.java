// 2.java  STARTER FILE

import java.io.*;
import java.util.*;

public class Lab2
{
	static final int INITIAL_CAPACITY = 10;
	public static void main (String[] args) throws Exception
	{
		// ALWAYS TEST FIRST TO VERIFY USER PUT REQUIRED INPUT FILE NAME ON THE COMMAND LINE
		if (args.length < 1 )
		{
			System.out.println("\nusage: C:\\> java Lab2 filename\n"); // i.e. C:\> java Lab2 172822words.txt
			System.exit(0);
		}

		String[] wordList = new String[INITIAL_CAPACITY];
		int wordCount = 0;
		BufferedReader wordFile = new BufferedReader( new FileReader(args[0]) );

		// P R O C E S S   S T R I N G    F I L E
		while ( wordFile.ready() ) //wordFile.hasNextLine()// i.e. while there is another line (word) in the file
		{	// test first to see if array is full
			// if it is then double its length
			if( wordCount  == wordList.length)
			{
				wordList = upSizeArr(wordList);
			}
			wordList[wordCount++] = wordFile.nextLine();
			// now read next word directly into array

		} //END WHILE wordFile
		wordFile.close(); 
		
		// SORT THE ARRAY CORRECTLY *HERE* USING Arrays.sort()
		wordList = Arrays.sort(wordList,0,wordCount-1);
		
		// DO NOT ADD/MODIFY ANYTHING BELOW THIS LINE 
		
		System.out.format( "wordCount: %d\narray length: %d\nfirst word: %s\nlast word %s\n", wordCount,wordList.length,wordList[0],wordList[wordCount-1] );
	} // END MAIN

	//##################################################################################################
	// FYI. Methods that don't say private are by default, private (actually package/private)

	static String[] upSizeArr( String[] fullArr )
	{
		/* Y O U R  C O D E   H E R E */
		String new[] = new String[2 * fullArr.length];

		for (int i = 0; i < fullArr.length ; i++) {

			new[i] = fullArr[i]
			
		}
		
		return null; // just to make it compile
	}
	
} // END CLASS LAB#2