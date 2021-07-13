package githubWeeks2Projects;
import java.util.Scanner;

public class Q20_AreaOfCircle {

	public static void main(String args[]) //main
	{
		double radius , area ; //declaring variable 
		
		Scanner sc = new Scanner (System.in); // creating object of scanner ot take input from user
		
		System.out.println("enter radius of circle : "); 
		radius = sc.nextDouble(); // taking value in radius 
		
		sc.close(); // closing object of scanner 
		
		area = Math.PI * (radius * radius); // formula of area of circle and taking pi value from inbuild package
		
		System.out.println("Area of circle is : "+area); // printing value of area
		
	}
}
