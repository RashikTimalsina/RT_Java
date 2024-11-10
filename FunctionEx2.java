import java.lang.*;
import java.util.Scanner;
class Employee
{
	public void getDetails()
	{
		System.out.println("Hello");
	}
	public int area(int l,int b)
	{
	return l*b;
	}
	public int volume(int l,int b,int h)
	{
	return l*b*h;
	}

}
class FunctionEx2
{
	public static void main(String[] args)
	{
		Employee e= new Employee();
		e.getDetails();
		int x,y,z;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value of x");
		x=sc.nextInt();
		System.out.println("Enter value of y");
		y=sc.nextInt();
                                   System.out.println("Enter value of z");
		z=sc.nextInt();
                                  	
		int ar=e.area(x,y);
			System.out.println("Area is "+ar);
		int vol=e.volume(x,y,z);
		System.out.println("Volume is "+vol);
	}
}