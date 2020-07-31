package interfaces_and_ADTs;

/**
*Date : 20 July 2020
*@author Bandile Danxa
*/
public class SoftDrink
{
	private String colourOfTheCan;
	private String name; 
	private String volume;
	
	public SoftDrink(String name, String colourOfTheCan, String volume)
	{
		this.name = name;
		this.colourOfTheCan = colourOfTheCan;
		this.volume = volume;
	}
	public String getName()
	{
		return this.name;
	}
	public String getColourOfTheCan()
	{
		return this.colourOfTheCan;
	}
	public String getVolume()
	{
		return this.volume;
	}
}