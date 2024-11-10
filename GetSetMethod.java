import java.lang.*;
class Person 
{

  public String name; 			// private = restricted access

			  
  public String getName()
 {

    return name;

  }


  public void setName(String newName)
 {

    this.name = newName;

  }

}

class GetSetMethod
{

	public static void main(String[] args)
	{

	Person myObj=new Person();		
	myObj.name("Rashik");

	System.out.println(myObj.name);		//ERROR will occur here
		

	}


}