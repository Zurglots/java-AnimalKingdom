package animals;

public class Mammal extends AbstractAnimal
{

	public Mammal(String name, int yearDiscovered)
	{
		super(name, yearDiscovered);
	}

	// Abstracted Methods Overrides
	@Override
	public String getMove();
	{
		return "walk"
	}
	@Override
	public String getBreath();
	{
		return "lungs"
	}

	@Override
	public String reproduce();
	{
		return "live births"
	}
}