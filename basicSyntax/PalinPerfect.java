import java.util.*;


/**
 * Date 1 July 2020
 * @author Bandile Danxa
 *
 */
public class PalinPerfect 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		int lowerBound, upperBound;//variables to store values of our lower and upper bound
		
		//prompt user to enter lowerbound(exclusive)
		System.out.println("Enter the starting point N:");
		lowerBound = input.nextInt();
		//prompt user to enter upperdound(exclusive)
		System.out.println("Enter the ending point M:");
		upperBound = input.nextInt();
		
		//print all the palinperfect numbers between the range
		System.out.println("The palindromic perfect squares are as follows:");
		for(int i = 0; i < upperBound; i++)
		{
			if(isPalindrome(String.valueOf(i))&&isPerfectSquare(i))
				if(i > lowerBound)
					System.out.println(i);
		}
		
	}
	/**
	 * This method checks if a given string is palindrome or not
	 * Returns true if it is palindrome, else false
	 * @param str
	 * @return
	 */
	static boolean isPalindrome(String str)
	{
		//create a stringbuilder object to be ale to invoke the reverse method
		StringBuilder num = new StringBuilder();
		//take the passed string text and append it to my stringbuilder object
		num.append(str);
		
		//compare the reversed string with the normal passed string and if they are equal return true, else return false
		return str.equals(num.reverse().toString())? true: false;
	}
	/**
	 * This method checks if a given number is a perfect square or not
	 * Returns true if it is perfect square, else false
	 * @param str
	 * @return
	 */
	static boolean isPerfectSquare(int number)
	{
		//if the square root of a number is an integer/whole number then the number is a perfect square
		return (Math.pow(number, 0.5)%1==0)?true:false;
	}

}
