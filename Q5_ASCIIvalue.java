package githubWeeks2Projects;

public class Q5_ASCIIvalue {
	public static void main(String args[]) // main class
	{
		char ch = 'A'; //declaring values
		int ascii = ch; //declaring values
		
		int castASCII = (int)ch; //you can also cast char to int
		
		System.out.println("The ASCII of " + ch + " is: " +ascii); //print values in console
		System.out.println("The ASCII value of " + ch + " is: " +castASCII); //print values in console
	}
}
