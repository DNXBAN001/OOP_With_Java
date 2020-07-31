package polymorphism_and_Inheritance;

import java.util.ArrayList;

public class Food
{
	protected ArrayList<String> list = new ArrayList<>();
	
	public Food(String menuItemNumber, String size)
	{
		list.add(menuItemNumber);
		list.add(size);
	}

}
