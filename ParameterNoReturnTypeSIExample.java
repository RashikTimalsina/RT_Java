class ParameterNoReturnTypeSIExample
{
	public static void main(String[] args)
	{

  	double interest=getSI(5000,2,10);
	System.out.println("My SI is " +interest);

	}

	static double getSI(int p, int t, int r)
	{

	return (p*t*r/100);

	}

}