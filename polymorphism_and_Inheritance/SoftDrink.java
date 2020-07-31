package polymorphism_and_Inheritance;

import java.util.ArrayList;

public class SoftDrink extends Food
{

	public SoftDrink(String menuItemNumber, String size, String flavour, String bottleOrCan) 
	{
		super(menuItemNumber, size);
		list.add(flavour);
		list.add(bottleOrCan);
		
	}


}
