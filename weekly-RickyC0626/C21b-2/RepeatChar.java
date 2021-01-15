import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Scanner;

public class RepeatChar
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a word, phrase, or sentence: ");
		String text = input.readLine();

		System.out.print("Enter the character you want to count: ");
		String text2 = sc.next();
		char l = text2.charAt(0);

		int count = 0;
		int pos = 0;
		count = findRepeatingChar(text, l, count, pos);
		System.out.printf("There are %d '%c' characters", count, l);
	}

	public static int findRepeatingChar(String text, char l, int count, int pos)
	{
		char[] array = text.toCharArray();

		// This is a more complex way to write the for loop below
		// It's also slower than using an enhanced for loop
		while(pos < array.length)
		{
			char c = array[pos];

			if(c == l) count++;
			pos++;
			findRepeatingChar(text, l, count, pos);
		}
		// for(char c : text.toCharArray())
		// {
		// 	if(c == l) count++;
		// }
		return count;
	}
}
