import java.lang.*;
class Multithreading extends Thread
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


class MultiThreads2
{

	public static void main(String[] args)
	{

	for(int i=1;i<=5;i++)
	{

	Multithreading myThread1=new Multithreading(i);
	myThread1.start();

	}


	}

}