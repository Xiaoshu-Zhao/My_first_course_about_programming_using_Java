import java.io.*;
import java.util.*;
public class Exercise2
{
	public static void main( String args[] )
	{
		System.out.print("Enter int in range 1..100 inclusive: ");
		Scanner kbd = new Scanner(System.in);
		int n;
		do{
			try{
				n = kbd.nextInt(); 
				if(n <= 0 || n >= 101 ) throw new Exception();
			}

			catch(InputMismatchException e){
				System.out.println("Input was not an interger");
				kbd.nextInt();
			}

			catch(Exception e){
				System.out.println("Number:" + n + " out of range. Must be in 1..100");
			}
		}while( n <= 0 || n >= 101);
		System.out.format("Thank you. You entered %d\n", n);
		
	} //END main
} //END CLSS