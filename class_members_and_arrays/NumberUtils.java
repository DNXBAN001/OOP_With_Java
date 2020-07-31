package class_members_and_arrays;

/**
*Date : 20 July 2020
*@author Bandile Danxa
*/
public class NumberUtils
{
	
	//Constructors
	private NumberUtils()
	{
		// A private, empty-bodied constructor prevents NumberUtil objects from being created.
	}
	
	/**
	* Given a number that is n digits in length, maps the digits to an array length n.
    * e.g. given the number 5678, the result is the array {5, 6, 7, 8}.
	*/
	public static int[] toArray(int number)
	{
		String txt = String.valueOf(number);//convert the number into a string
		int[] nums = new int[txt.length()];//create an integer array to store the single digit numbers in the txt string
		for (int i = 0; i < txt.length(); i++)
		{
			nums[i] = txt.charAt(i) - '0';//take each character in the txt string and converting it into an integer, and then store the value on our nums array
		}
		return nums;
	}
	/**
	* Given two numbers, count the quantity of matching digits – those with the same value and
	* position. For example, given 39628 and 79324, there are 2 digits in common: x9xx2x.
	* It is assumed that the numbers are the same length and have no repeating digit
	*/
	public static int countMatches(int numberA, int numberB)
	{
		
		int[] arrA = toArray(numberA);//take numberA and convert it into an array of single digits
		int[] arrB = toArray(numberB);//take numberA and convert it into an array of single digits
		int matchingDigits = 0;
		for(int i = 0; i < arrA.length; i++)
		{
			try
			{
				if(arrA[i] == arrB[i])
					matchingDigits++;	//increment the value of matchingDigits whenever the digit in numberA matches the one in numberB in same position
			}
			catch(ArrayIndexOutOfBoundsException ex)
			{
				ex.printStackTrace();
			}
		}
		//System.out.println("Matches : "+matchingDigits);
		return matchingDigits;
	}
	
	/**
	*Count the quantity of digits that two numbers have in common, regardless of position.
	*For example, given 39628 and 97324, there are 3 digits in common: 3, 9, 2.
	*It is assumed that the numbers are the same length and have no repeating digits.
	*/
	public static int countIntersect(int numberA, int numberB)
	{
		int[] arrA = toArray(numberA);//take numberA and convert it into an array of single digits
		int[] arrB = toArray(numberB);//take numberA and convert it into an array of single digits
		int numOfIntersects = 0;
		
		//Increment the value of numberOfIntersects whenever a digit in arrA matches another digit in arrB that is not in the same position
		//We have to assume that there is no repetition between the digits otherwise the value of numberOfIntersects is going to keep incrementing
		//as long as it finds a match
		for(int i = 0; i < arrA.length; i++)
		{
			if(i == 0)
			{
				if(arrA[i] == arrB[1])
					numOfIntersects++;
				if(arrA[i] == arrB[2])
					numOfIntersects++;
				if(arrA[i] == arrB[3])
					numOfIntersects++;
			}
			if(i == 1)
			{
				if(arrA[i] == arrB[0])
					numOfIntersects++;
				if(arrA[i] == arrB[2])
					numOfIntersects++;
				if(arrA[i] == arrB[3])
					numOfIntersects++;
			}
			if(i == 2)
			{
				if(arrA[i] == arrB[0])
					numOfIntersects++;
				if(arrA[i] == arrB[1])
					numOfIntersects++;
				if(arrA[i] == arrB[3])
					numOfIntersects++;
			}
			if(i == 3)
			{
				if(arrA[i] == arrB[0])
					numOfIntersects++;
				if(arrA[i] == arrB[1])
					numOfIntersects++;
				if(arrA[i] == arrB[2])
					numOfIntersects++;
			}
		}
		return numOfIntersects;
	}
}

