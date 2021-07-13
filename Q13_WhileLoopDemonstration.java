package githubWeeks2Projects;
import java.util.Scanner;

public class Q13_WhileLoopDemonstration {
	
	public static void main(String args[])
	{
		int number;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your a number below 10 : ");
		number = sc.nextInt();
		
		sc.close();
		
		while(number<10)
		{
			System.out.println("Accepted !!");
			System.out.println("Your number is : "+number);
			break;
		}
	}
}
