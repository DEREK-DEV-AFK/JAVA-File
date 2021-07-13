package githubWeeks2Projects;
import java.util.Scanner;

public class Q17_AreaOfRectangle {

	public static void main(String args[]) //main 
	{
		int l , b , area ; //declaring variable 
		
		Scanner sc = new Scanner(System.in); //created object of scanner to take input from user
		
		System.out.println("Enter Length of Rectangle : "); 
		l = sc.nextInt(); //taking length value in l variable
		
		System.out.println("Enter Breath of Rectangle : ");
		b = sc.nextInt(); //taking breath value in b variable
		
		sc.close(); //closing scanner
		area = l * b; //formula of area of rectangle 
		System.out.println("Area of rectangle is : "+area); //printing value of area
		
	}
}
