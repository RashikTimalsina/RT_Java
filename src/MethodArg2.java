import java.lang.*;
class MethodArg2
{
	public static void main(String[] args)	//this is main method which is public
	{
 	      String name="Rashik";                   //String=parameter        name=arguments
 	         int age=19;		        //int =parameter              age= arguments

                            hello(name,age);                             //( ) represents method and inside ( ) represents arguments	     

            	}
 
  	static void hello(String name,int age)      	
                  {
 
	System.out.println("Hello "+name);
	System.out.println("I am "+age);

                  }
 	  
		
}