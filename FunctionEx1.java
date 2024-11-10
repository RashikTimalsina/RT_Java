import java.lang.*;
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


class FunctionEx1
{
	public static void main(String[] args)
	{
		Employee e= new Employee();// creating an object using new keyword
		e.getDetails();// object/function_name()

		int ar=e.area(4,5);
		System.out.println("Area is "+ar);

		int vol=e.volume(3,4,5);
		System.out.println("Volume is "+vol);
	}
}