import java.lang.*;
import java.util.Random;
class RandomNumberGenerate3
{

	public static void main(String args[])   
	{   

	Random random = new Random();   		// Creating an object of Random class   



	int x = random.nextInt(50);   			// Generates random integers 0 to 49  


	

	int y = random.nextInt(1000);   			// Generates random integers 0 to 999  

	
	

	System.out.println("Randomly Generated Integers Values");  	// Prints random integer values  

	System.out.println(x);   
	System.out.println(y);   
	System.out.println();
	

	 

	double a = random.nextDouble();   		// Generates Random doubles values 
	double b = random.nextDouble();   

	
	

	System.out.println("Randomly Generated Double Values");  	// Prints random double values  

	System.out.println(a);   
	System.out.println(b);    
	System.out.println();


	
	
	float f=random.nextFloat();  				// Generates Random float values  
	float i=random.nextFloat();  

	
	

	System.out.println("Randomly Generated Float Values");  	// Prints random float values  
	
	System.out.println(f);   
	System.out.println(i);   
	System.out.println();


	

	long p = random.nextLong();   				// Generates Random Long values  
	long q = random.nextLong();   



	System.out.println("Randomly Generated Long Values");  	// Prints random long values  
	
	
	System.out.println(p);   
	System.out.println(q);    
	System.out.println();


	
	
	boolean m=random.nextBoolean();  	// Generates Random boolean values  
	boolean n=random.nextBoolean();  

	

	System.out.println("Randomly Generated Boolean Values");  	// Prints random boolean values  
	
	System.out.println(m);   
	System.out.println(n);   
   	System.out.println();

	}  

	
}