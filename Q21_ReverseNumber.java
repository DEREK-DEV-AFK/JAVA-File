package githubWeeks2Projects;
import java.util.Scanner;

public class Q21_ReverseNumber {

	public static void main(String args[])//main
	{
		int no , reverseno = 0 , temp ; //declaring variable
		
		Scanner sc = new Scanner(System.in); // creating object of scanner to take input from user
		
		System.out.println("Enter number : ");
		no = sc.nextInt(); // taking value in no 
		temp = no; // stroring no value in temp
		
		sc.close(); //clsing scanner to avoid data leaks
		
		while( no != 0 ) // taking while loop and algorithm to reverse a number 
		{
		    reverseno = reverseno  *  10;
		    reverseno = reverseno + no % 10;
		    no = no / 10;
		} 
		
		System.out.println("Reverse of "+temp+" is "+reverseno); // printing reverse number
	}
}
