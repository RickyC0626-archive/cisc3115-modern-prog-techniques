import java.util.Arrays;
import java.util.Stack;

public class GenericStack<T>
{
// Option 1
	// Push Element to top of stack
	public T[] pushToStack(T[] array, T variable)
	{
		System.out.println("Pushing " + variable + " to top of stack...");

		array = Arrays.copyOf(array, array.length + 1);
		array[array.length - 1] = variable;
		return array;
	}

	// Pop Element from top of stack
	public T[] popStack(T[] array)
	{
		System.out.println("Popping top element of stack...");

		array = Arrays.copyOf(array, array.length - 1);
		return array;
	}

	//Search Element in stack
	public void searchStack(T[] array, T element)
	{
		Integer position = Arrays.asList(array).indexOf(element);

		if(position == -1) System.out.println("Element '" + element + "' not found.");
		else System.out.println("Element '" + element + "' found at position: " + position);
	}

	public void lookInStack(T[] array)
	{
		T element = array[array.length - 1];

		System.out.println("Element on top of stack is: " + element);
	}
}
