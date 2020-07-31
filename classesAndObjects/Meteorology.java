package classesAndObjects;
import java.util.*;

/*
 * Date : 08 July 2020
 * @author : Bandile Danxa
 */
public class Meteorology 
{
	private static Scanner input = new Scanner(System.in);//create our scanner object to read the user input
	private static Collator temperatureObj = new Collator("Temperature");
	private static Collator pressureObj = new Collator("Pressure");
	private static Collator humidityObj = new Collator("Humidity");
	
	public static void main(String[] args) 
	{
		menuPrompt();
		int choice = input.nextInt();
		while(choice != 7) 
		{
			decide(choice);
			menuPrompt();
			choice = input.nextInt();
		}
		System.out.println("Program terminated successfully");
		
		
		

	}
	static void menuPrompt()
	{
		System.out.printf("Meteorology Program\r\n" + 
							"Make a selection and press return:\r\n" + 
							"1. Record a temperature reading.\r\n" + 
							"2. Record a pressure reading.\r\n" + 
							"3. Record a humidity reading.\r\n" + 
							"4. Print maximum values.\r\n" + 
							"5. Print minimum values.\r\n" + 
							"6. Print average values.\r\n" + 
							"7. Quit.\r\n\n");
	}
	static void decide(int choice)
	{
		int reading;
		switch(choice)
		{
			case 1:
				System.out.println("Enter a value");
				reading = input.nextInt();
				temperatureObj.recordReading(reading);
				break;
			case 2:
				System.out.println("Enter a value");
				reading = input.nextInt();
				pressureObj.recordReading(reading);
				break;
			case 3:
				System.out.println("Enter a value");
				reading = input.nextInt();
				humidityObj.recordReading(reading);
				break;
			case 4:
				System.out.println("Maximum temperture is : "+temperatureObj.maximum());
				System.out.println("Maximum pressure is : "+pressureObj.maximum());
				System.out.println("Maximum humidity is : "+humidityObj.maximum());
				break;
			case 5:
				System.out.println("Minimum temperture is : "+temperatureObj.minimum());
				System.out.println("Minimum pressure is : "+pressureObj.minimum());
				System.out.println("Minimum humidity is : "+humidityObj.minimum());
				break;
			case 6:
				System.out.println("Average temperture is : "+temperatureObj.average());
				System.out.println("Average pressure is : "+pressureObj.average());
				System.out.println("Average humidity is : "+humidityObj.average());
				break;
			case 7:
				break;
		}
	}

}
