import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;


public class TextFileProcessor {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String inputFile = args[0];
		String outputFile = args[1];
		String fieldName = args[2];
		String lineWithNumbers = null;
		FileReader fr = null;
		BufferedReader br = null;
		String line = null;
		int outputNumber = 0;
		try {
			fr = new FileReader(inputFile);
			br = new BufferedReader(fr);
			while((line = br.readLine())!=null)
			{
				if(hasNumbers(line))
				{
					outputNumber = pullOutNumber(line);
					break;
				}
			}
			PrintWriter out = new PrintWriter(outputFile);
			out.println("--check-column");
			out.println(fieldName);
			out.println("--last-value");
			out.println(outputNumber);
			br.close();
			fr.close();
			out.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	private static boolean hasNumbers(String input)
	{
		String numbers = "0123456789";
		boolean hasNumbers = false;
		for(int counter = 0 ; counter < input.length() ; counter++)
		{
			String c = input.charAt(counter)+"";
			if(numbers.contains(c))
			{
				hasNumbers = true;
				return hasNumbers;
			}
		}
		return hasNumbers;
	}
	private static int pullOutNumber(String line)
	{
		int number = 0;
		String numbers = "0123456789";
		String numberString = "";
		for(int counter = 0 ; counter < line.length() ; counter++)
		{
			String c = line.charAt(counter)+"";
			if(numbers.contains(c))
			{
				numberString+=c;
			}
		}
		Integer thisInt = new Integer(numberString);
		number = thisInt.intValue();
		return number;
	}
}
