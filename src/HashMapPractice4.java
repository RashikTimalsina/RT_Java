import java.util.HashMap;
class HashMapPractice4
{
	public static void main(String[] args)
	{
	
	HashMap<String, String> capitalCities =new HashMap<String, String>();
	
	capitalCities.put("Nepal " , "Kathmandu");			//Nepal=Kathmandu;(key=value)
	capitalCities.put("India" ,"New Delhi");			//India=NewDelhi;
	capitalCities.put("China" , "Beijing");			//China=Beijing;
	capitalCities.put("Bangladesh ", "Dhaka");	
	
	for(String i : capitalCities.values())		//will display all the values 
	{

	System.out.println(i);

	}


	}



}