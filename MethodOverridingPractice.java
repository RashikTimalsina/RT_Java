import java.lang.*;
class Bank						//Parent Class
{

	int getInterest()
	{

	return 0;

	}


}

class NRB extends Bank				//Child Class
{

	int getInterest()
	{

	return 5;

	}


}

class NICAsia extends Bank 				//Child Class
{

	int getInterest()
	{

	return 8;

	}

}

class Sunrise extends Bank				//Child Class
{

	int getInterest()
	{
	
	return 10;

	}


}

class MethodOverridingPractice				//Main Method Class
{


	public static void main(String[] args)
	{

	NRB r=new NRB();				//Creating objects 
	NICAsia c=new NICAsia();
	Sunrise s=new Sunrise();


	System.out.println("Rate of Interest for Nepal Rastriya Bank : " +r.getInterest());		//Calling methods
	System.out.println("Rate of Interest for NIC Asia Bank : " +c.getInterest());
	System.out.println("Rate of Interest for Sunrise Bank : " +s.getInterest());

	}



}


