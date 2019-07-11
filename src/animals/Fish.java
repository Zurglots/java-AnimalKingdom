package animals;

public class Fish extends AbstractAnimal
{

	public Fish(String name, int yearDiscovered)
	{
		super(name, yearDiscovered);
	}

	// Abstracted Methods Overrides
	@Override
	public String getMove()
	{
		return "swim";
	}
	@Override
	public String getBreath()
	{
		return "gills";
	}

	@Override
	public String reproduce()
	{
		return "eggs";
	}
}
