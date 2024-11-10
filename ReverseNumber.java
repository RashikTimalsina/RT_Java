import java.lang.*;
class ReverseName

	public static void main(String[] args)
	{

	String name="RASHIK";
	String reversed=0;
	
	System.out.println("Original name : " +name);

	while(name!=0)
	{

	String letters=name % 10;
	
	reversed=reversed*10 + letters;
	
	name /=10;

	}
		
		System.out.println("Reversed name :" +reversed);
	

	}

	


}