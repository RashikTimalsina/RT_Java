import java.util.HashMap;
class HashMapPractice5
{

	public static void main(String[] args)
	{
	
	HashMap<String, Integer> showInfo=new HashMap<String, Integer>();
	
	showInfo.put("Ram " , 22);			//Ram=22;
	showInfo.put("Hari " , 19);			//Hari=19;
	showInfo.put("Astha ", 18);			//Astha=18;
	showInfo.put("Divya ", 20);			//Divya=20;
	
	for(String i : showInfo.keySet())
	{

	System.out.println("key : "+i +" value : " +showInfo.get(i));

	}
	
	
	}

}