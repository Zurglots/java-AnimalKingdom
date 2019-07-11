package animals;

import java.util*;

public class Main 
{

	public static void printAnimals(ArrayList<AbstractAnimal> animals, CheckAnimal tester)
	{
		for (AbstractAnimal a : animals)
			// for each instance of an animal in animals, if the expression sent via printAnimals is true, print the the following for said element. 
		{
			if (tester.test(a)) 
			// test is underfined until we send it the filter request from printAnimals below.
			{
				System.out.println("Name: " + a.name + " | " + "Travels by: " + a.getMove() + " | " + "Reproduces by: " + a.reproduce());
			}
		}
	}
	public static void main(String[] args)
	{
		ArrayList<AbstractAnimal> animalList = new ArrayList<>(); // create new array list comprised of

		// Construct Mammal Data
		Mammal panda = new Mammal("Panda", 1869);
		Mammal zebra = new Mammal("Zebra", 1778);
		Mammal koala = new Mammal("Koala", 1816);
		Mammal sloth = new Mammal("Sloth", 1804);
		Mammal armadillo = new Mammal("Armadillo", 1758);
		Mammal raccoon = new Mammal("Raccoon", 1758);
		Mammal bigfoot = new Mammal("Bigfoot!", 2005);

		// Add Mammal Data To animalList

		animalList.add(panda);
		animalList.add(zebra);
		animalList.add(koala);
		animalList.add(sloth);
		animalList.add(armadillo);
		animalList.add(raccoon);
		animalList.add(bigfoot);


	}
}