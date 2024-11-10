import java.lang.*;
class Momo
{

	//Overloaded Constructors = multiple constructors within a class with the same name
	//			but have different parameters
	//			name+parameters=signature

	
	String flour;		//Declaration outside a class
	String veggy;
	String meat;
	String spices;	


	public Momo(String flour,String veggy,String meat, String spices)		//Contains all four types
	{

	this.flour=flour;
	this.veggy=veggy;
	this.meat=meat;
	this.spices=spices;

	}

	
	public Momo(String flour,String veggy,String meat)	    //Notice that String spices parameter is removed here	
	{

	this.flour=flour;
	this.veggy=veggy;
	this.meat=meat;
	
	}

	
	public Momo(String flour,String veggy)	         //Notice that Meat and Spices parameters are removed here	
	{

	this.flour=flour;
	this.veggy=veggy;
	

	}


	public Momo(String flour)	         //Notice that Veggy , Meat and Spices parameters are removed here	
	{

	this.flour=flour;
	
	
	}


	public Momo()	 //Notice that all four types: Wheat, Veggy, Meat and Spices parameters are removed here	
	{
	
	
	}

}


class OverloadedConstructors1
{

	public static void main(String[] args)
	{

	//Note that you cannot print all of the four statements at once as they are executed one by one !!!

	//Momo momo=new Momo("Wheat","Cabbage", "Buff");	//Spicestype removed 
	//Momo momo=new Momo("Wheat","Cabbage");		// Spicetype and Meattype removed
	//Momo momo=new Momo("Wheat");			//Veggytype,Spicetype&Meatype removed
	Momo momo=new Momo();
	
	

	System.out.println("Here are the ingredients of your momo : ");

	System.out.println(momo.flour);			//And finally this will also print as 'null' 	
	System.out.println(momo.veggy);		//Also this will print Veggytype as 'null;
	System.out.println(momo.meat);			//However this will also print Meattype as 'null'
	System.out.println(momo.spices);		//Therfore this will print Spicestype as 'null'

	}


}