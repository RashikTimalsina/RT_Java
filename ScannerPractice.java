import java.lang.*;
import java.util.*;			//this is the collection of every Util method i.e Scanner,time,etc
class UserInput
{

	Scanner sc;			
	int length,breadth,area;

	public void Area()
	{	

	Scanner sc=new Scanner(System.in);		//Assigns Scanner to System Input	
	
	System.out.println("Enter the value of length");
	length=sc.nextInt();					//Addresses Operators

	System.out.println("Enter the value of breadth");
	 breadth=sc.nextInt();					//Addresses Operators

	area=length*breadth;

	System.out.println(area);
	}


}

class ScannerPractice
{

	public static void main(String[] args)
	{

	Area a=new Area();

	}

}
