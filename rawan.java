
import java.util.Scanner;

public class Welcome {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.print( "enter thr first item and size of array" );
	int num1= input.nextInt();
	int num2= input.nextInt();
	System.out.print( "arrayOfMultiples(" );
	System.out.print( num1 + ","+num2 + ")" );

			int counter=1 ; 
	  while (counter <= num2 ) {
		  int num3=1;
			System.out.print( num1 * counter + " " );

		


	  counter++;


		
	}

}
}
