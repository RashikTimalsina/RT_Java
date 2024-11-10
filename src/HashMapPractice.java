import java.util.HashMap;
class HashMapPractice
{

	public static void main(String[] args)
	{

	HashMap<String, String> capitalCities=new HashMap<String, String>();
	
	capitalCities.put("Nepal " , "Kathmandu");			//Nepal=Kathmandu;(key=value)
	capitalCities.put("India" ,"New Delhi");			//India=NewDelhi;
	capitalCities.put("China" , "Beijing");			//China=Beijing;
	capitalCities.put("Bangladesh ", "Dhaka");			//Bangladesh=Dhaka;
	
	System.out.println(capitalCities.size());
	System.out.println(capitalCities.get("China"));	
	System.out.println(capitalCities.remove("India"));
	System.out.println(capitalCities.clear());
	
	}

}