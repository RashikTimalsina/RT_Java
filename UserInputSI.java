import java.util.Scanner;
class SI
{
       
       
	public double Interest(double p,int t,int r)		//(....) are parameters
	{

	return p*t*r/100;				//Return type

	}
						//Ultimately  this is ReturnParameterType

}


class UserInputSI
{

	public static void main(String[] args)
	{

	SI i=new SI();
	
	double p;
	int t,r;
	
	Scanner sc=new Scanner(System.in);

	System.out.println("Enter the value of 'p' ");
	 p=sc.nextDouble();

	System.out.println("Enter the value of 't' ");
	t=sc.nextInt();

	System.out.println("Enter the value of 'r' ");
	r=sc.nextInt();

	
	double calculation=i.Interest(p,t,r);
	System.out.println("Simple Interest is " +calculation);
		
	}

}