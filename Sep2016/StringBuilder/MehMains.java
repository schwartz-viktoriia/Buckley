public class MehMains 
{
	public static void main(String []args)
	{
		StringBuilder mehStringBuilder = new StringBuilder();
		for(int i = 0; i < 1111; i++)
		{
			mehStringBuilder.append((char)(Math.random() * 94 + 33));
		}
		
		for(int i = 0; i < 1111; i += 100)
		{
			if(i >= 1100)
				System.out.println(mehStringBuilder.substring(1100, 1111));
			else
				System.out.println(mehStringBuilder.substring(i, i + 100));
		}
	}
}
