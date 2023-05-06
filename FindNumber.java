/*
 * This java program find the require number by binary search.
 * 
 */
package algorithmproblems;

import java.util.*;

/**
 * 
 * @author Kaif
 *
 */

/*
 * This is main class of program
 */
public class FindNumber {

	/*
	 * To intialize mid value
	 */
	private static int mid = 0;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number");

		int n = sc.nextInt();

		System.out.println("Enter a number between 0 to " + (n - 1));

		int number = sc.nextInt();
		int low = 0, high = n - 1;

		/*
		 * To iterate the loop till we find our number
		 */

		while (true) {
			System.out.println("1.To perform binary search");
			System.out.println("2.If your number is greater than displayed number");
			System.out.println("3.If your number is less than displayed number");
			System.out.println("4.Exit");

			int ch = sc.nextInt();

			/*
			 * switch case for different operations of binary search
			 */

			switch (ch) {
			case 1:
				mid = (low + high) / 2;
				System.out.println(mid + " Is this your number?");
				System.out.println("Press yes or no");
				String result = sc.next();
				if (result == "yes") {
					System.out.println("Do exit from program");
				} else {
					System.out.println("If your number is greater than displayed number then press 2");
					System.out.println("If your number is less than displayed number then press 3");
				}

			case 2:
				low = mid + 1;
				break;
			case 3:
				high = mid - 1;
				break;
			case 4:
				System.exit(0);
				break;

			default:
				System.out.println("Invalid choice!");
				break;
			}
		}
	}
}
