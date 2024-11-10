import java.util.ArrayList;
class ArrayListPractice3
{

	public static void main(String[] args)
	{

	ArrayList<String> bike=new ArrayList<String>();
	
	bike.add("Honda");
	bike.add("Yamaha"); 
	bike.add("Pulsar");
	bike.add("Apache");
	

	bike.remove(1);

	bike.set(0, "Duke");

	
	
	System.out.println(bike);	
	
	}



}