package polymorphism_and_Inheritance;


/**
 * Date : 13 July 2020
 * @author Bandile Danxa
 *
 */
public class Vehicle 
{

	protected int numPassengers;
	protected String colour;
	
	public Vehicle(int passengers, String colour) 
	{
		this.numPassengers = passengers;
		this.colour = colour;
	}
	
	@Override
	public String toString() 
	{
		return colour + " " + numPassengers + " passengers";
	}
}
