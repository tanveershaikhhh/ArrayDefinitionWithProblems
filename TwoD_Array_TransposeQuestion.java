package Array;
import java.util.*;

public class TwoD_Array_TransposeQuestion {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter Number of row");
			int row = sc.nextInt();
		System.out.println("Enter Number of col");
			int col = sc.nextInt();
			
			int transpose [][] = new int [row][col];
			
			for (int i = 0; i < row; i++) 
				for (int j = 0; j < col; j++) 
					transpose[i][j] = sc.nextInt();
			
			// output
			for (int j = 0; j < col; j++) {
				for (int i = 0; i < row; i++) {
					System.out.print(transpose[i] [j] +" ");
			}
				System.out.println();
				
					
			}
			

	}	
}


