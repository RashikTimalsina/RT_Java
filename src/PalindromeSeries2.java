import java.util.*;   
class PalindromeSeries2
{  
   
	public static void main(String args[])  
  	 {  
      
	String original="";
	String reverse = "";			 // Objects of String class  
	
	      Scanner sc = new Scanner(System.in);   
  
	    System.out.println("Enter a string/number to check if it is a palindrome");  
      
	original = sc.nextLine();   
      
	int length = original.length();   
      	
	for ( int i = length - 1; i >=0; i-- )  
	{
	
        	 reverse = reverse + original.charAt(i);
	
	}
  
 	     if (original.equals(reverse))  	
	{
	
        	 System.out.println("Entered string/number is a Palindrome.");  
      	
	}
	else
	{
  
      	   System.out.println("Entered string/number isn't a Palindrome.");   
	
	}


   }  


}  