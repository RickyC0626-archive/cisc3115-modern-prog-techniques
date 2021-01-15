import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SortShapes
{
	public static void main(String[] args)
  	{
		ArrayList<Shape> shapes =
		new ArrayList<Shape>(Arrays.asList(
		new ComparableRectangle(3.4, 5.4),
		new ComparableRectangle(13.24, 55.4),
        	new ComparableRectangle(7.4, 35.4),
        	new ComparableRectangle(1.4, 25.4),
		new ComparableCircle(3.4),
        	new ComparableCircle(13.24),
        	new ComparableCircle(7.4),
        	new ComparableCircle(1.4)));

		Collections.sort(shapes, new Comparator<Shape>()
		{
			@Override
			public int compare(Shape s1, Shape s2)
			{
				return Double.compare(s1.getArea(), s2.getArea());
			}
		});

		for(Shape shape : shapes)
		{
			System.out.print(shape + " ");
			System.out.println();
		}
  	}
}
