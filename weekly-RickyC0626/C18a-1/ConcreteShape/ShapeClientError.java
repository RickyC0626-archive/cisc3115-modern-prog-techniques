import java.util.ArrayList;

public class ShapeClientError
{
    public static void main(String[] args) {
        ArrayList<Shape> shapeList = new ArrayList<Shape>();

        Shape s1 = new Circle("circle 1", 10);
        shapeList.add(s1);

        Shape s2 = new Rectangle("rectangle 2", 100, 100);
        shapeList.add(s2);

        // Compiler may not prevent this kind of error
        Shape s3 = new Shape("Shape 3");
        shapeList.add(s3);

		Shape s4 = new RightTriangle("RightTriangle 4", 100, 100);
		shapeList.add(s4);

		//No errors in compilation, but errors at runtime
		/*
		Exception in thread "main" java.lang.UnsupportedOperationException: Cannot invoke the method
		        at Shape.getArea(Shape.java:9)
		        at ShapeClientError.sumAreasOfShapes(ShapeClientError.java:34)
		        at ShapeClientError.main(ShapeClientError.java:21)
		*/

        double totalArea = sumAreasOfShapes(shapeList);
        System.out.println("The total area of the shapes are " + totalArea);
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
