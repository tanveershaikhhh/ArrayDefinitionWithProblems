package Array;
/*Take a matrix as input from the user. Search for a 
given number x and print the indices at which it occurs.*/

import java.util.Scanner;

public class Array2dFindingNumberInMatrix {
public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	System.out.println("enter no of row");
	int row = sc.nextInt();
	System.out.println("enter no of col");
	int col = sc.nextInt();
	
	
	int numbers [][] = new int[row][col];
	
	for (int i = 0 ; i<row; i++) 
		for (int j = 0 ; j<col; j++) 
			numbers[i][j] = sc.nextInt();
		
	System.out.println("Enter element you want to find ");
	int x = sc.nextInt();
	for (int i = 0 ; i<row; i++) 
		for (int j = 0 ; i<col; i++) 
			if (numbers[i][j] == x)
			System.out.println("element found at locations ("+i +","+j+")");
	 
	
	
	}
}
