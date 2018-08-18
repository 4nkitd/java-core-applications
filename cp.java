import java.util.Scanner;

public class cp {

	public static void main(String []args) {

		Scanner kb = new Scanner(System.in);

		
		int a = kb.nextInt();

		int i;

		for (i=2 ;i<a ;i++ ) {

			if (a%i==0) {

				break; }
		}
				
		 if ( i==a) {

			System.out.println( a+ " is a prime Number");}

		else {

			System.out.println( a+ " isn't a prime Number");
			}
		

		

	} // end of main function

} // end of class