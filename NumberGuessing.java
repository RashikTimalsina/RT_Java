import java.util.Scanner;			//Using scanner import for user input i.e number he/she guesses
import java.util.Random;			//Using random import for computer to choose random number
	
class NumberGuessing
{

	public static void main(String[] args)
	{

	Scanner sc=new Scanner(System.in);		//Syntax for Scanner;	
	
	Random rn=new Random();			//Syntax for Random;

	int targetNumber=rn.nextInt(10);
	int attempts=0;
	int guess;
	
	System.out.println("Welcome to the Number Guessing Game ");
	System.out.println("I have choosen a number betweeen 1 to 10 ");
	System.out.println("Now, it's your turn to guess that number ");	

	do
	{

	
	System.out.println("Enter your guess number");
	guess=sc.nextInt();
	
	attempts++;

	
	if(guess<targetNumber)
	{

	System.out.println("Number not matched");

	}	
	
	else if(guess>targetNumber)
	{

	System.out.println("Number not matched");

	}
		
	else{


	System.out.println("Congratulations ! You guessed the correct number");

	}


	}while (guess!=targetNumber);	

	


	}


}