import java.util.Scanner;

public class ston {

	public static void main(String []args) {

		Scanner kb = new Scanner(System.in);

			System.out.println(" \n Enter a number. \n");

			 try {

			          String a = kb.nextInt();
			          midterm = Integer.parseInt(s);
			          break;

		      } catch (Exception e) {

				          System.out.printLn("Only Numeric Value Exepted");
		      
		      }
		

		System.out.println(" \n =========================== \n");

		int b = 1;
		int c = 0;
		int i;

		try {

			while ( b <= a ) {

					System.out.println(" " + (2*b-1));

					b++;

			}

				System.out.println(" \n =========================== \n");
				
			for (i=1; i<=a ;i++ ) {
				
				c=c+((2*i)-1);

			}

					System.out.println(" " +c );

		} catch (Exception e) {

			System.out.println(e.getMessage());
			e.printStackTrace();

		}

		
	} // end of main function

} // end of class