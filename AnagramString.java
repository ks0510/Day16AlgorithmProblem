package algorithmproblems;

import java.util.*;
/**
 * 
 * @author Kaif
 *
 */

public class AnagramString {

	static boolean toCheckAnagram(char[] array1, char[] array2) {
		int length1 = array1.length;
		int length2 = array2.length;

		if (length1 != length2) {
			return false;
		}

		/*
		 * Sort both strings
		 */
		Arrays.sort(array1);
		Arrays.sort(array2);

		/*
		 * Compare sorted strings
		 */
		for (int i = 0; i < length1; i++) {
			if (array1[i] != array2[i]) {
				return false;
			}
		}

		return true;

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter first string");

		String str1 = sc.next();

		System.out.println("Enter second  string");

		String str2 = sc.next();

		char[] arr1 = str1.toCharArray();

		char[] arr2 = str2.toCharArray();
		
		 /*
		  * Function Call
		  */
        if (toCheckAnagram(arr1, arr2)) {
        	System.out.println("The two strings are anagram of each other");
        }else {
            System.out.println("The two strings are not anagram of each other");
        }
	}
}
