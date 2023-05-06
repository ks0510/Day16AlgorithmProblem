/*
 * This java program take words and sort the words list and find the required word.
 */

package algorithmproblems;

import java.util.*;

/**
 * 
 * @author Kaif
 *
 */

public class BinarySearch {
	
	/*
	 * To find required word in list
	 */
	static int binarySearch(String[] arr, String x) {
		int l = 0, r = arr.length - 1;
		while (l <= r) {
			int m = l + (r - l) / 2;

			int result = x.compareTo(arr[m]);

			// Check if x is present at mid
			if (result == 0) {
				return m;
			}
			// If x greater, ignore left half
			if (result > 0)
				l = m + 1;

			// If x is smaller, ignore right half
			else
				r = m - 1;
		}

		return -1;
	}
	/*
	 * This is main method of class and starting point of program
	 */

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter size of array for word list");
		
		int size = sc.nextInt();
		
		String [] wordList = new String [size];
		
		System.out.println("Enter words for list");
		
		for(int i=0;i<size;i++) {
			wordList[i]= sc.next();
		}
		
		Arrays.sort(wordList);
		
		System.out.println("Enter the word to search");
		
		String word = sc.next();
		
		int result = binarySearch(wordList,word);
		
		if(result==-1) {
			System.out.println("The "+word+" word not found in list");
		}
		else {
			System.out.println("The "+word+" word found at "+result+" index");
		}
	}
}
