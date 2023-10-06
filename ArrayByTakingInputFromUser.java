package Array;

import java.util.Scanner;

public class ArrayByTakingInputFromUser {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of Array");
		int size = sc.nextInt();
		
		int numbers [] = new int[size];
		
		
		System.out.println("Enter values of Array");
		for (int i=0; i<size; i++) {	
		numbers[i] = sc.nextInt();
		}
		
		
		for(int i=0; i<size; i++ ) {
			System.out.println(numbers[i]);
		}
		
		
	}

}
