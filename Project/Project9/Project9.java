import java.io.*;
import java.util.*;
public class Project9
{
	public static void main( String args[] )
	{
		Scanner kbd = new Scanner(System.in);
		int n = -1;
		do{
			System.out.print("Enter int in range 1..100 inclusive: ");
			try{
				n = kbd.nextInt(); 
				if(n < 0 || n > 100 ) throw new NumberOutOfRangeException();
			}

			catch(InputMismatchException e){
				System.out.println("Input was not an interger");
				kbd.nextLine();
			}

			catch(NumberOutOfRangeException j){
				System.out.println(j);
			}

			catch(Exception e){
				System.out.println( e );
				System.exit(0);
			}
		}while( n < 0 || n > 100);
		System.out.format("Thank you. You entered %d\n", n);
		
	} //END main
} //END CLSS


class NumberOutOfRangeException extends Exception{

	public NumberOutOfRangeException()
	{
		super("out of range. Must be in 1..100"); 
	} 
}