package polymorphism_and_Inheritance;
import java.util.*;

public class Question2
{
	private static Pizza pizzaObj;
	private static Curry curryObj;
	private static SoftDrink softdrinkObj;
	private static Scanner input = new Scanner(System.in);
	private static ArrayList<Object> orderList = new ArrayList<>();
	

	public static void main(String[] args) 
	{
		menu();
		String choice = input.nextLine();
		//as long as the choice is not equal to Q then continue asking the user to choose from menu
		while(!choice.equals("Q"))
		{
			processChoice(choice);
			menu();
			choice = input.nextLine();
		}
		System.out.println("Program terminated...");
	}
	static void menu()
	{
		System.out.println("\nWelcome to Great International Food Court\r\n"
				+"MENU: add (P)izza\r\n"
				+"add (C)urry\r\n"
				+"add (S)oft drink\r\n"
				+"(D)elete\r\n"
				+"(L)ist,\r\n" 
				+"(Q)uit\r\n");
	}
	static void processChoice(String choice)
	{
		String menuItemNumber;
		String size;
		switch(choice)
		{
			case "P":
				System.out.println("Enter the menu item number");
				menuItemNumber = input.nextLine();
				System.out.println("Enter the size");
				size = input.nextLine();
				System.out.println("Enter the base");
				String base = input.nextLine();
				System.out.println("Enter extra cheese");
				String extraCheese = input.nextLine();
				System.out.println("Enter extra garlic");
				String extraGarlic = input.nextLine();
				pizzaObj = new Pizza(menuItemNumber, size, base, extraCheese, extraGarlic);
				orderList.add(pizzaObj);
				System.out.println("Done...");
				/**Enter the menu item number
					123
					Enter the size
					12"
					Enter the base
					Hand-tossed
					Enter extra cheese
					Yes
					Enter extra garlic
					Yes
					Done
				*/
				break;
			case "C":
				System.out.println("Enter the menu item number");
				menuItemNumber = input.nextLine();
				System.out.println("Enter the size");
				size = input.nextLine();
				System.out.println("Enter the curry type");
				String curryType = input.nextLine();
				curryObj = new Curry(menuItemNumber, size, curryType);
				orderList.add(curryObj);
				System.out.println("Done...");
				break;
			case "S":
				System.out.println("Enter the menu item number");
				menuItemNumber = input.nextLine();
				System.out.println("Enter the size");
				size = input.nextLine();
				System.out.println("Enter the flavour");
				String flavour = input.nextLine();
				System.out.println("Enter whether it is a bottle or can");
				String bottleOrCan = input.nextLine();
				softdrinkObj = new SoftDrink(menuItemNumber, size, flavour, bottleOrCan);
				orderList.add(softdrinkObj);
				System.out.println("Done...");
				break;
			case "D":
				System.out.println("Enter the menu item number");
				menuItemNumber = input.nextLine();
				
				//check if the item number is for the pizza so we remove the pizza object 
				//from the order list if that is the case 
				if(pizzaObj.list.get(0).equals(menuItemNumber))
				{
					orderList.remove(pizzaObj);
				}
				//check if the item number is for the curry so we remove the curry object 
				//from the order list if that is the case
				else if(curryObj.list.get(0).equals(menuItemNumber))
				{
					orderList.remove(curryObj);
				}
				//check if the item number is for the softdrink so we remove the softdrink object 
				//from the order list if that is the case
				else if(softdrinkObj.list.get(0).equals(menuItemNumber))
				{
					orderList.remove(softdrinkObj);
				}
				break;
			case "L":
				for(int i = 0; i < pizzaObj.list.size(); i++)
				{
					if(i == 0)
						System.out.print("Pizza: "+pizzaObj.list.get(i)+" ");
					else
						System.out.print(pizzaObj.list.get(i)+" ");
					
				}
				System.out.println();
				for(int i = 0; i < curryObj.list.size(); i++)
				{
					if(i == 0)
						System.out.print("Curry: "+curryObj.list.get(i)+" ");
					else
						System.out.print(curryObj.list.get(i)+" ");
				}
				System.out.println();
				for(int i = 0; i < softdrinkObj.list.size(); i++)
				{
					if(i == 0)
						System.out.print("Soft Drink: "+softdrinkObj.list.get(i)+" ");
					else
						System.out.print(softdrinkObj.list.get(i)+" ");
				}
				System.out.println();
				break;
		}
	}

}
