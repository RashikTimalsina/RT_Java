
class Human
{

	String name;
	int age;
	double height;

	public Human(String name, int age,double height)		//Parameter+ReturnType
	{

	this.name=name;			
	this.age=age;
	this.height=height;

	}

	
	public void eat()					//NoParameter+NoReturnType
	{

	System.out.println(this.name + " is eating");	
	
	}

	public void drink()
	{

	System.out.println(this.name + " is drinking");

	}	
	
}

class Constructors4
{

	public static void main(String[] args)	
	{

	Human human1=new Human("Rashik",19,5.8);
	Human human2=new Human("Shyam",18,5.5);
	
	System.out.println(human1.name+" "+human1.age+" "+human1.height);
	System.out.println(human2.name+" "+human2.age+" "+human2.height);	
	
	human1.drink();		
	human2.eat();
	
	}


}