import java.util.Scanner;
class SwitchCaseDefault
{

	Scanner sc;
	public static void main(String[] args)
	{

	char grade;
	
	Scanner sc=new Scanner(System.in);	

	System.out.println("Enter your grade!!!");
	
	grade=sc.next().charAt(0);			//To read a char, we use next().charAt(0) unlike Integer,Double,etc
				
	 /*
	the number 0 in the function in CharAt(NUMBER) represents the index of the single word of the string taken input and set that index character to the char variable;	
	*/

	switch(grade)
	{
	 case 'A':

	System.out.println("Excellent");
		
	break;


	 case 'B':

	System.out.println("Very Good");
		
	break;	

	
	 case 'C':

	System.out.println("Good");
		
	break;	

	
	 case 'D':

	System.out.println("Unsatisfactory");
		
	break;	

	
	 case 'E':

	System.out.println("Just Passed");
		
	break;	


	 case 'F':

	System.out.println("You Failed");
		
	break;	

	
	default:
	System.out.println("Please use valid grade only!!!");
	
	

	}


	}	

}