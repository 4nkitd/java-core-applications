import java.util.Scanner;

public class iadd {

	public static void main(String []args) {

		Scanner kb = new Scanner(System.in);
		System.out.println("This program can ferform addition With User Input \n \nType Your 1st Value.");
		int a = kb.nextInt();
		System.out.println("\n Second Value is \n");
		int b = kb.nextInt();
		int s;
		s =(a+b);
		System.out.println(" \nThe Sum Of "+a+ " and " +b+ " Is : "+ s );

	}
}




















