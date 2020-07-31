package classesAndObjects;

public class Collator 
{
	private String label;
	private int numReadings;
	private int total;
	private int maximum;
	private int minimum;
	private double average;
	
	public Collator(String label)
	{
		this.label = label;
		this.numReadings = 0;
		this.total = 0;
		this.maximum = 0;
		this.minimum = 0;
	}
	
	public void label(String label)
	{
		this.label = label;
	}
	public String label()
	{ 
		return this.label;
	}
	public void recordReading(int reading)
	{
		if(numReadings<1)
		{
			// This must be the first reading
			this.total = reading;
			this.maximum = reading;
			this.minimum = reading;
			this.numReadings = 1;
		}
		else
		{
			// Update total and number of readings.
			this.total += reading;
			this.numReadings++;
			// Check for a new maximum
			if(reading > this.maximum)
				this.maximum = reading;
			// Check for a new minimum
			if(reading < this.minimum)
				this.minimum = reading;
		}
	}
	public int maximum()
	{
		return this.maximum;
	}
	public int minimum()
	{
		return this.minimum;
	}
	public double average()
	{
		return this.total/(double)this.numReadings;
	}
	public int numberOfReadings()
	{ 
		return this.numReadings;
	}

}
