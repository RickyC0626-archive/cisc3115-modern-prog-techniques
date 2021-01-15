public class EquilateralTriangle extends Triangle
{
  private double base;

  public EquilateralTriangle()
  {

  }

  public EquilateralTriangle(double base)
  {
    this.base = base;
  }

  public EquilateralTriangle(double base, String color, boolean filled)
  {
    this.base = base;
    setColor(color);
    setFilled(filled);
  }

  public double getPerimeter(double base)
  {
    return base * 3;
  }
}
