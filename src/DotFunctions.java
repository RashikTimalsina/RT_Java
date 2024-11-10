
class DotFunctions
{


	public static void main(String[] args)
	{

                 //Indexing 	     012345678
	String name="rashik ts";


	System.out.println(name.length());
		
	System.out.println(name.toLowerCase());

	System.out.println(name.toUpperCase());

	System.out.println(name.trim());		

	//System.out.println(name.Substring(int 0));

	//System.out.println(name.Substring(int start,int end));	

	System.out.println(name.replace('s','p'));			//replaces r with a

	System.out.println(name.startsWith("ra"));			//true
		
	System.out.println(name.endsWith("iK"));			//false

	System.out.println(name.charAt(2));

	System.out.println(name.indexOf("s"));

	System.out.println(name.indexOf("s",2));

	System.out.println(name.lastIndexOf("r"));

	System.out.println(name.lastIndexOf("r",0));

	System.out.println(name.equals("rashik ts"));			//if it is matched 

	System.out.println(name.equalsIgnoreCase("RaShik Ts"));		//it shouldbe matched but may not be case sensitive
	
	}



}