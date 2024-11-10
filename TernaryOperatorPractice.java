import java.lang.*;
import java.util.Scanner;
class TernaryOperatorPractice
{

	public static void main(String[] args)
	{
	
	int age=18;
	
	Scanner sc=new Scanner(System.in);
		
	System.out.println("Enter your age ");
	age=sc.nextInt();
	
	
	String vote=(age>18)?  "You can cast vote " : "You cannot cast vote";		//Shortcut Method for If-else conditions
	
	System.out.print(vote);


	}


}
