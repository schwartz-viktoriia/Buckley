import java.util.InputMismatchException;
import java.util.Scanner;

public class TheMain 
{
	public static void main(String []args)
	{
		Scanner sc = new Scanner(System.in);
		boolean isDone = false;
		int num1;
		int num2;
		do
		{
			System.out.println("Please enter two integers");
			try
			{
				num1 = sc.nextInt();
				num2 = sc.nextInt();
				System.out.println(num1 + " + " + num2);
				isDone = true;
			} catch(InputMismatchException e){
				System.out.println("You didn't do it correctly");	
				sc.nextLine();
				
			}
		} while(!isDone);
		
		System.out.println("Congratz, you got it!");
	}
}
