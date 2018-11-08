import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class GettysburgAddress 
{

	public static void main(String[] args) throws FileNotFoundException 
	{
		ArrayList<String> gettys = new ArrayList<String>();
		int currentSize = 0;
		int charCount = 0;
		int wordCount = 0;
		String longestWord;
		Scanner file = new Scanner(new File("Gettsburg Address.txt"));
		while(file.hasNext())
		{
			String word = file.next();
		if(!word.equals("!") && !word.equals(".") && !word.equals(",") && !word.equals("-"))
			{
				wordCount++;
				gettys.add(word);
				currentSize++;
			}
		
		for(int i = 0; i<currentSize; i++)
		{
			longestWord = gettys.get(i);
			String secWord = gettys.get(i + 1);
			if(secWord.length() > longestWord.length())
			{
				secWord = longestWord;
			}
		}
		}
		
	System.out.println(longestWord);
}
}
