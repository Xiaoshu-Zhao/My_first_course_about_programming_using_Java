/* This class was borrowed and modified as needed with permission from it's original author
   Mark Stelhik ( http:///www.cs.cmu.edu/~mjs ).  You can find Mark's original presentation of
   this material in the links to his S-01 15111,  and F-01 15113 courses on his home page.
*/

import java.io.*;
import java.util.*;

public class Graph 
{
	private final int NO_EDGE = -1; // all real edges are positive
	private Edge G[];              // will point to a 2D array to hold our graph data

	private int numEdges;
	public Graph( String graphFileName ) throws Exception  // since readFild doesn't handle them either
	{
		loadGraphFile( graphFileName );
		
//		T E M P O R A R Y    C O D E    T O    V E R I F Y    P R I V A T E 
// 		M E T H O D S    W E    C A N T    C A L L    F R O M   T E S T E R 
//		      ........R E M O V E   A F T E R   T E S T I N G .......
/*
		for (int node = 0 ; node < G.length ; ++node )
		{
			System.out.format( "DEBUG:: in (%d)=%d  ",node,inDegree(node) );
			System.out.format( "out(%d)=%d  ",node,outDegree(node) );
			System.out.format( "deg(%d)=%d\n",node,degree(node) );
		}
		*/

	}

	///////////////////////////////////// LOAD GRAPH FILE //////////////////////////////////////////
	//
	// FIRST NUMBER IN GRAPH FILE IS THE SQUARE DIMENSION OF OUR 2D ARRAY
	// THE REST OF THE LINES EACH CONTAIN A TRIPLET <ROW,COL,WEIGHT> REPRESENTING AN EDGE IN THE GRAPH

	private void loadGraphFile( String graphFileName ) throws Exception
	{
		Scanner graphFile = new Scanner( new File( graphFileName ) );

		int dimension = graphFile.nextInt();   	// THE OF OUR N x N GRAPH
		for (int i = 0; i < dimension ;i++ ) {
			G[i] = new Edge(i, 0, null);
		}
		

	

		// NOW LOOP THRU THE FILE READING EACH TRIPLET row col weight FROM THE LINE
		// USE row & col AS WHERE TO STORE THE weight
		// i.e. g[row][col] = w;

		while ( graphFile.hasNextInt() )
		{
			// read in the row,col,weight // that eat us this line
			int source = graphFile.nextInt();
			int dest = graphFile.nextInt();			
			int weight = graphFile.nextInt();
			// call add edge
			addEdge(source, dest, weight);
		}
	} // END readGraphFile

	private void addEdge( int r, int c, int w )
	{
		G[r].next = new Edge(c, w, G[r].next);
		++numEdges; // only this method adds edges so we do increment counter here only
	}
	
  private boolean hasEdge(int fromNode, int toNode)
  {
  	if( G[fromNode][toNode] != 0) return true;
    return false; 
  }

	// IN DEGREE IS NUMBER OF ROADS INTO THIS CITY
	// NODE IS THE ROW COL#. IN DEGREE IS HOW MANY POSITIVE NUMBERS IN THAT COL
	private int inDegree(int node)
	{
		int count = 0;
		for (int i = 0; i < G.length; i++) {
			if( G[i][node] > 0) count++;
		}
		return count;
	}

	// OUT DEGREE IS NUMBER OF ROADS OUT OF THIS CITY
	// NODE IS THE ROW #. IN DEGREE IS HOW MANY POSITIVE NUMBERS IN THAT ROW
	private int outDegree(int node)
	{
		int count = 0;
		for (int i = 0; i < G.length; i++) {
			if( G[node][i] > 0) count++;
		}
		return count;
	}

	// DEGREE IS TOTAL NUMBER OF ROAD BOTH IN AND OUT OFR THE CITY 
	private int degree(int node)
	{
		return inDegree(node) + outDegree(node);
	}

	// PUBLIC METHODS 
	
	public int maxOutDegree()
	{
		int k = outDegree(0);
		for (int i = 1; i < G.length; i++) {
			if( k < outDegree(i)) k = outDegree(i);
		}
		return k;
	}

	public int maxInDegree()
	{
		int k = inDegree(0);
		for (int i = 1; i < G.length; i++) {
			if( k < inDegree(i)) k = inDegree(i);
		}
		return k;
	}

	public int minOutDegree()
	{
		int k = outDegree(0);
		for (int i = 1; i < G.length; i++) {
			if( k > outDegree(i)) k = outDegree(i);
		}
		return k;
	}

	public int minInDegree()
	{
		int k = inDegree(0);
		for (int i = 1; i < G.length; i++) {
			if( k > inDegree(i)) k = inDegree(i);
		}
		return k;
	}	
	
	public int maxDegree()
	{
        int k = degree(0);
		for (int i = 1; i < G.length; i++) {
			if( k < degree(i)) k = degree(i);
		}
		return k;
	}

	public int minDegree()
	{
		int k = degree(0);
		for (int i = 1; i < G.length; i++) {
			if( k > degree(i)) k = degree(i);
		}
		return k;
	}
	
	public void removeEdge(int fromNode, int toNode)
	{
		// if caller passes in a row col pair that 
		// out of bound or has no edge there, you must 
		// throw and catch an exception. See my output.
		try{
			if( fromNode >= G.length || toNode >= G.length || fromNode < 0 || toNode <0) throw new Exception("Non Existent Edge Exception: removeEdge(" + fromNode +  "," + toNode + ")");
			if(G[fromNode][toNode] <= 0) throw new Exception();
			G[fromNode][toNode] = NO_EDGE;
		}

		catch(Exception e){
			System.out.println(e);
		}  

       
		
		   //if the edge is there then remove it by writing 
		   //in a NO_EDGE value at that coordinate in the grid

	}
	
	// TOSTRING
	public String toString()
	{	String the2String = "";
		for (int r=0 ; r < G.length ;++r )
		{
			for ( int c=0 ; c < G[r].length ; ++c )
				the2String += String.format("%3s",G[r][c] + " ");
			the2String += "\n";
		}
		return the2String;
	} // END TOSTRING

}


// ADD THIS CODE INTO YOUR Graph.java FILE JUST LIKE YOU DID IN THE BSTs

class Edge
{
	// int dest, weight
	public int dest, weight;
	public Edge next;

	public Edge(int d, int w, Edge n)
	{
		dest = d;
		weight = w;
		next = n;
	}  
	// a Constructor that takes dest,weight, next
}

