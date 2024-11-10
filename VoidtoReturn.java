import java.lang.*;
class VoidtoReturn
{

	public static void main(String[] args)
	{

	String name=printName("Rashik");		//Making a call for the created method 
	System.out.println("My name is " +name);		//Using println stmt in the main method if returntype

	}

	private static String printName(String name)	//ReturnType
	{

	return name;
	
	}

}