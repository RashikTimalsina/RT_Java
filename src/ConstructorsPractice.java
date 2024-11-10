
class Mom
{

	private String name;							// Field

	public Mom(String name)							// Constructor
	{

	this.name=name;								// Field	


	}	


	public void print()						// Method
	{	


	System.out.println(name);					// Field

	}
	
}


class ConstructorsPractice
{

	public static void main(String[] args)
	{

	Mom myMom=new Mom("Devaki Timalsina");				// Constructor
	myMom.print();

	}


}