public class stppat {

	public static void main(String[] args) {

		int nos=5;

		for (int i=0; i<=5; i++) {

			for (int x=1; x<=nos; x++) {

				System.out.print(" ");
				
			}
			

			for (int j=i; j>0; j--) {
	
				System.out.print(j);

			}


			System.out.print("\n");

			nos=nos-1;

		}
		
	} // end of main function

} // end of ppat class