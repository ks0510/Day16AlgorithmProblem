/*
 * This java program sort the string array using merge sort algorithm.
 */
package algorithmproblems;

import java.util.*;
/**
 * 
 * @author Kaif
 *
 */

public class MergeSortString {
	
	/*
	 * To define function which sort and merge array
	 */
	public static String [] mergeSort(String[] arr,int low,int high) {
		if(low==high) {
			String[] A = {arr[low]};
			return A;
		}
		else {
			int mid = low + (high - low) / 2;
			/*
			 * To sort merge first sub array
			 */
			String[] arr1 = mergeSort(arr, low, mid);
			/*
			 * To sort merge second sub array
			 */
			String[] arr2 = mergeSort(arr, mid + 1, high);
			/*
			 * To merge both half  sub arrays 
			 */
			String[] arr3 = merge(arr1, arr2);
			
			return arr3;
		}
		
	}
	/*
	 * To define method which sort and merge both sub arrays
	 */
	public static String[] merge(String[] Arr1,String[] Arr2) {
		
		int m = Arr1.length;
		int n = Arr2.length;
		
		String[] Arr3 = new String[m+n];
		
		int i=0,j=0,index=0;
		
		/*
		 * Merging both sub arrays into one common array 
		 */
		while(i<m && j<n) {
			if (isAlphabeticallySmaller(Arr1[i], Arr2[j])) {
 
                Arr3[index] = Arr1[i];
                i++;
                index++;
            }
            else {
                Arr3[index] = Arr2[j];
                j++;
                index++;
            }
			}
		while(i<m) {
			Arr3[index]=Arr1[i];
			i++;
			index++;
		}
		while(j<n) {
			Arr3[index] = Arr2[j];
			j++;
			index++;
		}
		return Arr3;
	}
	
	/*
	 * To define method which compare two strings
	 */
	 static boolean isAlphabeticallySmaller( String str1, String str2){
		        str1 = str1.toUpperCase();
		        str2 = str2.toUpperCase();
		        if (str1.compareTo(str2) < 0) {
		            return true;
		        }
		        return false;
		    }

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		/*
		 * To take user input array
		 */
		
		System.out.println("Enter the size of  array");
		
		int size = sc.nextInt();
		
		String[] str = new String[size];
		
		for(int i=0;i<str.length;i++) {
			str[i]=sc.next();
		}
		/*
		 * To call out sort method and save it in new array
		 */
		String[] sortedArray = mergeSort(str,0,str.length-1);
		
		/*
		 * To print sorted array
		 */
		for(int i=0;i<sortedArray.length;i++) {
			System.out.print(sortedArray[i]+" ");
		}
		
	}
}
