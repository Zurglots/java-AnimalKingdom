package animals;

public class Fish extends AbstractAnimal
{
	private String name;
	private int yearDiscovered;


	public Fish(String name, int yearDiscovered)
	{
		super(id);
		this.name = name;
		this.yearDiscovered = yearDiscovered;
	}

	// Abstracted Methods Overrides
	@Override
	public String getMove();
	{
		return "swim"
	}
	@Override
	public String getBreath();
	{
		return "gills"
	}

	@Override
	public String reproduce();
	{
		return "eggs"
	}
}
