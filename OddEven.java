import java.util.Scanner;
class OddEven
{

	public static void main(String[] args)
	{

	int num;	

	Scanner sc=new Scanner(System.in);	


	System.out.println("Enter the number");
		
	num=sc.nextInt();
	
	if(num%2==0)			//Remainder when a number is divided by 2 should be equal to 0 then it is even
	{

	System.out.println("Even");
	
	}
	
	else{

	System.out.println("Odd");

	}


	}


}