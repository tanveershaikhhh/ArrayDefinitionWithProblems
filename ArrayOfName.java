/* QUESTION
 Take an array of names as input from the user and print them on the screen.
 */


package Array;
import java.util.Scanner;

public class ArrayOfName {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter how many names you want to store");
		int size = sc.nextInt();
		
		String names[] = new String[size];
		
		System.out.println("Enter names");
	  for (int i=0; i<size; i++) {
		  names[i] = sc.next();
	  }
	  
	  
	  System.out.println("================");
	  
	  System.out.println("Names are : ");
	  for (int i=0; i< names.length; i++) {
		  
		  System.out.println((i+1)+ ". " +names[i]);

	  }
		System.out.println("================");
	}
	
}
