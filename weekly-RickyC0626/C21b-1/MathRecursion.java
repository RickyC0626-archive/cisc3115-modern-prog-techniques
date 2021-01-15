import java.util.Scanner;

public class MathRecursion
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the max number you want to calculate: ");
	 	double input = sc.nextDouble();

		double sum = 0;

		sum = calculateFractionSum(sum, 1, input);
		System.out.printf("%.2f is the sum", sum);
	}

	// Calculating the sum using recursion is ridiculously slow, compared to using a for loop
	public static double calculateFractionSum(double sum, double i, double input)
	{
		// for(i = 1; i <= input; i++)
		// {
		// 	sum += 1/i;
		// }
		while(i <= input)
		{
			sum += 1/i;
			i++;
			calculateFractionSum(sum, i, input);
		}
		return sum;
	}
}
