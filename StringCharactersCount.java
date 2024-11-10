import java.lang.*;
class StringCharactersCount
{

	public static void main(String[] args)
	{

	String str="Java is fun";
	int count=0;

	for(int i=0;i<str.length();i++)			 //Counts each character except space    
	{
	
	if(str.charAt(i)!=' ')
	count++;

	

	}

	
	 //Displays the total number of characters present in the given string  

	System.out.println("The Total number of characters present in a text is : " +count);		
	 
	}

}