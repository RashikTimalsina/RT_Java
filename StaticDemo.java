import java.lang.*;
class Employee
{
	int eid;
	double salary;
	String ceo;
		
	static void show()			//Using static means it will make data unchanged given down
	{

	System.out.println(eid  +" : " +salary +" : " +ceo);
	

	}


}

class StaticDemo
{
	
	public static void main(String[] args)
	{

	Employee Hari=new Employee();		//Hari is object
	Hari.eid=1;
	Hari.salary=50000;
	Hari.ceo="Mohan";

	Employee Shyam=new Employee();		//Shyam is object
	Shyam.eid=2;
	Shyam.salary=40000;
	Shyam.ceo="Rahul";

	Employee Gopal=new Employee();		//Gopal is object
	Gopal.eid=3;
	Gopal.salary=45000;
	Gopal.ceo="Mukesh";

	Gopal.ceo="Ram";				//This is printed by default when static is not used in up


	Hari.show();				//Calling the show() Method
	Shyam.show();
	Gopal.show();

	}



}
