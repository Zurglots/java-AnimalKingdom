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

	}
}