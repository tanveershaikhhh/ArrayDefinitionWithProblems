package Array;
/*
 What is Array ?
 
 --> Array is a linear data structure 
 * It holds homogenous (Similar) data 
 * It is of static size 
 * Indexing  starts with 0
 * It allows random access of elements 
  
  
  zero indexed
 
SYNTAX
* using new keyword
datatype [] arrayName =new datatype[size];

arrayName [0] = 521;
arrayName [1] = 123;
arrayName [2] = 614;
arrayName [3] = 431;
arrayName [4] = 013;

sysout (arrayName [4]);


* direct Initialization 
datatype[] arrayName = {1,2,3,4,5,6,7,8,9};

 */

public class DefineArray {
	public static void main(String[] args) {
	
		/*
		int marks[] = new int [3];
		
		marks[0] = 80;  //eng
		marks[1] = 95;  // maths
		marks[2] = 90;  // sci
		*/
		
		int marks [] = {80,95,90};
		
		System.out.println(marks[0]);
		System.out.println(marks[1]);
		System.out.println(marks[2]);
		
		
		// printing output using loop is recommended 
		System.out.println("==================== ");
		System.out.println("Output using loops ");

		for (int i=0; i<3; i++)
			System.out.println(marks[i]);
		
		System.out.println("==================== ");
		
		
		/* 
		 Output
		--> 80
		--> 95
		--> 90
		==================== 
		Output using loops 
		80
		95
		90
		==================== 

		 */
	}
	

}
