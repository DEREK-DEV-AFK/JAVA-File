package githubWeeks2Projects;
import java.util.Scanner;

public class Q10_EvenOddCheck {
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int no ;
		
		System.out.println("Enter number :");
		no = sc.nextInt();
		
		sc.close();
		
		if(no%2 == 0)
		{
			System.out.println(no+" is a even number");
		}
		else
		{
			System.out.println(no +" is a odd number");
		}
		
		
	}
}
