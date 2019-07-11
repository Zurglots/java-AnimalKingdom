package animals;

public class Fish extends AbstractAnimal
{
	// Passing fields through super. Redacting lines 6 & 7.
	// private String name;
	// private int yearDiscovered;

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
