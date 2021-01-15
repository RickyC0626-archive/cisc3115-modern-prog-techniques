public class Client
{
// Option 1
	public static void main(String[] args)
	{
		// Create Integer Stack
		GenericStack<Integer> igs = new GenericStack<Integer>();
		Integer[] intarray = new Integer[1];

		System.out.println("\nCreating Integer Stack from GenericStack...\n");
		intarray = igs.pushToStack(intarray, 56);
		intarray = igs.pushToStack(intarray, 38);
		intarray = igs.pushToStack(intarray, 19);
		igs.lookInStack(intarray);
		igs.searchStack(intarray, 56);
		igs.searchStack(intarray, 38);
		igs.searchStack(intarray, 19);
		intarray = igs.popStack(intarray);
		igs.lookInStack(intarray);
		igs.searchStack(intarray, 56);
		igs.searchStack(intarray, 38);
		igs.searchStack(intarray, 19);
		intarray = igs.popStack(intarray);
		igs.lookInStack(intarray);
		igs.searchStack(intarray, 56);
		igs.searchStack(intarray, 38);
		igs.searchStack(intarray, 19);
		intarray = igs.popStack(intarray);
		igs.lookInStack(intarray);
		igs.searchStack(intarray, 56);
		igs.searchStack(intarray, 38);
		igs.searchStack(intarray, 19);

		// Create Double Stack
		GenericStack<Double> dgs = new GenericStack<Double>();
		Double[] doublearray = new Double[1];

		System.out.println("\nCreating Double Stack from GenericStack...\n");
		doublearray = dgs.pushToStack(doublearray, 56.74);
		doublearray = dgs.pushToStack(doublearray, 38.92);
		doublearray = dgs.pushToStack(doublearray, 19.26);
		dgs.lookInStack(doublearray);
		dgs.searchStack(doublearray, 56.74);
		dgs.searchStack(doublearray, 38.92);
		dgs.searchStack(doublearray, 19.26);
		doublearray = dgs.popStack(doublearray);
		dgs.lookInStack(doublearray);
		dgs.searchStack(doublearray, 56.74);
		dgs.searchStack(doublearray, 38.92);
		dgs.searchStack(doublearray, 19.26);
		doublearray = dgs.popStack(doublearray);
		dgs.lookInStack(doublearray);
		dgs.searchStack(doublearray, 56.74);
		dgs.searchStack(doublearray, 38.92);
		dgs.searchStack(doublearray, 19.26);
		doublearray = dgs.popStack(doublearray);
		dgs.lookInStack(doublearray);
		dgs.searchStack(doublearray, 56.74);
		dgs.searchStack(doublearray, 38.92);
		dgs.searchStack(doublearray, 19.26);
	}
}
