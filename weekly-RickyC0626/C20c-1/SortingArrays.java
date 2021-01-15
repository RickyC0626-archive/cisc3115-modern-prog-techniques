import java.util.ArrayList;
import java.util.Collections;

public class SortingArrays
{
  public static void main(String[] args)
  {
    // Create an Integer ArrayList
	ArrayList<Integer> intArrayList = new ArrayList<Integer>();
	intArrayList.add(2);
	intArrayList.add(4);
	intArrayList.add(3);

    // Create a Double ArrayList
	ArrayList<Double> doubleArrayList = new ArrayList<Double>();
	doubleArrayList.add(3.4);
	doubleArrayList.add(1.3);
	doubleArrayList.add(-22.1);

    // Create a Character ArrayList
	ArrayList<Character> charArrayList = new ArrayList<Character>();
	charArrayList.add('a');
	charArrayList.add('j');
	charArrayList.add('r');

    // Create a String ArrayList
	ArrayList<String> stringArrayList = new ArrayList<String>();
	stringArrayList.add("Tom");
	stringArrayList.add("John");
	stringArrayList.add("Fred");

    // Sort the arraylists
    Collections.sort(intArrayList);
    Collections.sort(doubleArrayList);
    Collections.sort(charArrayList);
    Collections.sort(stringArrayList);

    // Display the sorted arraylists
    System.out.print("Sorted Integer objects: ");
    printList(intArrayList);
    System.out.print("Sorted Double objects: ");
    printList(doubleArrayList);
    System.out.print("Sorted Character objects: ");
    printList(charArrayList);
    System.out.print("Sorted String objects: ");
    printList(stringArrayList);
  }

  /** Print an arraylist of objects */
  public static void printList(ArrayList list)
  {
    for (int i = 0; i < list.size(); i++) System.out.print(list.get(i) + " ");
    System.out.println();
  }
}
