import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class RemoveText
{
  	public static void main(String[] args)
	{
		try
		{
    		if(args.length != 3)
			{
				throw new MissingParameterException();
    		}

    		File sourceFile = new File(args[1]);
    		if(!sourceFile.exists())
			{
      			throw new SourceFileException();
    		}

    		File targetFile = new File(args[2]);
    		if(targetFile.exists())
			{
      			throw new TargetFileException();
    		}

			Scanner input = new Scanner(sourceFile);
			PrintWriter output = new PrintWriter(targetFile);

    		try
			{
      			while(input.hasNext())
				{
        			String s1 = input.nextLine();
        			String s2 = s1.replaceAll(args[0], "");
        			output.println(s2);
      			}
    		}
			finally
			{
				if(input != null)
					input.close();
				if(output != null)
					output.close();
			}
		}
		catch(MissingParameterException e)
		{
			System.out.println("Usage: java ReplaceText str sourceFile targetFile");
			System.exit(1);
		}
		catch(SourceFileException e)
		{
			System.out.println("Source file " + args[1] + " does not exist");
			System.exit(2);
		}
		catch(TargetFileException e)
		{
			System.out.println("Target file " + args[2] + " already exists");
			System.exit(3);
		}
		catch(FileNotFoundException e)
		{
			System.out.println("Files may be missing");
			System.exit(4);
		}
  	}
}
