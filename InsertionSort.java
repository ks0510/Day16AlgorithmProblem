/*
 * This java program sort string array using insertion sort
 */
package algorithmproblems;

import java.util.*;
/**
 * 
 * @author Kaif
 *
 */

public class InsertionSort {
	
	
	public static  void sortString(String array[], int length) {
		String temp = "";
		for (int i = 0; i < length; i++) {
			for (int j = i + 1; j < length; j++) {
				if (array[i].compareToIgnoreCase(array[j]) > 0) {
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
	
	}

	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter size of list");
		
		int size = sc.nextInt();
		
		String [] str = new String [size];
		
		System.out.println("Enter wrods for list");
		
		for(int i=0;i<size;i++) {
			str[i] = sc.next();
		}
		
		for(int i=0;i<size;i++) {
			System.out.print(str[i]+" ");
		}
		System.out.println();
		
		sortString(str,str.length);
		
		for(int i=0;i<size;i++) {
			System.out.print(str[i]+" ");
		}
		
		

	}

}
