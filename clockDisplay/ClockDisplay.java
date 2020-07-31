package clockDisplay;

public class ClockDisplay 
{

	//Instance variables
	private CounterDisplay hours;
	private CounterDisplay minutes;
	
	//Constructors
	public ClockDisplay(int pHours, int pMinutes)
	{
		// Create a new ClockDisplay and set the display value to pHours and pMinutes.
		this.hours = new CounterDisplay(24);
		this.hours.setValue(pHours);
		this.minutes = new CounterDisplay(60);
		this.minutes.setValue(pMinutes);
	}
	
	//Methods
	public void setTime(int pHours, int pMinutes)
	{
		// Set the display value to pHours and pMinutes.
		this.hours.setValue(pHours);
		this.minutes.setValue(pMinutes);
	}
	
	public void tick()
	{
		// Advance the display time by one minute.
		if(this.minutes.getValue() <= 59)
			this.minutes.increment();
		//increment the hours if the minutes are greater than 59 
		//(minutes are reset to zero since they cant exceed 59 hence i compare them to zero before i can increment hours)
		if(this.minutes.getValue() == 0)
			this.hours.increment();
	}
	
	public String getDisplayValue()
	{
		// Obtain the display value; a String composed of 2 digits for hours then a colon, then 2 digits for minutes.
		String hoursStr = this.hours.getDisplayValue();
		String minutesStr = this.minutes.getDisplayValue();
		
		return hoursStr+":"+minutesStr;
	}
}
