import java.lang.*;
class ReversedNumber
{

	public static void main(String[] args) {

	    int num = 1234, reversed = 0;
    
    	System.out.println("Original Number: " + num);

	 
	
   	 while(num != 0) 			   // run loop until num becomes 0
	{
	  
	int digit = num % 10;			// get last digit from num
      	reversed = reversed * 10 + digit;

	  	
      	num /= 10;			    // remove the last digit from num

	    }


	    System.out.println("Reversed Number: " + reversed);
  
	
	}


}