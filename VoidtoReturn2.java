import java.lang.*;
class VoidtoReturn2
{

	public static void main(String[] args)
	{

	String name=printName("Rashik",19);		//Making a call for the created method 
	System.out.println("My name is " +name);		//Using println stmt in the main method if returntype
	System.out.println("My age is " +name);
	
	}

	private static String printName(String name,int age)	//ReturnType
	{

	return name;
	
	}

}