import java.util.*;
import java.io.*;

public class Jumbles
{
	public static void main(String[] args) throws Exception 
	{

		ArrayList<String> pairs = new ArrayList<String>(); // step 1
        BufferedReader dFile = new BufferedReader( new FileReader(args[0]) ); //step 2

        while ( dFile.ready() ) // i.e. while there is another line (word) in the file
		{
			String dWord = dFile.readLine();
			pairs.add(canonical(dWord) + " " + dWord);
		} //END WHILE wordFile
		dFile.close();
		Collections.sort(pairs); //sort pairs 

		// setp 3 DECLARE TWO ARRAYLISTS OF STRING NAMED dCanons  and dWords
		ArrayList<String> dCanons = new ArrayList<String>();
		ArrayList<String> dWords = new ArrayList<String>();


		//step4 
		for (String wordInList : pairs) 
		{
			String line = wordInList;
			String[] pair = line.split( "\\s+");
			dCanons.add(pair[0]);
			dWords.add(pair[1]);
		}


		//step5 read the jumbles file
		ArrayList<String> jWords = new ArrayList<String>();
        BufferedReader jFile = new BufferedReader( new FileReader(args[1]) );
        
        while ( jFile.ready() )
        {
        	String jWord = jFile.readLine();
        	jWords.add(jWord);
        }
        jFile.close();
        Collections.sort(jWords);

        for (String jwordInList : jWords)
        {
        	System.out.print(jwordInList);
        	String jCanon = canonical(jwordInList);
        	int index = Collections.binarySearch( dCanons, jCanon );
        	if (index >= 0) 
        	{
        		while(index > 0 && dCanons.get(index).equals(dCanons.get(index-1)))
        		{
        			index--;
        		}
        		while(index < dCanons.size() && dCanons.get(index).equals(jCanon))
        		{
        			System.out.print(" " + dWords.get(index++));
        		}
        		
        	}
        	System.out.println();

        } 		
 		
	}

	static String canonical (String word)
	{
		char[] letters = word.toCharArray();
		Arrays.sort(letters);
		return new String(letters);
	}
}
