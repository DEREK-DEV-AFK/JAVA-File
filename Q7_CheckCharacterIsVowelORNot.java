package githubWeeks2Projects;

public class Q7_CheckCharacterIsVowelORNot {
	
	public static void main(String args[])//main 
	{
		char ch = 'a'; //declaring variable
		
		if(ch =='a' || ch =='e' || ch =='i' || ch =='o' || ch =='u' ) //condition to check weather the character is a vowel or not
		{
			System.out.println(ch +" is a Vowel"); //if the above condition is true then it will print this statment
		}
		else // if the condition does not matches then it will come in this block
		{
			System.out.println(ch +" it is not a Consonant"); //it will print this statement
		}
	}
}
