package githubWeeks2Projects;
import java.util.Scanner;

public class Q2_PrintUserInputNo {
	public static void main(String args[])// main class
	{
		int no ; // declaring
		Scanner sc = new Scanner(System.in); //creating object of scanner to take input from user
		System.out.println("Enter a number : "); // printing
		no = sc.nextInt();//taking input from user in no
		sc.close();
		
		System.out.println("The number you have enter is : "+no); // printing value that user has inputed
	}
	
}
