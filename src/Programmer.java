import java.lang.*;
class Employee
{  
 
	double salary=40000;  

}  

class Programmer extends Employee		//Example of Inheritance( IS A )
{  
	
	 int bonus=10000;  
 

	public static void main(String args[]){  
	   Programmer p=new Programmer();  
 
  	System.out.println("Programmer salary is:"+p.salary);  								  System.out.println("Bonus of Programmer is:"+p.bonus);  


	}  

}  