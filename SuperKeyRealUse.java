import java.lang.*;
class Person					//Parent class
{

	int id;					//declared datatypes here
	String name;

	Person(int id,String name)
	{

	this.id=id;
	this.name=name;	
	
	}



}

class Employee extends Person					//Child class
{

	double salary;					//added datatype declared here

	Employee(int id,String name,double salary)
	{

	super(id, name);			//Reuse the Parent constructor where it must be the first statement always 
				
	this.salary=salary;
	
	}

	void display()			//creating a method to call in the main method given below		
	{

	System.out.println(id + " "+name+" "+salary);
	
	}

}

class SuperKeyRealUse
{

	public static void main(String[] args)
	{

	Employee e= new Employee(100,"Raj",50000);		//Adding the value of parameters also known as arguments
	
	e.display();					//Calling the display method 


	}


}

