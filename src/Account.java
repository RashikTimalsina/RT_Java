import java.util.Scanner;
import java.io.IOException;
import java.text.DecimalFormat;
class Account
{

	Scanner sc=new Scanner(System.in);

	DecimalFormat moneyFormat=new DecimalFormat(" 'Rs' ###,##0.00");	
	

	
	//Set the customer number

	public  int setCustomerNumber(int customerNumber)
	{

	this.customerNumber=customerNumber;


	//Get the customer number

	public int getCustomerNumber()
	{

	return customerNumber;
	
	}
	
	
	//Set the pin number
	
	public int setPinNumber(int pinNumber)
	{

	this.pinNumber=pinNumber;
	return pinNumber;
	

	
	//Get Checking Account Balance

	public double getCheckingBalance()
	{

	return CheckingBalance;


	//Get Saving Account Balance

	public double getSavingBalance()
	{

	return SavingBalance;
	
	}


	//Calculate Checking Account withdrawal

	public  double calcCheckingWithdrawal(double amount)
	{

	checkingBalance=checkingBalance-amount;
	return CheckingBalance;

	}
	
	
	//Calculate Saving Account withdrawal
	
	public double calcSavingWithdrawal(double amount)
	{
	
	savingBalance=savingBalance-amount;	
	return SavingBalance;

	}
	

	//Calculate Checking Account deposit

	public double calcCheckingDeposit(double amount)
	{

	checkingBalance=checkingBalance+amount;
	return CheckingBalance;

	}


	
	//Calculate SavingAccount deposit

	public double calcSavingDeposit(double amount)
	{

	savingBalance=savingBalance+amount;
	return SavingBalance;

	}

	
	//Customer Checking Account withdrawal input
	
	public void getCheckingWithdrawInput()
	{

	System.out.println("Checking Account Balance : " +moneyFormat.format(checkingBalance));
	System.out.println("Amount you want to withdraw from Checking Account : ");
	double amount =sc.nextDouble();
	
	if((checkingBalance-amount)>=0)
	{

	calcCheckingWithdraw(amount);
	System.out.println("New Checking Balance : " +moneyFormat.format(checkingBalance));
	
	}
	
	else
	{

	System.out.println("Balance cannot be negative");

	}	


	}

	//Customer Saving Account Withdraw Input
	
	public void getSavingWithdrawInput()
	{

	System.out.println("Saving account balance :" +moneyFormat.format(savingBalance));
	System.out.println("Amount you want to withdraw from Saving Account");
	double amount=sc.nextDouble();	
	
	if((savingBalance-amount)<=0)
	{

	calcSavingWithdraw(amount);
	System.out.println("New Saving Balance : " +savingBalance +"\n");

	}	

	else{
	
	System.out.println("Balance cannot be negative ");

	}

	private int customerNumber;
	private int pinNumber;
	private double checkingBalance=0;
	private double savingBalance=0;
	
	
	}
	
		
	}


	}

	
}

class OptionMenu extends Account
{


	Scanner msc=new Scanner(System.in);
	DecimalFormat moneyFormat=new DecimalFormat("'Rs' ###,##0.00");
	
	
	HashMap<Integer, Integer>data=new HashMap<Integer, Integer>();
	
	//Valid Login Info including customer number and pin number	
	
	public void getLogin() throws IOException
	{


	int x=1;	
	do{

	try{

	
	data.put(1234, 0000);
	data.put(12345, 1111);
	data.put(123456, 2222);
	data.put(1234567, 3333);

	System.out.println("Welcome to the ATM project ");
	
	System.out.println("Enter your customer number ");
	
	setCustomerNumber(msc.nextInt());
	
	System.out.println("Enter your pin number ");
	
	setPinNumber(msc.nextInt());
	
	}

	catch(Exception e)
	{

	System.out.println("Invalid Characters \n Only numbers !");
	x=2;
		
	}

	for(Entry<Integer, Integer>entry : data.entrySet())
	{

		if(entry.getKey()==getCustomerNumber()&&entry.getValue()==getPinNumber)
		getAccountType();

	}


	}
	
	System.out.println("Wrong customer number or pin number ");	

	}while(x==1);
	
	

	}
	
	

	public void getAccountType()
	{

	System.out.println("Select the account you want to access");
	System.out.println("Type 1 - Checking Account");
	System.out.println("Type 2 - Saving Account");
	System.out.println("Type 3 - Exit");
	System.out.println("Choice : ");

	
	selection =msc.nextInt();

	switch(selection)
	{

	case 1:
		getChecking();
		
	break;
		
	
	case 2:
		getSaving();
	
	break;

	case 3:
		System.out.println("Thank you for using ATM ");
	
	break;
	
	default:
	
	System.out.println("Invalid choice ");
	getAccountType();
		
	}


	}	

	INCOMPLETE.....(Piece of Shit)
	
	