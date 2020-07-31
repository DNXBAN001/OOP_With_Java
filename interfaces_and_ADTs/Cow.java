package interfaces_and_ADTs;

public class Cow implements MakesSound
{
	private String cry = "Moo!";
	public Cow()
	{
		
	}
	@Override
	public String makeNoise()
	{
		return cry;
	}
}