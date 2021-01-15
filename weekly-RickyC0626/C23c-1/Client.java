import java.util.ArrayList;
import java.util.Stack;

public class Client
{
// Option 1
	public static void main(String[] args)
	{
		// Create Integer Stack
		GenericStack<Integer> igs = new GenericStack<Integer>();
		ArrayList<Integer> alist = new ArrayList<Integer>();

		System.out.println("\nCreating Integer Stack from GenericStack...\n");
		igs.pushToStack(alist, 56);
		igs.pushToStack(alist, 38);
		igs.pushToStack(alist, 19);
		igs.lookInStack(alist);
		igs.searchStack(alist, 56);
		igs.searchStack(alist, 38);
		igs.searchStack(alist, 19);
		igs.popStack(alist);
		igs.lookInStack(alist);
		igs.searchStack(alist, 56);
		igs.searchStack(alist, 38);
		igs.searchStack(alist, 19);
		igs.popStack(alist);
		igs.lookInStack(alist);
		igs.searchStack(alist, 56);
		igs.searchStack(alist, 38);
		igs.searchStack(alist, 19);
		igs.popStack(alist);
		igs.searchStack(alist, 56);
		igs.searchStack(alist, 38);
		igs.searchStack(alist, 19);

		// Create Double Stack
		GenericStack<Double> dgs = new GenericStack<Double>();
		ArrayList<Double> dlist = new ArrayList<Double>();

		System.out.println("\nCreating Double Stack from GenericStack...\n");
		dgs.pushToStack(dlist, 56.74);
		dgs.pushToStack(dlist, 38.92);
		dgs.pushToStack(dlist, 19.26);
		dgs.lookInStack(dlist);
		dgs.searchStack(dlist, 56.74);
		dgs.searchStack(dlist, 38.92);
		dgs.searchStack(dlist, 19.26);
		dgs.popStack(dlist);
		dgs.lookInStack(dlist);
		dgs.searchStack(dlist, 56.74);
		dgs.searchStack(dlist, 38.92);
		dgs.searchStack(dlist, 19.26);
		dgs.popStack(dlist);
		dgs.lookInStack(dlist);
		dgs.searchStack(dlist, 56.74);
		dgs.searchStack(dlist, 38.92);
		dgs.searchStack(dlist, 19.26);
		dgs.popStack(dlist);
		dgs.searchStack(dlist, 56.74);
		dgs.searchStack(dlist, 38.92);
		dgs.searchStack(dlist, 19.26);
	}

// // Option 2
// 	public static void main(String[] args)
// 	{
// 		// Create Integer Stack
// 		GenericStack<Integer> igs = new GenericStack<Integer>();
// 		Stack<Integer> stack = new Stack<Integer>();
//
// 		System.out.println("\nCreating Integer Stack from GenericStack...\n");
// 		igs.stack_push(stack, 14);
// 		igs.stack_push(stack, 26);
// 		igs.stack_push(stack, 38);
// 		igs.stack_peek(stack);
// 		igs.stack_search(stack, 14);
// 		igs.stack_search(stack, 26);
// 		igs.stack_search(stack, 38);
// 		igs.stack_pop(stack);
// 		igs.stack_search(stack, 14);
// 		igs.stack_search(stack, 26);
// 		igs.stack_search(stack, 38);
// 		igs.stack_pop(stack);
// 		igs.stack_search(stack, 14);
// 		igs.stack_search(stack, 26);
// 		igs.stack_search(stack, 38);
// 		igs.stack_pop(stack);
// 		igs.stack_search(stack, 14);
// 		igs.stack_search(stack, 26);
// 		igs.stack_search(stack, 38);
//
// 		// Create Double Stack
// 		GenericStack<Double> dgs = new GenericStack<Double>();
// 		Stack<Double> doublestack = new Stack<Double>();
//
// 		System.out.println("\nCreating Double Stack from GenericStack...\n");
// 		dgs.stack_push(doublestack, 14.54);
// 		dgs.stack_push(doublestack, 26.34);
// 		dgs.stack_push(doublestack, 38.28);
// 		dgs.stack_peek(doublestack);
// 		dgs.stack_search(doublestack, 14.54);
// 		dgs.stack_search(doublestack, 26.34);
// 		dgs.stack_search(doublestack, 38.28);
// 		dgs.stack_pop(doublestack);
// 		dgs.stack_search(doublestack, 14.54);
// 		dgs.stack_search(doublestack, 26.34);
// 		dgs.stack_search(doublestack, 38.28);
// 		dgs.stack_pop(doublestack);
// 		dgs.stack_search(doublestack, 14.54);
// 		dgs.stack_search(doublestack, 26.34);
// 		dgs.stack_search(doublestack, 38.28);
// 		dgs.stack_pop(doublestack);
// 		dgs.stack_search(doublestack, 14.54);
// 		dgs.stack_search(doublestack, 26.34);
// 		dgs.stack_search(doublestack, 38.28);
// 	}
}
