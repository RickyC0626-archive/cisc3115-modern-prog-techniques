public class Panther extends Feline
{
	public Panther(String name)
	{
		super(name);
	}

	public void makeNoise()
	{
		System.out.println("Roar...");
	}

	public void pounce()
	{
		System.out.println(getName() + " pounces on some livestock.");
	}
}
