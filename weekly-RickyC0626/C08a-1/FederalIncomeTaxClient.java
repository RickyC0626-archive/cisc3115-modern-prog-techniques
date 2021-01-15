import java.util.Scanner;

public class FederalIncomeTaxClient
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    FederalIncomeTax fit = new FederalIncomeTax();

    fit.displayPrompt();
    int status = input.nextInt();

    System.out.print("Enter the taxable income: ");
    double income = input.nextDouble();

    double tax = fit.getTax(status, income);
    System.out.println("Tax is " + tax);
  }
}
