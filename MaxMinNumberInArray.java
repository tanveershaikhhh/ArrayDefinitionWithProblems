/*Find the maximum & minimum number in an array of integers. */
package Array;
import java.util.*;

public class MaxMinNumberInArray {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Array size of Array");
		int size = sc.nextInt();
	
	
	int numbers []= new int [size];
	
	//input
	System.out.println("Enter number you want to store");
	for (int i=0; i<size; i++)
		numbers[i] = sc.nextInt();
	
	int max = Integer.MIN_VALUE;
	int min = Integer.MAX_VALUE;
	
	// output 
	for (int i=0; i<numbers.length; i++) {
		if (numbers[i]<min) {
			min = numbers[i];
		}
      if (numbers[i]>max) {
    	 max = numbers[i];
		}
	}
	System.out.println("Largest number is : " + max);
    System.out.println("Smallest number is : " + min);

	
	
	}
}
