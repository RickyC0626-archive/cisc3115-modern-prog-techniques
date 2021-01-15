import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Random;
import java.util.Scanner;

public class TestListStudent
{
	public static void main(String[] args)
	{
		TestListStudent test = new TestListStudent();

		final int size = 5;

		System.out.println("--------ArrayList--------");
		ArrayList<Student> studentArrayList = (ArrayList<Student>)test.makeRandomStudentList(new ArrayList<Student>(), size);
		test.printList(studentArrayList);

		test.updateRandomStudent(studentArrayList, "John", "Doe");

		System.out.println("-------------------------");
		test.printList(studentArrayList);

		System.out.println("--------LinkedList--------");
		LinkedList<Student> studentLinkedList = (LinkedList<Student>)test.makeRandomStudentList(new LinkedList<Student>(), size);
		test.printList(studentLinkedList);

		test.updateRandomStudent(studentLinkedList, "John", "Doe");
		System.out.println("-------------------------");
		test.printList(studentLinkedList);

		System.out.println("\n\n--------ReplaceNameArrayList--------");
		test.printList(studentArrayList);
		test.replaceFirstName(studentArrayList);
		test.printList(studentArrayList);

		System.out.println("\n\n--------ReplaceNameLinkedList--------");
		test.printList(studentLinkedList);
		test.replaceFirstName(studentLinkedList);
		test.printList(studentLinkedList);
	}

	private void updateRandomStudent(List<Student> list, String firstName, String lastName)
	{
		Random random = new Random();
		int index = random.nextInt(list.size());
		Student student = list.get(index);

		student.setFirstName(firstName);
		student.setLastName(lastName);
	}

	private List<Student> makeRandomStudentList(List<Student> list, int size)
	{
		Random random = new Random();

		for(int i = 0; i < size; i++)
		{
			String firstName = String.valueOf((char)('A' + random.nextInt(26)));
			String lastName = String.valueOf((char)('A' + random.nextInt(26)));
			double gpa = random.nextDouble() * 4.0;
			Student student = new Student(i, firstName, lastName, gpa);
			list.add(student);
		}
		return list;
	}

	private void printList(List<Student> list)
	{
		for(Student s : list)
		{
			System.out.println(s.toString());
		}
	}

	private void replaceFirstName(List<Student> list)
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("\n\n(1) Use Enhanced For Loop to Iterate");
		System.out.println("(2) Use For Loop to Iterate");
		System.out.println("(3) Use Iterator to Iterate");
		System.out.println("(4) Use ListIterator to Iterate");
		System.out.print("Pick a method of iteration: ");
		String choice = sc.next();

		switch(choice)
		{
			case "1": useEnhancedForLoopToIterate(list); break;
			case "2": useForLoopToIterate(list); break;
			case "3": useIteratorToIterate(list); break;
			case "4": useListIteratorToIterate(list); break;
			default: System.out.println("Not a valid choice."); break;
		}
	}

	private void useEnhancedForLoopToIterate(List<Student> list)
	{
		System.out.println("\n--------Enhanced For Loop Iteration--------");

		for(Student student : list)
		{
			if(student.getFirstName().equals("J"))
			{
				student.setFirstName("John");
			}
		}
	}

	private void useForLoopToIterate(List<Student> list)
	{
		System.out.println("\n--------For Loop Iteration--------");

		for(int i = 0; i < list.size(); i++)
		{
			Student student = list.get(i);

			if(student.getFirstName().equals("J"))
			{
				student.setFirstName("John");
			}
		}
	}

	private void useIteratorToIterate(List<Student> list)
	{
		System.out.println("\n--------Iterator to Iterate--------");

		Iterator<Student> iter = list.iterator();

		while(iter.hasNext())
		{
			Student student = iter.next();

			if(student.getFirstName().equals("J"))
			{
				student.setFirstName("John");
			}
		}
	}

	private void useListIteratorToIterate(List<Student> list)
	{
		System.out.println("\n--------ListIterator to Iterate--------");

		ListIterator<Student> iter = list.listIterator(list.size());

		while(iter.hasPrevious())
		{
			Student student = list.get(iter.previousIndex());

			if(student.getFirstName().equals("J"))
			{
				student.setFirstName("John");
			}
			iter.previous();
		}
	}
}
