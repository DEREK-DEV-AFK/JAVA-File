package githubWeeks2Projects;

public class Q4_TypeCasting {
	// don't run this program just type and understand how casting works
	public static void main(String args[])
	{
		byte b=10;
		
		int i=b; //will accept - automatic type promotion
		
		byte c=i; // will not accept - because lower type cannot be put in higher
		
		byte d=(byte)i; //type casting makes it possible to store compatible types
		
		byte x = 10;
		byte y = 20 ;
		
		byte multi = x * y ; // Error is thrown because when two bytes are used in a arthmetic operation, the result will be integer.
	}
}
