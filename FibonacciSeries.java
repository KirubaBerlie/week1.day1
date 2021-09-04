package week1.day1.assignment;

/*
 * Goal: To find Fibonacci Series for a given range
 * 
 * input(range): 8 output: 0, 1, 1, 2, 3, 5, 8, 13
 * 
 * Shortcuts: 1) Print : type: syso, followed by: ctrl + space + enter 
 * 2) To  * create a 'for' loop: type 'for', followed by ctrl + space + down arrow +
 * enter
 * 
 * What are my learnings from this code?
 *  1)how to use for loop
    2) variable declaration 
    3) when I declare firstNum and secNum as short error shown saying type casting can't be done 
    Since I assign the int value to short in for Loop
 * 
 */

public class FibonacciSeries {

	public static void main(String[] args) {


		//Declaration 
		short range = 8;
		int  firstNum = 0;
		int  secNum = 1;
		int sum;
		
		//print First Number
		System.out.println(firstNum);
		
		
		for (int i= secNum ; i < range; i++)
		{
			sum = firstNum + secNum;
			firstNum = secNum;
			secNum = sum;
			System.out.println(firstNum);
		}
		

	}

}
