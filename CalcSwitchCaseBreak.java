import java.util.Scanner;
class CalcSwitchCaseBreak
{

	public static void main(String[] args)
	{

	Scanner sc=new Scanner(System.in);

	System.out.println("Enter value of a ");
	int a=sc.nextInt();
	
	System.out.println("Enter value of b ");
	int b=sc.nextInt();

	System.out.println("Select :\n1 for Addition \n2 for Subtraction \n3 for Multiplication \n4 for Division \n5 for Modulo ");

	int operator=sc.nextInt();
	
	switch(operator)	
	{

	case 1:			//1 for Addition
	
	System.out.println(a+b);
	break;

	case 2:			//2 for Subtraction
	
	System.out.println(a-b);
	break;
	
	
	case 3:			//3 for Multiplication
	
	System.out.println(a*b);
	break;

	case 4:			//4 for Division
	
	System.out.println(a/b);
	break;
	
	case 5:			//5 for Modulo
	
	System.out.println(a%b);
	break;


	default:
	
	System.out.println("Invalid number");
	
	}


	}

}