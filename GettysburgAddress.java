import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class GettysburgAddress 
{

	public static void main(String[] args) throws FileNotFoundException 
	{
		ArrayList<String> gettys = new ArrayList<String>();
		int charCount = 0;
		int wordCount = 0;
		String longWord;
		Scanner file = new Scanner(new File("Gettsburg Address.txt"));
		while(file.hasNext())
		{
			String word = file.next();
			wordCount++;
			gettys.add(word);
			}
		
		for(int i = 0; i< gettys.size() + 1; i++)
		{
			longWord = gettys.get(i);
			if(gettys.get(i) > gettys.get(i + 1))
				{
				longWord = gettys.get(i - 1);
				}
			String secWord = gettys.get(i);
			if(secWord.length() > longestWord.length())
			{
				secWord = longestWord;
			}
		}
		
	for(String a: gettys)
	{
	System.out.print(a);
	}
}
}

