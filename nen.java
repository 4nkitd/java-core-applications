import java.util.Scanner;

public class nen {

	public static void main(String []args) {

		Scanner kb = new Scanner(System.in);

			System.out.println(" \n Enter a number. \n");
		int a = kb.nextInt();

		System.out.println(" \n =========================== \n");

		int b = 0;

		while ( b <= a ) {

				System.out.println(" " + (2*b));

				b++;

		}

		
	} // end of main function

} // end of class