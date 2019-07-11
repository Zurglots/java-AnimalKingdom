package animals;

public abstract class AbstractAnimal
{
	// Fields
	// Each animal has: unique id, name, year discovered.
	public static int maxId = 0;
	public int id;
	public String name;
	public int yearDiscovered;

	// Constructor
	public AbstractAnimal(String name, int yearDiscovered)
	{
		maxId++;
		this.id = maxId;
		this.name = name;
		this.yearDiscovered = yearDiscovered;
	}

	// Abstract Methods
	public abstract String getMove();
	public abstract String getBreath();
	public abstract String reproduce();

	// Methods
	public String eatFood()
	{
		return "Yes";
	}
}