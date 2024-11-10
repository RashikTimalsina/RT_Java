import java.lang.*;
class ImmutableString
{

	public static void main(String[] args)
	{


	String s="Rashik";			//Here s is reference variable declared by name"Rashik"
	
	s.concat("Alex");		//Adding a new name with the same ref var will print the same name linked with s variable

	
	System.out.println(s);		//This will print "Rashik" as Strings are immutable (unchangeable) objects


	}



}