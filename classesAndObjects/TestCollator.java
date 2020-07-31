package classesAndObjects;


/**
 * Date 1 July 2020
 * @author Bandile Danxa
 *
 */
public class TestCollator
{

	public static void main(String[] args)
	{
		//Test 1 : Test our constructor
		System.out.println("Test 1");
		Collator collatorObj = new Collator("Temperature");
		if(collatorObj.label().equals("Temperature")
				&&collatorObj.maximum() == 0
				&&collatorObj.minimum() == 0
				&&collatorObj.numberOfReadings() == 0)
		{
			System.out.println("Pass");
		}
		else
			System.out.println("Fail");
		
		//Test 2: Test recordReadings method
		System.out.println("Test 2");
		collatorObj = new Collator("Temperature");
		collatorObj.recordReading(20);
		if(collatorObj.label().equals("Temperature")
				&&collatorObj.numberOfReadings() == 1
				&&collatorObj.minimum() == 20
				&&collatorObj.maximum() == 20
				&&collatorObj.average() == 20)
		{
			System.out.println("Pass");
		}
		else
			System.out.println("Fail");
		
		//Test 3: test recordReadings method with more than 1 readings
		System.out.println("Test 3");
		collatorObj = new Collator("Temperature");
		collatorObj.recordReading(20);
		collatorObj.recordReading(30);
		if(collatorObj.label().equals("Temperature")
				&&collatorObj.numberOfReadings() == 2
				&&collatorObj.minimum() == 20
				&&collatorObj.maximum() == 30
				&&collatorObj.average() == 25)
		{
			System.out.println("Pass");
		}
		else
			System.out.println("Fail");
		
	}
}
