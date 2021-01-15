import java.util.ArrayList;

public class AnimalClient
{
	public static void main(String[] args)
	{
		noiseAction();
		pounceAction();
	}

	public static void noiseAction()
	{
		ArrayList<Animal> animalList = new ArrayList<Animal>();

		Animal cat = new Cat("First Cat");
		animalList.add(cat);
		Animal whale = new Whale("First Whale");
		animalList.add(whale);
		Animal dove = new Dove("First Dove");
		animalList.add(dove);
		Animal panther = new Panther("First Panther");
		animalList.add(panther);

		for(int i = 0; i < animalList.size(); i++)
		{
			animalList.get(i).makeNoise();
		}
	}

	public static void pounceAction()
	{
		ArrayList<Feline> felineList = new ArrayList<Feline>();

		Feline cat = new Cat("Second Cat");
		felineList.add(cat);
		Feline panther = new Panther("Second Panther");
		felineList.add(panther);

		for(int i = 0; i < felineList.size(); i++)
		{
			felineList.get(i).pounce();
		}
	}
}
