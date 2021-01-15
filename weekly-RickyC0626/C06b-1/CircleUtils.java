public class CircleUtils
{
  public void printCircle(Circle c)
  {
    System.out.println("The area of the circle of radius " + c.getRadius() + " is " + c.getArea());
  }

  public void printCircle(Circle circle, int times)
  {
    Circle c = new Circle(circle);
    System.out.println("Radius \t\t Area");
    for (int i = 0; i < times; i ++)
    {
      System.out.println(c.getRadius() + "\t\t" + c.getArea());
      c.setRadius(c.getRadius() + 1);
    }
  }

  public void doubleRadius(Circle c)
  {
    double radius;
    radius = c.getRadius() * 2;
    System.out.println("Radius Doubled: " + radius);
  }

  public void doubleArea(Circle c)
  {
    double area;
    area = c.getArea() * 2;
    System.out.println("Area Doubled: " + area);
  }

  public Circle getNewCircleDoubleRadius(Circle c)
  {
      Circle newCircle = new Circle(c.getRadius() * 2);

      return newCircle;
  }

  public Circle getNewCircleDoubleArea(Circle c)
  {
      Circle newCircle = new Circle(c.getRadius() * Math.sqrt(2));

      return newCircle;
  }
}
