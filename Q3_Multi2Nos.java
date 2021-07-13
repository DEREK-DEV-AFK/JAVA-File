package githubWeeks2Projects;
import java.util.Scanner;
public class Q3_Multi2Nos {
	public static void main(String args[]) //main class
	{
		int no1,no2,mul; //declaring values
		
		Scanner sc = new Scanner(System.in); // creating scanner object to take input from user
		
		System.out.println("Enter first no :"); //printing text in console
		no1 = sc.nextInt(); // taking input from user in variable no1
		
		System.out.println("Enter Second number : "); //printing text in console
		no2 = sc.nextInt(); // taking input from user in variable no2
		
		sc.close();
		
		mul = no1 * no2 ; //multiplying two numbers
		
		System.out.println("Multiplication of "+no1+" and "+no2+" is "+mul); //printing values in console 
	}
}
