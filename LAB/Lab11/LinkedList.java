import java.io.*;
import java.util.*;

public class LinkedList
{
	private ListElem head;  // REF TO 1ST ELEM IN LIST

	// #######################################################################
	// #### G I V E N  A S  I S.  D O  N O T  M O D I F Y / D E L E T E   ####
	// #######################################################################

	public LinkedList()
	{	head = null; //MUST BE INIALIZED TO NULL
	}

	// LOAD LINKED LIST FROM INCOMING FILE
	public LinkedList( String fileName ) 
	{	Scanner infile=null;
		try
		{	infile = new Scanner( new File( fileName ) );
		}
		catch ( Exception e )
		{	System.out.println( "FATAL ERROR: " + e );
			System.exit(0);
		}
		while ( infile.hasNext() ) insertAtFront( infile.next() );  
		infile.close();
	}	
	
	// SPLICE NEW ELEM ONTO FRONT PUSH EXISTING ELEMs TO RIGHT
	public void insertAtFront( String data)
	{	
		head = new ListElem(data, head);
	}

	// $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	// $$$$$ Y O U  W R I T E  T H E S E  F O U R  M E T H O D S  B E L O W $$$$$
	// $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$

	// WORTH 15%  WRITE & TEST THIS ONE FIRST
	// OF COURSE MORE EFFICIENT TO KEEP INTERNAL COUNTER BUT YOU MUST COMPUTE DYNAMICALLY WITH TRAVERSAL
	public int size()
	{	// REPLACE W/YOUR CODE. TTRAVERSE LIST & COUNT ListElemS
		ListElem curr = head;
		int count = 0;
		while(curr != null){
			count++;
			curr = curr.getNext();
		}
		return count;
	}
	
	// WORTH 25%  WRITE & TEST THIS ONE SECOND
	public void printList()
	{
		ListElem curr = head;
		while(curr != null){
			if (curr.getNext() == null){
				System.out.print(curr.getData());
			}

			else{
				System.out.print(curr.getData() + "->");
			}
			curr = curr.getNext();
		}
		System.out.println();

	}

	// WORTH 35% WRITE & TEST THIS ONE THIRD
	// RETURN TRUE/FALSE ListElem CONTAINING KEY FOUND IN LIST
	public boolean contains( String key )
	{
		ListElem curr = head;
		while(curr != null){
			if(curr.getData().equals(key)) return true;
			curr = curr.getNext();
		}

		return false;
	}

	// WORTH 25%   WRITE & TEST THIS ONE LAST. NOT ALLOWED TO DECLARE ANY ADDITINAL DATA STRUCTURES 
	// DO NOT PUT ANY ARRAOWS BETWEEN ELEMENTS. JUST PUT ONE SPACE BETWEEN
	public void printListRev()
	{
		help(head);
		System.out.println();

	}

	public void help( ListElem heads)
	{
		if(heads ==null ) return;
		help(heads.getNext());
		System.out.print(heads.getData() + " ");
	}

} //END LINKEDLIST CLASS
