import java.lang.*;

	/*
	
	If you want to represent any object as a string, toString() method comes into existence.
	The toString() method returns the String representation of the object.
	If you print any object, Java compiler internally invokes the toString() method on the object. 
	So overriding the toString() method, returns the desired output, it can be the state of an object etc. depending on your 	implementation.	

EXAMPLE:

class Student
{  
 	
	int rollno;  
	 String name;  
 	String city;  
  
 	
	public Student(int rollno, String name, String city)
	{  
 
	this.rollno=rollno;  
	 this.name=name;  
 	this.city=city;  

	 }  
  
 

	public static void main(String args[])
	{  
   
	Student s1=new Student(101,"Raj","lucknow");  
  	 Student s2=new Student(102,"Vijay","ghaziabad");  
     
  	 System.out.println(s1);		//compiler writes here s1.toString()  
  	 System.out.println(s2);		//compiler writes here s2.toString()  
 

	}  Displays output as Student@1fee6fc  Student@1eed786 under hashocode so to get Stringvalues we use toString() method  

	*/



//EXAMPLE of toString()

class StudentToString
{  

	 int rollno;  
	 String name;  
 	String city;  
  
 
	public StudentToString(int rollno, String name, String city)
	{  
 
	this.rollno=rollno;  
 	this.name=name;  
 	this.city=city;  
 
	}  

	
	 public String toString()
	{

	  return rollno+" "+name+" "+city;  		//overriding the toString() method  
 
	}
  
 
	public static void main(String args[])
	{  
   
	StudentToString s1=new StudentToString(101,"Raj","Ktm");  
   
	StudentToString s2=new StudentToString(102,"Bishal","Bhktpr");  
     
   
	System.out.println(s1);	//compiler writes here s1.toString()  
   	System.out.println(s2);	//compiler writes here s2.toString()  
 
	
	}  

	
}  


