package week1.day1.assignment;

/*
 * Goal: check the Number is Positive or negative
 * 
 * input: 35
 * output:  If a number is positive, print "The number is positive"
  *  If a number is negative, print "The number is negative"
  *  If it nether negative nor positive, print as "The number is neither positive nor negative
 * 
 * Shortcuts:
 * 1) Print : type: syso, followed by: ctrl + space + enter
 *  *   
 * What are my learnings from this code?
 * 1) Nested IF
 * 2) Initialize a number 
 *  
 * 
 */
public class CheckIsPositiveOrNegative {

	public static void main(String[] args) {

		// Initialize a number
		int num = 35;

		if (num > 0)
			System.out.println("The number " + num + " is positive");
		else if (num < 0)
			System.out.println("The number " + num + " is negative");

		else
			System.out.println("The number " + num + " is neither postive nor negative");

	}

}
