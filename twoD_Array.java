package Array;

	import java.util.Scanner;

	public class twoD_Array {
	    public static void main(String[] args) {

	    	
	   
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter number of rows");
	        int row = sc.nextInt();
	        System.out.println("Enter number of col");
	        int col = sc.nextInt();

	     	
	        
	    	// DECLARATION
	    	/*
	    	 dataType [][] arrayName = new dataType[][];
	    	 int [][] array2d = new int [3] [5];
	    	  
	    	  
	    	 */
	    	
	        
	        
	        int [] [] arr = new int[row][col];
	    // input    
	        //row
	        for (int i=0; i<row; i++)
	        	// col
	            for (int j=0; j<col; j++)
	                arr[i] [j] = sc.nextInt(); 

	        
	        // output
	        for (int i=0; i<row; i++) {
	            for (int j=0; j<col; j++) {
	                System.out.print(arr[i][j] + " ");
	            }
	            System.out.println();
	        }
	    }
	
}
