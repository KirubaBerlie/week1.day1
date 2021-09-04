package week1.day1.assignment;

/*
 * Goal: Convert Positive Number to Negative number
 * 
 * input: -40
 * output: The number -40 is converted to 40
 * 
 * Shortcuts:
 * 1) Print : type: syso, followed by: ctrl + space + enter
 *  *   
 * What are my learnings from this code?
 * 1)Usage of Arithmetic operators
 * 2) If else Control statements
 * 
 * 
 */

public class ConvertNegativeToPositive {

	public static void main(String[] args)

	{
		// declaration of input number and initialize with negative value
		int num = -40;

		// check the number is Negative
		if (num < 0)
			System.out.println("The Number " + num + " is converted to " + num * -1);
		else
			System.out.println("The Number is Positive");

	}

}
