
class Human
{

	//Constructor= special method that is called when an object is instantiated(created)

	String name;
	int age;
	double weight;

	public  Human(String name, int age, double weight)
	{

	this.name=name;
	this.age=age;
	this.weight=weight;

	}	


}

class Constructor2
{

	public static void main(String[] args)
	{

	Human h=new Human("Rashik",19,52.45);

	System.out.println(h.name);
	System.out.println(h.age);
	System.out.println(h.weight);

	}

}
