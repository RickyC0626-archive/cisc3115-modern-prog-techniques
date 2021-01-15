public class Cat extends Feline
{
	public Cat(String name)
	{
		super(name);
	}

	public void makeNoise()
	{
		System.out.println("Meow...");
	}

	public void pounce()
	{
		System.out.println(getName() + " pounces on some mice.");
	}
}
