package animals;

public class Bird extends AbstractAnimal
{

	public Bird(String name, int yearDiscovered)
	{
		super(name, yearDiscovered);
	}

	// Abstracted Methods Overrides
	@Override
	public String getMove()
	{
		return "fly";
	}
	@Override
	public String getBreath()
	{
		return "lungs";
	}

	@Override
	public String reproduce()
	{
		return "eggs";
	}
}