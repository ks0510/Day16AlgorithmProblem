/*
 * This java program report the task completed and time.
 */
package algorithmproblems;

import java.util.*;

/**
 * 
 * @author Kaif
 *
 */

public class Task {
	
	/**
	 * This is main method of class and starting point of program
	 * @param args
	 */

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter time");
		
		double time = sc.nextDouble();
		
		System.out.println("Enter number of tasks");
		
		int tasks = sc.nextInt();
		
		double[] timeofTask = new double [tasks]; 
		
		System.out.println("Enter time in minutes for each task");
		
		for(int i=0;i<tasks;i++) {
			timeofTask[i] = sc.nextDouble();
		}
		
		for(int i=0;i<tasks;i++) {
			System.out.println("Task "+(i+1)+" completed at "+time+timeofTask[i]);
		}

	}
}
