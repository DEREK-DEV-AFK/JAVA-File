package githubWeeks2Projects;
import java.util.Scanner;
public class Q18_AreaOfSquare {

	public static void main(String args[])
	{
		int side , area ;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Side of Square : ");
		side = sc.nextInt();
		
		sc.close();
		area = side * side ;
		
		System.out.println("Area of square is : "+area);
	}
}
