import java.lang.*;
import java.util.Scanner;
class TernaryOperatorATM
{

	//int balance;
	int deposit;
	int credit;
	
	
	public static void main(String[] args)
	{
	
	Scanner sc=new Scanner(System.in);
	
	
	System.out.println("Enter the amount " );
		
	deposit=sc.nextInt();
	//balance=sc.nextInt();
	credit=sc.nextInt();
	
	String result=(deposit>credit)? "Profit" : "Loss";

	System.out.println(result);









	}




}