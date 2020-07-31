package classesAndObjects;

public class UberService 
{
	private String serviceName;
	private int baseFare;
	private int costPerMinute;
	private int costPerKilometer;
	private int cancellationFee;

	
	//Methods
	public void setDetails(String name, int costPerMin, int costPerKM, int baseFee, int cancellationFee)
	{
		// Set the details of this service to the given values.
		this.serviceName = name;
		this.baseFare = baseFee;
		this.costPerMinute = costPerMin;
		this.costPerKilometer = costPerKM;
		this.cancellationFee = cancellationFee;
		
	}
	
	public void setName(String name)
	{
		// Set the service name.
		this.serviceName = name;
	}
	
	public String getName()
	{
		// Obtain the service name.
		return this.serviceName;
	}
	
	public void setCostPerMinute(int cents)
	{
		// Set the cost per minute.
		this.costPerMinute = cents;
	}
	
	public int getCostPerMinute()
	{
		// Set the cost per minute in cents.
		return this.costPerMinute;
	}
	
	public void setCostPerKilometre(int cents)
	{
		// Set the cost per kilometre.
		this.costPerKilometer = cents;
	}
	
	public int getCostPerKilometre()
	{
		// get the cost per kilometre in cents.
		return this.costPerKilometer;
	}
	
	public void setBaseFare(int cents)
	{
		// Set the base fare.
		this.baseFare = cents;
	}
	
	public int getBaseFare()
	{
		// get the base fare in cents.
		return this.baseFare;
	}
	
	public void setCancellationFee(int n)
	{
		// Set the cancellation fee.
		this.cancellationFee = n;
	}
	
	public int getCancellationFee()
	{
		// Obtain the cancellation fee in cents for this service.
		return this.cancellationFee;
	}
	
	public double calculateFare(double minutes, double distance)
	{
		// Obtain the fare (in the form of a real number of cents) for a journey of the
		// given time and distance.
		return this.baseFare + this.costPerMinute*minutes + this.costPerKilometer*distance;
	}
	
}
