
package algorithmproblems;

import java.util.Scanner;
/**
 * 
 * @author Kaif
 *
 */

public class BubbleSort {

	public static void bubbleSort(int arr[], int n) {
		int i, j, temp;
		boolean swapped;
		for (i = 0; i < n - 1; i++) {
			swapped = false;
			for (j = 0; j < n - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					/*
					 * swap arr[j] and arr[j+1]
					 */
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					swapped = true;
				}
			}

			/*
			 * if no two elements were  swapped by inner loop, then break
			 */
			if (swapped == false)
				break;
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter size of list");

		int size = sc.nextInt();

		int[] arr = new int[size];

		System.out.println("Enter wrods for list");

		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}

		bubbleSort(arr, arr.length);

		for (int i = 0; i < size; i++) {
			System.out.print(arr[i]+" ");
		}

	}

}
