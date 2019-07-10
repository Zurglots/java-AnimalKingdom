package animals;

public class Bird extends AbstractAnimal
{
	private String name;
	private int yearDiscovered;

	public Bird(String name, int yearDiscovered)
	{
		super(id);
		this.name = name;
		this.yearDiscovered = yearDiscovered;
	}

	// Abstracted Methods Overrides
	@Override
	public String getMove();
	{
		return "fly"
	}
	@Override
	public String getBreath();
	{
		return "lungs"
	}

	@Override
	public String reproduce();
	{
		return "eggs"
	}
}