/*
 * This java program give prime numbers
 */
package algorithmproblems;
import java.util.*;
/**
 * 
 * @author Kaif
 *
 */

public class PrimeNumber {


    /*
     * Method to find prime number from zero to any range
     */
	static void toFindPrime(int range) {
		
		int k=0;

		for (int i = 2; i <= range; i++) {
			int count = 0;
			for (int j = 2; j <= i; j++) {
				if (i % j == 0) {
					count++;
				}
			}
			if (count == 1) {
				System.out.println(i);
			}
		}
	}
	
	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter range for prime numbers");
		
		int range = sc.nextInt();
		
		/*
		 *To call out method 
		 */

		toFindPrime(range);
		
	
	}

}
