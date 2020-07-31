package longJump;

/**
 * Date 14 July 2020
 * @author Bandile Danxa
 *
 */
public class TestJumpRecord 
{

	private static JumpRecord jumpRecordObj;
	
	public static void main(String[] args) 
	{
		// Testing the recordJump method
		//initially there are no recordings in the list, so we will add the jump records and see if they appear as we expect
		System.out.println("Test 1");
		jumpRecordObj = new JumpRecord();
		jumpRecordObj.recordJump(1.5);
		jumpRecordObj.recordJump(2.0);
		jumpRecordObj.recordJump(2.5);
		if(jumpRecordObj.getJumpDistance(0) == 1.5
				&&jumpRecordObj.getJumpDistance(1) == 2.0
				&&jumpRecordObj.getJumpDistance(2) == 2.5)
			System.out.println("Pass");
		else
			System.out.println("Fail");
		
		// Testing recordFoulJump method
		System.out.println("Test 2");
		jumpRecordObj = new JumpRecord();
		jumpRecordObj.recordFoulJump();
		if(jumpRecordObj.getJumpDistance(0) == 0.0)
			System.out.println("Pass");
		else
			System.out.println("Fail");
		
		// Testing the jumps() method
		System.out.println("Test 3");
		jumpRecordObj = new JumpRecord();
		//first check the number of jumps before recording anything
		if(jumpRecordObj.jumps() == 0)
			System.out.println("Pass");
		else
			System.out.println("Fail");
		//secondly, check the nuber of jumps after recording two jumps
		System.out.println("Test 4");
		jumpRecordObj.recordJump(1.5);
		jumpRecordObj.recordJump(2.5);
		if(jumpRecordObj.jumps() == 2)
			System.out.println("Pass");
		else
			System.out.println("Fail");
		
		//Test the maxJumps() method
		System.out.println("Test 5");
		jumpRecordObj = new JumpRecord();
		if(jumpRecordObj.maxJumps() == 3)
			System.out.println("Pass");
		else
			System.out.println("Fail");
		
		//Testing the finished() method
		//By recording 3 jumps and see if they match the max number of jumps
		System.out.println("Test 6");
		jumpRecordObj = new JumpRecord();
		jumpRecordObj.recordJump(1.5);
		jumpRecordObj.recordJump(2.5);
		jumpRecordObj.recordJump(3.5);
		if(jumpRecordObj.finished())
			System.out.println("Pass");
		else
			System.out.println("Fail");
		
		//Test the foulJumps() and isFoulJump method
		//By recording 2 valid jumps and one foul jump
		System.out.println("Test 7");
		jumpRecordObj = new JumpRecord();
		jumpRecordObj.recordJump(1.5);
		jumpRecordObj.recordJump(2.5);
		jumpRecordObj.recordFoulJump();
		if(jumpRecordObj.foulJumps() == 1)
			System.out.println("Pass");
		else
			System.out.println("Fail");
		
		// Test the getJumpDistance() method
		System.out.println("Test 8");
		jumpRecordObj = new JumpRecord();
		jumpRecordObj.recordJump(1.5);
		jumpRecordObj.recordJump(2.5);
		jumpRecordObj.recordJump(3.5);
		if(jumpRecordObj.getJumpDistance(0) == 1.5
				&&jumpRecordObj.getJumpDistance(1) == 2.5
				&&jumpRecordObj.getJumpDistance(2) == 3.5)
			System.out.println("Pass");
		else
			System.out.println("Fail");
		
		// Test the getLongest() method
		System.out.println("Test 9");
		jumpRecordObj = new JumpRecord();
		jumpRecordObj.recordJump(1.5);
		jumpRecordObj.recordJump(2.5);
		jumpRecordObj.recordJump(3.5);
		if(jumpRecordObj.getLongest() == 3.5)
			System.out.println("Pass");
		else
			System.out.println("Fail");
	}

}
