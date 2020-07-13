import java.io.*;
import java.util.*;
public class LLTester
{
	public static void main( String args[] ) throws Exception
	{	
		if ( args.length<2 ) die( "Missing input files on cmd line:\n==> java LLTester set1.txt set2.txt" );
		LinkedList list1 = new LinkedList( args[0] ); // INSERTATFRONT EACH TOKEN FROM FILE
		System.out.format( "list1 has %d elements: ",list1.size() ); 	list1.printList();
		System.out.print(  "list1 backwards order: " ); 				list1.printListRev();

		Scanner keysFile = new Scanner( new File( args[1] ) );
		while (keysFile.hasNext() )
		{	
			String key = keysFile.next();
			if ( list1.contains( key ) )
				System.out.println( key + "\tFOUND in " + args[0] );
			else
				System.out.println( key + "\tNOT found in " + args[0] );
		} // ENd WHILE
	} // END MAIN

	static void die( String errMsg )
	{	System.out.println( errMsg );
		System.exit(0);
	}
} // EOF