import java.lang.*;
class Multithreading extends Thread
{

         public void run()
          {

              for(int i=1;i<=5;i++)			//ForLoop used
               {

		System.out.println(i);
		
		try
	  	{

		Thread.sleep(1000);			//1000 means 1 second interval
 
		}
		
		catch(Exception e)
		{

		}
	

                 }

            }
	
}


class MultiThreads
{

	public static void main(String [] args)
	{

	Multithreading myThread1=new Multithreading();		//myThread1 is the object we created
	Multithreading myThread2=new Multithreading();		//myThread2 is the object we created
	Multithreading myThread3=new Multithreading();		//myThread3 is the object we created

	myThread1.start(); 					//Start is used to run the Run Method
	myThread2.start();
	myThread3.start();
	
	}


}