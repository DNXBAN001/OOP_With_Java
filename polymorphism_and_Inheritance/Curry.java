package polymorphism_and_Inheritance;

import java.util.ArrayList;

public class Curry extends Food
{

	public Curry(String menuItemNumber, String size, String curryType)
	{
		super(menuItemNumber, size);
		list.add(curryType);
	}

}
