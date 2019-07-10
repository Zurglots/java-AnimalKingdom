package animals;

public class Mammal extends AbstractAnimal
{
	private String name;
	private int yearDiscovered;

	public Mammal(String name, int yearDiscovered)
	{
		super(id);
		this.name = name;
		this.yearDiscovered = yearDiscovered;
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