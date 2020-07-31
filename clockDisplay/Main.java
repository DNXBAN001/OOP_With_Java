package clockDisplay;

public class Main 
{
	public static void main(String[] args) 
	{
		ClockDisplay clockDisplay = new ClockDisplay(5, 30);
		for(int i = 0; i < 120; i++)
		{
			clockDisplay.tick();
			System.out.println(clockDisplay.getDisplayValue());
		}
	}
}
