package polymorphism_and_Inheritance;

/**
 * Date : 13 July 2020
 * @author Bandile Danxa
 *
 */
public class Plane extends Vehicle
{

	private String manufacturer;
	private int modelNumber;
	
	public Plane(String colour, int passengers, String manufacturer, int modelNumber) 
	{
		super(passengers, colour);
		this.manufacturer = manufacturer;
		this.modelNumber = modelNumber;
		
	}
	@Override
	public String toString() 
	{
		return colour + " " + numPassengers + " passengers " + manufacturer +" "+ modelNumber;
	}

	
}
