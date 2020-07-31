package interfaces_and_ADTs;

import java.util.*;

/**
*Date : 20 July 2020
*@author Bandile Danxa
*/
public class Question1
{
	private static Scanner input = new Scanner(System.in);
	private static List<SoftDrink> softdrinkList = new ArrayList<>();
	private static SoftDrink softdrinkObj;
	
	public static void main(String[] args)
	{
		String[] drinkAttributes;//array to collect the user inputs(softdrink characteristics)
		String temp = "";
		int choice;
		do
		{
			System.out.println("Enter option: (1) add soft drink (2) quit:");
			choice = input.nextInt();//get a new user choice
			
			switch(choice)
			{
				case 1: 
					System.out.println("Enter name, colour and volume in ml separated by space");
					//skipping the blank at the end of the nextInt() reading and going to read from next line
					temp = input.nextLine();
					//reading everything that is on the new line and storing it on temp variable
					temp = input.nextLine();
					
					//split content in temp variable by empty spaces and store that in our drinkAttributes array
					drinkAttributes = temp.split("\\s+");
					
					//add name, can colour and volume to the softdrink object
					softdrinkObj = new SoftDrink(drinkAttributes[0], drinkAttributes[1], drinkAttributes[2]);
					
					//add softdrink object to the softdrink list
					softdrinkList.add(softdrinkObj);
					break;
			}
		}
		while(choice != 2);
		
		//First sort the objects in the arraylist by volumes in ascending order
		Collections.sort(softdrinkList,  new Comparator<SoftDrink>() {
			@Override
			public int compare(SoftDrink s1, SoftDrink s2)
			{
				return s1.getVolume().compareTo(s2.getVolume());
			}
		});//the end result here will be sorted in the order [volume -> colourOfTheCan -> names]
		
		//Secondly, sort the objects in the arraylist by can colors in ascending order
		Collections.sort(softdrinkList,  new Comparator<SoftDrink>() {
			@Override
			public int compare(SoftDrink s1, SoftDrink s2)
			{
				return s1.getColourOfTheCan().compareTo(s2.getColourOfTheCan());
			}
		});//the end result here will be sorted in the order [colourOfTheCan -> volume -> names]
		
		//3, sort the objects in the arraylist by names in ascending order
		Collections.sort(softdrinkList,  new Comparator<SoftDrink>() {
			@Override
			public int compare(SoftDrink s1, SoftDrink s2)
			{
				return s1.getName().compareTo(s2.getName());
			}
		});//the end result here will be sorted in the order [name -> colourOfTheCan -> volume]
		
		
		//Finally we can display our softdrink objects that are on the list in the order in which they have been sorted
		for(SoftDrink drink : softdrinkList)
		{
			System.out.println(drink.getName()+" "+drink.getColourOfTheCan()+" "+drink.getVolume());
		}
	}
}