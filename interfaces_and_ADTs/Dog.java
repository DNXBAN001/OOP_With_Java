package interfaces_and_ADTs;

public class Dog implements MakesSound
{
	private String cry = "Woof";
	public Dog()
	{
		
	}
	@Override
	public String makeNoise()
	{
		return cry;
	}
}