public class Triangle extends GeometricObject
{
  private double base;
  private double height;

  public Triangle()
  {

  }

  public Triangle(double base, double height)
  {
    this.base = base;
    this.height = height;
  }

  public Triangle(double base, double height, String color, boolean filled)
  {
    this.base = base;
    this.height = height;
    setColor(color);
    setFilled(filled);
  }

  public double getBase()
  {
    return base;
  }

  public void setBase(double base)
  {
    this.base = base;
  }

  public double getHeight()
  {
    return height;
  }

  public void setHeight(double height)
  {
    this.height = height;
  }

  public double getArea(double base, double height)
  {
    return (base * height) / 2;
  }
}
