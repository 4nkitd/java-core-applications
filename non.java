import java.util.Scanner;

public class non {

	public static void main(String []args) {

		Scanner kb = new Scanner(System.in);

			System.out.println(" \n Enter a number. \n");
		int a = kb.nextInt();

		System.out.println(" \n =========================== \n");

		int b = 1;

		while ( b <= a ) {

				System.out.println(" " + (2*b-1));

				b++;

		}

		
	} // end of main function

} // end of class