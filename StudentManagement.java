import java.util.ArrayList;
import java.util.Scanner;
class Student
{

	private String name;
	private int rollnumber;
	private double gpa;
	
	public Student(String name, int rollnumber, double gpa)
	{

	this.name=name;
	this.rollnumber=rollnumber;
	this.gpa=gpa;
	

	public String getName()
	{

	return name;

	}

	public int getRollNumber()
	{

	return rollnumber;

	}
	
	public double getGpa()
	{
	
	return gpa;

	}

	public String toString()
	{

	return "Name : " +name + "Rollnumber : " +rollnumber +"GPA : " +gpa;

	}

	
	}
	

}

class StudentManagement
{
	
	public static void main(String[] args)
	{

	ArrayList<Student> std=new ArrayList<>();

	Scanner sc=new Scanner(System.in);
	
	System.out.println("Student Record Management System");	
	
	while(true)
	{

	
	System.out.println("1: Add Student ");
	System.out.println("2: Display Student ");
	System.out.println("3: Exit ");
	System.out.println("Enter your choice: "):

	int choice=sc.nextInt();

	if(choice==1)
	{

	System.out.println("Enter student name :");
	String name=sc.nextLine();

	System.out.println("Enter student rollnumber: ");
	int rollnumber=sc.nextInt();

	System.out.println("Enter student gpa :");
	double gpa=sc.nextDouble();	
	
	
	INCOMPLETE......
		
	}
					

	}

	}
	


}