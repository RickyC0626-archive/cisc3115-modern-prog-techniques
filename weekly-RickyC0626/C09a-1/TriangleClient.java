import java.util.Scanner;

public class TriangleClient
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    EquilateralTriangle et = new EquilateralTriangle();

    System.out.print("Enter the base: ");
    double base = sc.nextDouble();
    et.setBase(base);

    System.out.print("Enter the height: ");
    double height = sc.nextDouble();
    et.setHeight(height);

    System.out.println("Base: " + et.getBase());
    System.out.println("Height: " + et.getHeight());
    System.out.println("Area: " + et.getArea(base, height));
    System.out.printf("Perimeter of Equilateral Triangle with base %.1f: %.1f", et.getBase(), et.getPerimeter(base));
  }
}
