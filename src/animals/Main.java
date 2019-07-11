package animals;

import java.util.*;

public class Main 
{

	public static void printAnimals(ArrayList<AbstractAnimal> animals, CheckAnimal tester)
	{
		for (AbstractAnimal a : animals)
			// for each instance of an animal in animals, if the expression sent via printAnimals is true, print the the following for said element. 
		{
			if (tester.test(a)) 
			// test is undefined until we send it the filter request from printAnimals below.
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

		// Construct Bird Data

		Bird pigeon = new Bird("Pigeon", 1837);
		Bird peacock = new Bird("Peacock", 1821);
		Bird toucan = new Bird("Toucan", 1758);
		Bird parrot = new Bird("Parrot", 1824);
		Bird swan = new Bird("Swan", 1758);

		// Add Bird Data to animalList

		animalList.add(pigeon);
		animalList.add(peacock);
		animalList.add(toucan);
		animalList.add(parrot);
		animalList.add(swan);

		// Construct Fish Data

		Fish salmon = new Fish("Salmon", 1758);
		Fish catfish = new Fish("Catfish", 1817);
		Fish perch = new Fish("Perch", 1758);

		// Add Fish Data to animalList

		animalList.add(salmon);
		animalList.add(catfish);
		animalList.add(perch);

		// Commence sorting!

		// List all the animals in descending order by year named
		System.out.println(" | List Start | ");
		System.out.println();
		System.out.println("Year Named Descending");

		animalList.sort((a1, a2)-> a2.yearDiscovered - a1.yearDiscovered); // sort decending.
		printAnimals(animalList, a -> a.id > 0); // prints all objects with maxId greater than 0.

		// List all the animals alphabetically


		// List all the animals order by how they move


		// List only those animals the breath with lungs


		// List only those animals that breath with lungs and were named in 1758


		// List only those animals that lay eggs and breath with lungs


		// List alphabetically only those animals that were named in 1758


	}
}