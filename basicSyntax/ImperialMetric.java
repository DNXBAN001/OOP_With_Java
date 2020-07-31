import java.util.*;


/**
 * Date 1 July 2020
 * @author Bandile Danxa
 *
 */
public class ImperialMetric 
{

	public static void main(String[] args) 
	{
		double [] inches = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the minimum number of feet (not less than 0):");
		int startFeet = input.nextInt();
		System.out.println("Enter the maximum number of feet (not more than 30):");
		int maxFeet = input.nextInt();
		
		double [] feet = new double[maxFeet-startFeet+1];//declare a feet array of size maxfeet-startfeet
		double[][] metres = new double[feet.length][inches.length];
		
		//initialize the values of the feet array
		for(int i = 0; i < feet.length; i++)
			{feet[i] = startFeet;startFeet++;}
		
		//initialize the values of the metres array by computing each
		for(int i = 0; i < feet.length; i++)
		{
			for(int j = 0; j < inches.length; j++)
				metres[i][j] = (feet[i]*12+inches[j])*0.0254;//calculate the metres for each feet and inch value
		}
		
		System.out.print("      |");
		for(double inch : inches)
			System.out.printf("%4d\" ", (int)inch);
		
		System.out.println();//go to next line
		
		//printing everything else in the grid/table format
		for(int m = 0; m < feet.length; m++)
		{
			System.out.printf("%5d'|", (int)feet[m]);
			for(int n = 0; n < inches.length; n++)
				System.out.printf("%2.3f ", metres[m][n]);
			
			System.out.println();//go to next line
		}
		

	}

}
