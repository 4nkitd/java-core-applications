import java.util.Scanner;

public class sten {

	public static void main(String []args) {

		Scanner kb = new Scanner(System.in);

			System.out.println(" \n Enter a number. \n");
		int a = kb.nextInt();

		System.out.println(" \n =========================== \n");

		int b = 0;
		int c = 0;
		int i;

		while ( b <= a ) {

				System.out.println(" " + (2*b));

				b++;

		}

			System.out.println(" \n =========================== \n");
			
		for (i=1; i<=a ;i++ ) {
			
			c=c+(2*i);

		}

				System.out.println(" " +c );

		
	} // end of main function

} // end of class