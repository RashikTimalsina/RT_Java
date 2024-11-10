import java.lang.*;
class ProceduralProgrammingExample
{


	public static int calculateWage(int baseSalary, int extraHours, int hourlyRate )	{
	
	return baseSalary + (extraHours*hourlyRate);

	
	}


	public static void main(String[] args)	{
		
	int baseSalary=50000;
	int extraHours=8;
	int hourlyRate=10;

	
	int wage=calculateWage(baseSalary, extraHours, hourlyRate);			
	System.out.println(wage);
	
	}

	

	


}