package githubWeeks2Projects;
import java.util.Scanner;

public class Q14_DoWhileDemonstration {

	public static void main(String args[])
	{
		int no ;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number  : ");
		no = sc.nextInt();
		
		sc.close();
		
		do {
			System.out.println(" your number is : "+no);
			no ++;
		}
		while(no<10);
	}
}
