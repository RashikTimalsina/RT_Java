import java.util.Scanner;
class SwitchCaseDefault2
{

	Scanner sc;
	public static void main(String[] args)
	{

	String name;
	
	Scanner sc=new Scanner(System.in);	

	System.out.println("Enter your name!!!");
	
	name=sc.nextLine();				//To read a string, we use nextLine();
				
	
			
	switch(name)
	{
	 case "Dog":

	System.out.println("Bark");
		
	break;


	 case "Cat":

	System.out.println("Meow");
		
	break;	

	
	 case "Rabbit":

	System.out.println("Growl");
		
	break;	

	
	 case "Goat":

	System.out.println("Meeeh");
		
	break;	

	
	
	default:
	System.out.println("Please choose from given names only!!!");
	
	

	}


	}	

}