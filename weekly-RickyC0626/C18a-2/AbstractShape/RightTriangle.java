public class RightTriangle extends Triangle
{
	private double base;
	private double height;

	public RightTriangle(String name, double base, double height)
	{
		super(name);
		this.base = base;
		this.height = height;
	}

	public double getArea()
	{
		return (base/2) * height;
	}

	public boolean isEquilateral()
	{
		return false;
	}
}
