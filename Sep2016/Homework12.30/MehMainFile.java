import java.io.FileNotFoundException;

public class MehMainFile 
{
	public static void main(String []args) throws FileNotFoundException
	{
		
		java.util.Scanner inputSC = new java.util.Scanner(System.in);
		System.out.println("Please enter the name of the file you wish to search");
		String fileInput = inputSC.nextLine();
		java.io.File in = new java.io.File(fileInput);
		java.util.Scanner sc = new java.util.Scanner(in);
		
		int[] letters = new int[26];
		while(sc.hasNextLine())
		{
			String tempString =  sc.nextLine().toUpperCase();
			for(int j = 0; j < tempString.length(); j++)
			{
				if(tempString.charAt(j) >= 'A' && tempString.charAt(j) <= 'Z')
				{
					letters[tempString.charAt(j) - 'A'] += 1;
				}
			}
		}
		for(int i = 0; i < 26; i++)
		{
			System.out.println("Number of " + (char)('A' + i) + "'s: " + letters[i]);	
		}
		
		sc.close();
		inputSC.close();
	}
	
}
