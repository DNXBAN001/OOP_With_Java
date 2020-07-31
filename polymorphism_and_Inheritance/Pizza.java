package polymorphism_and_Inheritance;

import java.util.ArrayList;

public class Pizza extends Food 
{

	public Pizza(String menuItemNumber, String size, String base, String extraCheese, String extraGarlic) 
	{
		super(menuItemNumber, size);
		list.add(base);
		list.add(extraCheese);
		list.add(extraGarlic);
	}
	
	

}
