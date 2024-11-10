import java.util.HashMap;
class HashMapPractice2
{

	public static void main(String[] args)
	{

	HashMap<String, Integer> showInfo=new HashMap<String, Integer>();
	
	showInfo.put("Ram " , 22);			//Ram=22;
	showInfo.put("Hari " , 19);			//Hari=19;
	showInfo.put("Astha ", 18);			//Astha=18;
	showInfo.put("Divya ", 20);			//Divya=20;
	
	
	
	System.out.println(showInfo.get("Ram"));
	
	}


}