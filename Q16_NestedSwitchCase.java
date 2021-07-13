package githubWeeks2Projects;

public class Q16_NestedSwitchCase {
	
	public static void main(String args[])
	{
		int no1 = 4 ;
		
		switch(no1)
		{
		   case 1:
		   {
			  System.out.println("Number is : "+no1);
			  break;
		   }
		   case 2:
		   {
			   System.out.println("Your number is : "+no1);
			   break;
		   }
		   default:
		   {
			   switch(no1)
			   {
			      case 3:
			      {
				      System.out.println("Your number is :"+no1);
				      break;
			      }
			      case 4:
			      {
				      System.out.println("Your number is : "+no1);
				      break;
			      }
			   }
		   }
		}
	}
}
