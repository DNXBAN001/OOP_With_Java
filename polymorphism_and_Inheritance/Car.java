package polymorphism_and_Inheritance;


/**
 * Date : 13 July 2020
 * @author Bandile Danxa
 *
 */
public class Car extends Vehicle
{
	private int numberOfDoors;
	
	public Car(String colour, int passengers,  int numberOfDoors) 
	{
		super(passengers, colour);
		this.numberOfDoors = numberOfDoors;
		
	}
	@Override
	public String toString() 
	{
		return colour + " " + numPassengers + " passengers " + numberOfDoors;
	}

}
