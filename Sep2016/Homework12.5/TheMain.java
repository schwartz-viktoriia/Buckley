import java.util.Scanner;

public class TheMain 
{
	public static void main(String []args)
	{
		Scanner sc = new Scanner(System.in);
		try
		{
			System.out.println("Please enter the side lengths");
			int s1 = sc.nextInt();
			int s2 = sc.nextInt();
			int s3 = sc.nextInt();
			NewTriangle t1 = new NewTriangle(s1, s2, s3);
		} catch(IllegalTriangleException e) {
			System.out.println("You didn't do it correctly");
		}
	}
}



