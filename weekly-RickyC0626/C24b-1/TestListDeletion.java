import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class TestListDeletion
{
	public static void main(String[] args)
	{
		TestListDeletion test = new TestListDeletion();

		final int size = 10000;
		final int max = 1000000;
		final int maxInsertions = 10000;

		ArrayList<Integer> a = new ArrayList<Integer>();
		test.makeRandomList(a, size, max);

		LinkedList<Integer> l = new LinkedList<Integer>();
		test.makeRandomList(l, size, max);

		test.testInsertion(a, maxInsertions);
		test.testInsertion(l, maxInsertions);
		test.testDeletion(a);
		test.testDeletion(l);
	}

	private <T> void testInsertion(List<T> list, int maxInsertions)
	{
		Random r = new Random();
		T t = list.get(0);

		long startTime = System.nanoTime();

		for(int i = 0; i < maxInsertions; i++)
		{
			list.add(0, t);
		}

		long endTime = System.nanoTime();

		System.out.println("Time to insert " + maxInsertions +
	      " elements randomly to " + list.getClass().getName() + ": " + (endTime - startTime));
	}

	private <T> void testDeletion(List<T> list)
	{
		Random r = new Random();
		T t = list.get(0);

		long startTime = System.nanoTime();

		for(int i = 0; i < list.size(); i++)
		{
			list.remove(t);
		}

		long endTime = System.nanoTime();

		System.out.println("Time to delete " + list.size() +
	      " elements randomly from " + list.getClass().getName() + ": " + (endTime - startTime));
	}

	private List<Integer> makeRandomList(List<Integer> list, int size, int max)
	{
		Random r = new Random();

		for(int i = 0; i < size; i++)
		{
			list.add(r.nextInt(max));
		}
		return list;
	}

	/*
	Inserting elements to ArrayList takes more time than LinkedList
	Deleting elements from ArrayList takes more time than LinkedList
	*/
}
