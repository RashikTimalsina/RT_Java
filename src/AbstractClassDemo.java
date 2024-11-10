import java.lang.*;
abstract class Bike
{  
  
	abstract void run();  		//no method body and abstract 

}  



class Honda extends Bike
{
  
	void run()
	{
	
	System.out.println("running safely");

	}  

}
class AbstractClassDemo
{
	
	public static void main(String args[]){  
	 Bike obj = new Honda();  

	 obj.run();  


	}  


}