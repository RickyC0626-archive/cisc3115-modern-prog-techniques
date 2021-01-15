import java.util.ArrayList;
import java.util.Stack;

public class GenericStack<T>
{
// Option 1
	// Push Element to top of stack
	public void pushToStack(ArrayList<T> alist, T variable)
	{
		System.out.println("Pushing " + variable + " to top of stack...");
		alist.add(variable);
	}

	// Pop Element from top of stack
	public void popStack(ArrayList<T> alist)
	{
		System.out.println("Popping top element of stack...");
		alist.remove(alist.size() - 1);
	}

	//Search Element in stack
	public void searchStack(ArrayList<T> alist, T element)
	{
		Integer position = alist.indexOf(element);

		if(position == -1) System.out.println("Element '" + element + "' not found.");
		else System.out.println("Element '" + element + "' found at position: " + position);
	}

	public void lookInStack(ArrayList<T> alist)
	{
		T element = alist.get(alist.size() - 1);

		System.out.println("Element on top of stack is: " + element);
	}

// // Option 2
// 	// Push Element to top of the Stack
// 	public void stack_push(Stack<T> stack, T variable)
// 	{
// 		System.out.println("Pushing " + variable + " to top of stack...");
// 		stack.push(variable);
// 	}
//
// 	// Pop Element from top of stack
// 	public void stack_pop(Stack<T> stack)
// 	{
// 		System.out.println("Popping top element of stack...");
// 		stack.pop();
// 	}
//
// 	// Search Element in stack
// 	public void stack_search(Stack<T> stack, T element)
// 	{
// 		Integer position = stack.search(element);
//
// 		if(position == -1) System.out.println("Element '" + element + "' not found.");
// 		else System.out.println("Element '" + element + "' found at position: " + position);
// 	}
//
// 	// Peek Element from top of stack
// 	public void stack_peek(Stack<T> stack)
// 	{
// 		T element = stack.peek();
//
// 		System.out.println("Element on top of stack is: " + element);
// 	}
}
