public class MyString
{
	final int NOT_FOUND = -1; // USE THIS IN PLACE OF LITERAL -1

	private char[] letters;
	
	// DO NOT MODIFY THESE TWO CONTRUCTORS IN ANY WAY. USE AS GIVEN!
	public MyString( String other )
	{	
		letters = other.toCharArray(); // DO NOT CHANGE/ADD/MODIFY IN ANY WAY
	}
	public MyString( MyString other )
	{		
		this( other.toString() ); // DO NOT CHANGE/ADD/MOFIDY IN ANY WAY
	}
	public int length()
	{
		return letters.length; // JUST TO MAKE IT COMPILE. REPLACE WITH YOUR CODE AND RETURN VALUE
	}
	public char charAt(int index) // IF INDEX OUT OF BOUNDS. EXIT PROGRAM! (dont return anything)
	{
		if ( index >= length() || index < 0 )
		{
		    System.out.println("\nFATAL ERROR: charAt() given invalid index\n");
			System.exit(0);
		}
		return letters[index]; // JUST TO MAKE IT COMPILE. REPLACE WITH YOUR CODE AND RETURN VALUE
	}

	public int compareTo(MyString other)
	{
		int comparableLength; 
		//if (this.equals(other)) {
		//return 0			
		//}

		if (length() > other.length()) {
			comparableLength = other.length();
		}

		else{
			comparableLength = length();
		}


		for (int i=0; i < comparableLength ; i++ ) {
			if (this.charAt(i) < other.charAt(i)) {
				return -1;
			}

			else if ( this.charAt(i) > other.charAt(i)) {
				return 1;
			}
		}

		if (length() > other.length()) {
			return 1;
		}
		else if (length() == other.length()) {
			return 0;
		}
		else
			return -1;
	}



	public boolean equals(MyString other)
	{
		if (this.length() == other.length()) {
			for (int i = 0; i < this.length(); i++) {
				if (this.charAt(i) != other.charAt(i)) {
				return false;					
				}
				return true;
			}
		}
		return false; // JUST TO MAKE IT COMPILE. YOU REPLACE WITH YOUR CODE AND RETURN VALUE
	}
	// LOOKING for c but starting at [startIndex],  not at [0]
	// You should use this in your other Indexof Method
	public int indexOf(int startIndex, char ch)	
	{
		if ( startIndex >= this.length() || startIndex < 0  )
		{
			System.out.println("\nFATAL ERROR: indexOf() given invalid startIndex\n");
			System.exit(0);
		}
		for (int i = startIndex; i < length(); i++) {
			if (this.charAt(i) == ch) {
				return i;
			}
		}
		return NOT_FOUND; // JUST TO MAKE IT COMPILE. YOU REPLACE WITH YOUR CODE AND RETURN VALUE
	}
	
	// IN THIS METHOD BELOW YOU MUST RE-USE indexOf( int startIndex, char ch) METHOD ABOVE
	public int indexOf(MyString key){
		char key1st = key.charAt(0);
		int firstIndex = indexOf( 0, key1st);

		while(firstIndex != NOT_FOUND){
			if( keyFound( key, firstIndex )) return firstIndex;
			firstIndex = indexOf(firstIndex + 1, key1st);
		}
		return NOT_FOUND;
	}

	public boolean keyFound(MyString word, int number){
		for (int i = 0; i < word.length() ; i++) {
			if(word.charAt(i) != this.charAt(number + i) || word.length() > this.length()) return false;
		}
		return true;
	}


	public String toString()
	{
		return new String(this.letters); // JUST TO MAKE IT COMPILE. YOU REPLACE WITH YOUR CODE AND RETURN VALUE
	}
} // END MYSTRING CLASS
