package week1.day1.assignment;

public class PrimeNumber {
	
	/*
	 * Goal: To find whether a number is a Prime number or not
	 * 
	 * input: 13
	 * output: 13 is a Prime Number
	 * 
	 * Shortcuts:
	 * 1) Print : type: syso, followed by: ctrl + space + enter
	 * 2) To create a 'for' loop: type 'for', followed by ctrl + space + down arrow + enter
	 * 3) To create an 'if' condition: type 'if', followed by ctrl + space +down arrow + enter
	 *   
	 * What are my learnings from this code?
	 * 1) how to exit from loop
	 * 2) like to learn why did I get 2 warnings
	 * 3) usage of If 
	 * 
	 */


	public static void main(String[] args) {
		// Declare an int Input and assign a value 13	
		  int inputNum = 13;

		// Declare a boolean variable flag as false	
		  boolean flag1= false;
		  

		// Iterate from 2 to half of the input

				for (int i=2; i <= inputNum/2; i++)
				{
					if(inputNum%i == 0)
						flag1 = true;
						break;
				}
				
				if (flag1 = true)
					System.out.println(inputNum + " is a Prime Number");
				else
					
					System.out.println(inputNum + "is a NOT Prime Number");
					
	}

}
