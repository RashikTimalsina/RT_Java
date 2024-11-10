import java.util.HashSet;
class HashSetPractice   

	public static void main(String[] args)
	{
		
	HashSet<String> colors=new HashSet<String>();  //HashSet is a collection of unique elements
	
	colors.add("Blue");			//add is a method to add elements in the collection
	colors.add("Yellow");
	colors.add("Red");
	colors.add("Black");
	
	colors.add("Blue");		//Even though Blue is written twice  it will print only once that's why it is called unique
	
	//System.out.println(colors);

	//System.out.println(colors.contains("Yellow"));	//this check whether it exists or not inside collection

	//colors.remove("Red");			//removes red color from the collection
	
	colors.clear();				//deletes all the elements from the collections
	
	System.out.println(colors);	

	
	}

}