import java.util.ArrayList;

public class ShapeClient
{
    public static void main(String[] args) {
        ArrayList<Shape> shapeList = new ArrayList<Shape>();

        Shape s1 = new Circle("circle 1", 10);
        shapeList.add(s1);

        Shape s2 = new Rectangle("rectangle 2", 100, 100);
        shapeList.add(s2);

		Triangle s3 = new RightTriangle("right triangle 3", 100, 100);
		shapeList.add(s3);

		Triangle s4 = new EquilateralTriangle("eq triangle 4", 10);
		shapeList.add(s4);

        if (!s1.getClass().isInstance(s2))
		{
        	System.out.println("Actual types of s1 and s2 are different");
        }

		if(!s2.getClass().isInstance(s3))
		{
			System.out.println("Actual types of s2 and s3 are different");
		}

		if(!s3.getClass().isInstance(s4))
		{
			System.out.println("Actual types of s3 and s4 are different");
		}

        double totalArea = sumAreasOfShapes(shapeList);
        System.out.println("The total area of the shapes are " + totalArea);

		System.out.println("Is s3 an equilateral triangle? " + s3.isEquilateral());
		System.out.println("Is s4 an equilateral triangle? " + s4.isEquilateral());
    }

    public static double sumAreasOfShapes(ArrayList<Shape> shapeList) {
      double sum = 0.;
      // Use the enhanced for loop
      // for (Shape shape: shapeList) {
      //   sum += shape.getArea();
      // }

      // Use the for loop
      for (int i=0; i<shapeList.size(); i++) {
        sum += shapeList.get(i).getArea();
      }
      return sum;
    }
}
