public class Circle extends GeometricObject
{
	private double radius;

    public Circle()
	{

    }

    public Circle(double radius)
	{
		this.radius = radius;
    }

	//Returns radius
	public double getRadius()
	{
		return radius;
	}

	//Sets radius
	public void setRadius(double radius)
	{
		this.radius = radius;
	}

    @Override /** Return area */
    public double getArea()
	{
      	return Math.PI * (radius * radius);
    }

    @Override /** Return perimeter */
    public double getPerimeter()
	{
      	return 2 * radius * Math.PI;
    }
}
