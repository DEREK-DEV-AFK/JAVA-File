package githubWeeks2Projects;
import java.util.Scanner;

public class Q19_AreaOfTringle {

	public static void main(String args[]) //main
	{
		int width , height , area ; //declaring variable
		
		Scanner sc = new Scanner(System.in); //creating object of scanner to take user input
		
		System.out.println("Enetr width of triangle : ");
		width = sc.nextInt(); // taking value in width variable 
		
		System.out.println("Enter height of triangle : ");
		height = sc.nextInt(); // taking value in height variable 
		
		sc.close(); //closing object of 
		
		area=(width*height)/2; //formula of area of triangle
		
		System.out.println("Area of trinagle : "+area); // printing value of area
		
	}
}
