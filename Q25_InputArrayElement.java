package githubWeeks2Projects;
import java.util.Scanner;
public class Q25_InputArrayElement {
	public static void maiin(String args[])
	{
		Scanner scanner = new Scanner(System.in);
		 int[] array = new int[10];
		 int sum = 0;
		 System.out.println("Enter the elements:");
		 for (int i=0; i<10; i++)
		 {
		 array[i] = scanner.nextInt();
		 }
		 scanner.close();
		 for( int num : array) {
		 sum = sum+num;
		 }
		 System.out.println("Sum of array elements is:"+sum);
	}
}
