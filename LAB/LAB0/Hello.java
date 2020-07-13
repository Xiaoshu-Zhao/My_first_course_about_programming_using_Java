
import java.io.*; // I/O
import java.util.*; // Scanner, ArrayList, Random and other utility classes

public class Hello
{
	public static void main( String args[] )
	{
		Scanner kbd = new Scanner (System.in); // if you want to use keyboard, you need this
		System.out.print("your name");
		String name; 
		name = kbd.next();
		System.out.println("welcome" + name);
		kbd.readLine();
		System.out.print("your ht in inches");
		int htInches= kbd.nextInt();
		System.out.println
		System.out.println("you are" + htInches + "inches");
	}

	// add a println or format  statement here that idicates you have successfully
	// compiled and executed this program with this print statement
}



//String name;
		//System.out.print("Enter your name:");
		//name = kbd.next();
		//System.out.println("Hello" + name);
		//name = kbd.next();
		//System.out.println("Hello" + name);

//System.out.println
		//for (int i=0 ; i<args.length ; ++i)
			//System.out.println(  i + " " + args[i] );