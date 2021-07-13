package githubWeeks2Projects;

public class Q12_PyramidPattern {
	
	public static void main(String args[]) // main
	{
		for(int i=1 ; i<=5 ; i++) //loop1
		{
			for(int j=1 ; j<=i ;j++)//loop2 nested
			{
				System.out.print("*"); //printing symbole
			}
			System.out.println(""); //moving to new line after one loop ends
		}
	}
}
