import java.util.*;

/**
 * Date 1 July 2020
 * @author Bandile Danxa
 *
 */
public class TimeConverter 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);//create a scanner object to read user input
		
		//prompt the user to enter an input
		System.out.println("Enter a time ([h]h:mm [am][pm]) : \n");
		
		//split the string into hours and minutes, separate by a colon and blank space
		String[] time = input.nextLine().split("[: ]");
		
		//decide on which conversion to make
		if(time.length ==3)
		{
			System.out.println(to24Hours(Integer.parseInt(time[0]), time[1], time[2]));
		}
		else
		{
			System.out.println(to12Hours(Integer.parseInt(time[0]), time[1]));
		}
	}
	/**
	 * This method converts the given time format into a 24hour time
	 * Returns 24 hour time string, a warning message if the given time format was wrong
	 * @param hours
	 * @param minutes
	 * @param dayIndicator
	 * @return
	 */
	static String to24Hours(int hours, String minutes, String dayIndicator)
	{	
		if(dayIndicator.equals("am"))
		{
			if(hours < 12)
				return hours+":"+minutes;
			else if(hours == 12)
				return 00+":"+minutes;
		}
		else if(dayIndicator.equals("pm"))
		{
			if(hours != 12)
				return hours+12+":"+minutes;
			else
				return 12+":"+minutes;
		}
		
		return "Your time format is wrong";
	}
	
	/**
	 * This method converts the given time format into a 12 hour time
	 * Returns 12 hour time string, a warning message if the given time format was wrong
	 * @param hours
	 * @param minutes
	 * @return
	 */
	static String to12Hours(int hours, String minutes)
	{
		if(hours > 12 && hours < 24)
			return (hours%12)+":"+minutes+" pm";
		else if(hours == 00)
			return 12+":"+minutes+" am";
		else if(hours <= 12 && hours > 0)
			return hours+":"+minutes+" am";
		
		return "Your time format is wrong";
	}

}
