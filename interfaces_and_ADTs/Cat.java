package interfaces_and_ADTs;

public class Cat implements MakesSound
{
	private String cry = "Meow";
	
	public Cat()
	{
		
	}
	
	@Override
	public String makeNoise()
	{
		return cry;
	}
}