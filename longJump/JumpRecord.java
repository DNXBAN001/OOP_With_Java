package longJump;

import java.util.*;

/**
 * Date 14 July 2020
 * @author Bandile Danxa
 *
 */
public class JumpRecord
{
	private int maxNumberOfJumps = 3;
	private ArrayList<Double> jumpsList = new ArrayList<>();
	
	//Constructors
	public JumpRecord()
	{
		
	}
	
	/**
	 * Update record with jump of given distance . (Assumes !finished().)
	 * @param distance
	 */
	public void recordJump(double distance)
	{
		if(!finished())
		{
			this.jumpsList.add(distance);
		}
	}
	/**
	 * Record latest jump as a foul. (Assumes !finished().)
	 */
	public void recordFoulJump()
	{
		this.jumpsList.add(0.0);//make 0.0 to indicate a foul jump
	}
	
	/**
	 * Obtain the number of jumps recorded so far.
	 * @return int
	 */
	public int jumps()
	{
		return this.jumpsList.size();
	}
	/**
	 * determine whether jumps==maxJumps()
	 * @return boolean
	 */
	public boolean finished()
	{
		if(this.jumpsList.size() == this.maxNumberOfJumps)
		{
			return true;
		}
		return false;
	}
	/**
	 * Obtain the total number of jumps permitted.
	 * @return int
	 */
	public int maxJumps()
	{
		return this.maxNumberOfJumps;
	}
	/**
	 * Obtain the number of foul jumps committed so far.
	 * @return int
	 */
	public int foulJumps()
	{
		int numOfFoulJumps = 0;
		for(int i = 0; i < this.jumpsList.size(); i++)
		{
			if(isFoulJump(i))
				numOfFoulJumps++;
		}
		return numOfFoulJumps;
	}
	/**
	 * Determine whether jump n is a foul jump. (Assumes 0<n<=jumps().
	 * @param n
	 * @return
	 */
	public boolean isFoulJump(int n)
	{
		if(this.jumpsList.get(n) == 0.0)
			return true;
		
		return false;
	}
	/**
	 * Obtain the distance achieved for jump number n. (Assumes !isFoul(n).)
	 * @param n
	 * @return double
	 */
	public double getJumpDistance(int n)
	{
		return !isFoulJump(n) ? this.jumpsList.get(n) : 0.0;//return the distance if it is not a foul jump, else return 0.0
	}
	/**
	 * Obtain the number of the longest jump achieved so far i.e. 1st, 2nd or 3rd.
	 * If two or more jumps are the same (longest) distance, returns the number of the first.
	 * (Assumes jumps()>0&&foulJumps()<jumps().)
	 * @return double
	 */
	public double getLongest()
	{
		double longestJump = 0;
		for(int i = 0; i < this.jumpsList.size(); i++)
		{
			if(longestJump < this.jumpsList.get(i))
				longestJump = this.jumpsList.get(i);
		}
		return longestJump;
	}

}
