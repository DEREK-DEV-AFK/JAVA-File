package githubWeeks2Projects;

public class Q8_LargerNoAmong3 {
	
	public static void main(String args[])
	{
		double no1 = -5.8 , no2 = 4.2 , no3 = 1.2;
		
		if(no1 > no2 && no1>no3)
		{
			System.out.println("Greater number is : "+no1);
		}
		else if(no2 > no1 && no2 > no3)
		{
			System.out.println("Greater number is : "+no2);
		}
		else
		{
			System.out.println("Greater number is : "+no3);
		}
	}
}
