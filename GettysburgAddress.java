import java.io.File;
/**
 * Katelyn DePaula
 * AP Computer Science Period 7
 */
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
		double avWordLength = 0;
		Scanner file = new Scanner(new File("Gettsburg Address.txt"));
	
		while(file.hasNext())
		{
			String word = file.next();
			wordCount++;
			gettys.add(word);
		}
		
		String longWord = gettys.get(0);
		
		for(int i = 1; i < gettys.size(); i++)
		{
			String secWord = gettys.get(i);
			
			if(longWord.length() < secWord.length())
				{
				longWord = secWord;
				}
			
			String oneWord = gettys.get(i - 1);
			charCount += oneWord.length();
		}
		
		avWordLength = (double) charCount/wordCount;
		
//		for(String a: gettys)
//		{
//		System.out.println(a);
//		}
	
		System.out.println("The total number of characters is " + charCount);
		System.out.println("The total number of words is " + wordCount);
		System.out.println("The average word length is " + avWordLength);
		System.out.println("The longest word is " + longWord);
	}
}

