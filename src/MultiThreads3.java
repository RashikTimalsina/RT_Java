import java.lang.*;
class Multithreading implements Runnable			//By Implementing
{
	
        int threadNumber;

       public Multithreading(int threadNumber)
      {

            this.threadNumber=threadNumber;
	

       }



         public void run()
         {

	for(int i=1;i<=5;i++)
	{
		System.out.println(i +" from thread " + threadNumber);
	
	try
	{

		Thread.sleep(1000);
		
	}
	
 	catch(Exception e)
	{
	}
	
      

                  }


         }


}


class MultiThreads3
{

	public static void main(String[] args)
	{

	for(int i=1;i<=5;i++)
	{

	Multithreading Thread=new Multithreading(i);
	
	Thread myThread=new Thread(Thread);
	myThread.start();

	}


	}

}