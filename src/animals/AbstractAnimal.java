package animals;

public abstract class AbstractAnimal
{
	// Fields
	// Each animal to have, unique id, name, year discovered.

	int id;
	// String name;
	// int yearDiscovered;

	// constructors

	public AbstractAnimal()
	{
		maxId++;
		id = maxId;
	}

	public AbstractAnimal(String name, int yearDiscovered)
	{
		this.name = name;
		this.yearDiscovered = yearDiscovered;
	}

	// Abstract Methods
	public abstract String getMove();
	public abstract String getBreath();
	public abstract String reproduce();
	public abstract String getName();
	public abstract String getYear();



	// Methods

	public int getId() // Sanity check for proper ID being passed.
	{
		return id;
	}

	public void setId(int id) // May not need this
	{
		this.id = id;
	}
}