class Employee
{

	public int baseSalary;			//baseSalary and hurlyRate are taken fixed for each year unlike extraHours
	public int hourlyRate;
	 

	public int calculateWage(int extraHours)	{

		return baseSalary +(extraHours*hourlyRate);
	
	}
	


}

class ObjectOrientedExample
{

	public static void main(String[]args)	{
	
	Employee employee=new Employee();
	employee.baseSalary=50000;
	employee.hourlyRate=20;


	int wage=employee.calculateWage(10);
	System.out.println(wage);
		



	}


}