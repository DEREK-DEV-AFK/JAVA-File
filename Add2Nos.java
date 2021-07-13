package githubWeeks2Projects;
import java.util.Scanner; // importing  Scanner to take input from user.
public class Add2Nos {
	public static void main(String args[]) //main class
	{
		int no1,no2,sum=0;  //declaring
		Scanner sc = new Scanner(System.in); // creating obj for scanner to take input from user and save it object. 
		System.out.println("Enter First number : ");
		no1 = sc.nextInt(); //taking 1st number fro user
		System.out.println("Enter Second number :");
		no2 = sc.nextInt(); //taking 2nd number from user.
		sc.close();
		sum = no1 + no2 ; //adding both numbers.
		System.out.println("Sum of "+no1+" and "+no2+" is "+sum); // printing values.
	}
}
