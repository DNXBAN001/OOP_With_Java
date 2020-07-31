package clockDisplay;

public class CounterDisplay 
{

	//Instance variables
	private int value;
	private int limit;
	
	//Constructors
	public CounterDisplay(int pLimit)
	{
		// Create a new CounterDisplay, set counter value to 0, and set the limit to pLimit.
		this.value = 0;
		this.limit = pLimit;
	}
	
	
	//Methods
	public void setValue(int pValue)
	{
		// Set the current counter value to pValue.
		this.value = pValue;
	}
	
	public int getValue()
	{
		// Get the current value.
		return this.value;
	}
	
	public void increment()
	{
		// Advance the counter by 1, rolling over to 0 if the limit is reached.
		if(this.value < this.limit)
			this.value++;
		if(this.value == this.limit)
			this.value %= this.limit;
		
	}
	
	public String getDisplayValue()
	{
		// Obtain the display value i.e. the current counter value in the form of a 2 digit string.
		String str = "0" + this.value;
		if(str.length() > 2)
			return str.substring(1);
		return str;
	}
}
