import java.util.Scanner;

public class BubbleSort
{
	public static void main(String[] args)
	{
		// Create an Integer array
		Integer[] intArray =
		{Integer.valueOf(2), Integer.valueOf(4), Integer.valueOf(3)};

		// Create a Double array
		Double[] doubleArray =
		{Double.valueOf(3.4), Double.valueOf(1.3), Double.valueOf(-22.1)};

		// Create a Character array
		Character[] charArray =
		{Character.valueOf('a'), Character.valueOf('J'), Character.valueOf('r')};

		// Create a String array
		String[] stringArray =
		{"Tom", "John", "Fred"};

		// Sort the arrays
		bubbleSort(intArray, intArray.length);
		bubbleSort(doubleArray, doubleArray.length);
	    bubbleSort(charArray, charArray.length);
	    bubbleSort(stringArray, stringArray.length);

		// Display the sorted arrays
	    System.out.print("Sorted Integer objects: ");
	    printList(intArray);
	    System.out.print("Sorted Double objects: ");
	    printList(doubleArray);
	    System.out.print("Sorted Character objects: ");
	    printList(charArray);
	    System.out.print("Sorted String objects: ");
	    printList(stringArray);
	}

	public static void bubbleSort(Comparable[] list, int length)
	{
		// Base case
		if(length == 1) return;
		
		// Single iteration for sorting
		for(int i = 0; i < length - 1; i++)
		{
			if(list[i].compareTo(list[i + 1]) > 0)
			{
				Comparable temp = list[i];
				list[i] = list[i + 1];
				list[i + 1] = temp;
			}
		}
		// Largest element found, ignore it during next iteration
		bubbleSort(list, length - 1);
	}

	// Sort array of comparable objects using bubble sort algorithm
	public static void sort(Comparable[] list)
	{
		Comparable currentMin;
		int currentMinIndex;

		// Select subarray (range of array) where we bubble up the greatest in the subarray
		for(int i = 0; i < list.length - 1; i++)
		{
			// Bubble up the greatest in the subarray (in the range of the array)
			for(int j = 0; j < list.length - i - 1; j++)
			{
				if(list[j].compareTo(list[j + 1]) > 0)
				{
					Comparable temp = list[j];
					list[j] = list[j + 1];
					list[j + 1] = temp;
				}
			}
		}
	}

	// Print array of objects
	public static void printList(Object[] list)
	{
		for(int i = 0; i < list.length; i++)
		{
			System.out.print(list[i] + " ");
		}
		System.out.println();
	}
}
