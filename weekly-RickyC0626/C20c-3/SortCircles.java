import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;

public class SortCircles
{
  	public static void main(String[] args)
  	{
    	/* create and initialize an ArrayList */
    	ArrayList<ComparableCircle> circles =
      	new ArrayList<ComparableCircle>(Arrays.asList(
        new ComparableCircle(3.4),
        new ComparableCircle(13.24),
        new ComparableCircle(7.4),
        new ComparableCircle(1.4)));

    	/* Sort the ArrayList */
    	Collections.sort(circles);

    	/* print out the circles*/
    	for (Circle circle : circles)
		{
      		System.out.print(circle + " ");
      		System.out.println();
    	}
  	}
}
