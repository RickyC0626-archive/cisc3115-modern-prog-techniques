public class ShowErrorsC
{
    public ShowErrorsC()
    {

    }

    public static void main(String[] args)
    {
      Circle c = new Circle();
      System.out.println("Radius: " + c.getRadius());
      c = new Circle();
    }
}

class Circle
{
    int radius = 0;

    public Circle()
    {

    }

    public int getRadius()
    {
        radius = 5;
        return radius;
    }
}
