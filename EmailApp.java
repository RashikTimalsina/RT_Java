
import java.util.Scanner;
class Email
{

	private String firstName;
	private String lastName;
	private String password;
	private int defaultPasswordLength=10;
	private String department;
	private int mailBoxCapacity=500;
	private String email;
	private String companySuffix="aeycompany.com";
	private String alternateEmail; 
	

	//Constructor to receive the firstName and lastName

	public Email(String firstName, String lastName)
	{
	
	this.firstName=firstName;
	this.lastName=lastName;

	//System.out.println("EMAIL CREATED : " +this.firstName +" " +this.lastName);
	



	//Call a method asking for the department return the department
	
	this.department=setDepartment();		//asking private Department to pass out with the method setDepartment()
	
	System.out.println("Department : " +this.department);
		
	System.out.println();

	

	//Call a method that returns random password
	
	this.password=randomPassword(defaultPasswordLength);
	
	//System.out.println("Your password  : " +this.password);
	

	
	//Combine the elements to generate email
	
	
	email=firstName.toLowerCase() + lastName.toLowerCase() +"@" +department +"." +companySuffix; 
	
	System.out.println("Your email is : " +email);
	
	System.out.println();

	}


	
	

	//Ask for the department

	private String setDepartment()
	{

	System.out.print("Department Codes \n1 for Sales \n2 for Developing \n3 for Accounting \n0 for none \n Enter department code: ");
	
	Scanner sc=new Scanner(System.in);
	int depChoice =sc.nextInt();
		
	if(depChoice==1){

	return "sales";
	
	}
	
	else if(depChoice==2)
	{

	return "develop";
	

	}

	else if(depChoice ==3)
	{
	
	return "accounting";

	}
	
	
	else
	{

	return " ";			//this will return nothing	


	}	
	
	}


	
	//Generate a random password
	
	public String randomPassword(int length)
	{

	String passwordSet="ABCDEFGHIJKLMNOPQRSTUVWXYZ@!$#%";
	char[] password=new char[length];

	for(int i=0;i<length;i++)
	{
		
	int rand =(int) (Math.random() * passwordSet.length());
	password[i]=passwordSet.charAt(rand);

	}

	
	return new String(password);

	}


	//Set the mailbox capacity
	
	public void setMailBoxCapacity(int capacity)
	{
	
	this.mailBoxCapacity=capacity;

	
	}



	//Set the alternative email
	
	public void setAlternateEmail(String altemail)
	{

	this.alternateEmail=altemail;
	
	
	}

	
	//Change the password
		
	public void changePassword(String password)
	{

	this.password=password;
	
	
	}


	public int getMailBoxCapacity() 
	{

	return mailBoxCapacity; 
	
	}	


	public String getAlternateEmail()
	{

	return alternateEmail;	

	}

	public String getPassword()
	{

	return password;
	
	}

	
	public String showInfo()
	{

	return "DISPLAY NAME : " + firstName +" " +lastName +" " +
		"\nCOMPANY EMAIL : " +email + " " +
			"\nMAILBOX CAPACITY : " +mailBoxCapacity +"mb";
 	

	}
	
	
}

class EmailApp
{

	public static void main(String[] args)
	{

	Email em1=new Email("Rashik","Timalsina");
	
	em1.setAlternateEmail("abc@gmail.com");
	
	System.out.println("Your alternate email : " +em1.getAlternateEmail());
	
	System.out.println();

	System.out.println(em1.showInfo());


	}



}

