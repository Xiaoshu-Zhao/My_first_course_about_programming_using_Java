public class MyStringTester
{
	public static void main( String[] args )
	{
		MyString s1 = new MyString("Hello World");
		System.out.println( "s1=" + s1 );
		
		MyString s2 = new MyString(s1);
		System.out.println( "s2=" + s2 );
		
		if ( s1.equals( s2 ) )
			System.out.println( s1 + " identical to " + s2 );
		else
			System.out.println( s1 + " not identical to " + s2 );
		
		MyString s3 = new MyString( "GoodBye World" );
		System.out.println( "s3='" + s3 + "' and its length is: " + s3.length() );
		
		if ( s1.equals( s3 ) )
			System.out.println( s2 + " identical to " + s3 );
		else
			System.out.println( s1 + " not identical to " + s3 );
		
		s1=new MyString("albert"); s2=new MyString("alpha");
		System.out.println( "s1=" + s1 + "\ns2=" + s2 );
		System.out.println( "s1.compareTo(s2) ==> " + s1.compareTo(s2) ); // since "albert"  < "alpha" returns -1
		
		s1=new MyString("zebrano"); s2=new MyString("zebra");
		System.out.println( "s1=" + s1 + "\ns2=" + s2 );
		System.out.println( "s1.compareTo(s2) ==> " + s1.compareTo(s2) ); // since "zebrano"  > "zebra" returns 1		
		
		s1=new MyString("cattle"); s2=new MyString("catty");
		System.out.println( "s1=" + s1 + "\ns2=" + s2 );
		System.out.println( "s1.compareTo(s2) ==> " + s1.compareTo(s2) ); // since "cattle"  < "cattle" returns 1			
		
		s1=new MyString("pneumoencephalographically"); s2=new MyString("pneumoencephalographically");
		System.out.println( "s1=" + s1 + "\ns2=" + s2 );
		System.out.println( "s1.compareTo(s2) ==> " + s1.compareTo(s2) ); // returns 0 they are same string value
		
		System.out.println( "[4]'th letter of " + s3 + " is " + s3.charAt(4) );
	
		////////////////////////////////////////////////////////////////////////////////////////////////////////////
		//  MORE RIGOROUS TESTING SECTION FOR:  indexOf( MyStsring key );
		////////////////////////////////////////////////////////////////////////////////////////////////////////////

		MyString line, key; 
//	.......................................................................
		line = new MyString( "dog followed by anything" );
		key =  new MyString( "dog" );	
		System.out.println( "      012345678901234567890123"); 
		System.out.println( "LINE: dog followed by anything" );
		System.out.println( "KEY:  dog" );
		System.out.println( "CORRECT ANSWER IS: 0" );
		System.out.print(   "YOUR ANSWER IS:   "  );
		System.out.println( line.indexOf(key));

//	.......................................................................
		line = new MyString( "dowg dawwg days gdodg days" );
		key =  new MyString( "dog" );	
		System.out.println("\n");
		System.out.println( "      01234567890123456789012345"); 
		System.out.println( "LINE: dowg dawwg days gdodg days" );
		System.out.println( "KEY:  dog" );

		System.out.println( "CORRECT ANSWER IS: -1" );
		System.out.print(   "YOUR ANSWER IS:    "  );
		System.out.println( line.indexOf(key) );		
		
//	.......................................................................
		line = new MyString( "dem dang doggone dayz" );
		key =  new MyString( "dog" );	
		System.out.println("\n");
		System.out.println( "      012345678901234567890"); 
		System.out.println( "LINE: dem dang doggone dayz" );
		System.out.println( "KEY:  dog" );

		System.out.println( "CORRECT ANSWER IS: 9" );
		System.out.print(   "YOUR ANSWER IS:    "  );
		System.out.println( line.indexOf(key) );
		
//	.......................................................................
		line = new MyString( "dem dang doggone dayz" );
		key =  new MyString( "ding dang dong a dag a diz daz dingle a dangle diggity dawgg!" );	
		System.out.println("\n");
		System.out.println( "      012345678901234567890"); 
		System.out.println( "LINE: dem dang doggone dayz" );
		System.out.println( "KEY:  ding dang dong a dag a diz daz dingle a dangle diggity dawgg!" );

		System.out.println( "CORRECT ANSWER IS: -1" );
		System.out.print(   "YOUR ANSWER IS:    ");
		System.out.println( line.indexOf(key) );
		
//	.......................................................................
		line = new MyString( "dog" );
		key =  new MyString( "dogg" );	
		System.out.println("\n");
		System.out.println( "      012"); 
		System.out.println( "LINE: dog" );
		System.out.println( "KEY:  dogg" );

		System.out.println( "CORRECT ANSWER IS: -1" );
		System.out.print(   "YOUR ANSWER IS:    ");
		System.out.println( line.indexOf(key) );				
	} // END MAIN

} // END CLASS