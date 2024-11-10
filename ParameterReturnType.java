import java.lang.*;
class ParameterReturnType
{

	public static void main(String[] args)
	{

	int sum=add(10,10);
	System.out.println("the sum is "+sum);
	

	String fname="Rashik";
	String lname="Timalsina";
	String fullname =getFullname(fname,lname);
	System.out.println("My fullname is " + fname +" " +lname);

	}

	static int add(int x,int y)
	{
	
	return x+y;
		
	}

	static String getFullname(String fname,String lname)
	{

	return "Full name is "+fname+lname;

	}
	

}