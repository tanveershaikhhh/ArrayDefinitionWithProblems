package Array;

import java.util.*;
/*QUESTION
Take an array as input from the user. Search for a
given number x and print the index at which it occurs.
*/


public class BasicArrayProblem {
	public static void main(String[] args) {
		
		Scanner  sc = new Scanner(System.in);
		System.out.println("Enter size of Array");
		int size = sc.nextInt();
		
		int numbers[] = new int [size];
		
		System.out.println("Enter values of Array");
		for (int i=0; i<size; i++) {
			numbers[i] = sc.nextInt();
		}
		
		System.out.println("Enter number you want to find in an array");
		int x = sc.nextInt();
		
		
		for (int i=0; i<numbers.length; i++) {
			if (numbers[i] == x ) {
				System.out.println("Number found at index: " + i);
			}
			
		}
		
	}

}
