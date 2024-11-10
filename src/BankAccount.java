import java.util.Scanner;
class BankAccount
{

	private long accountNumber;
	private double balance;
	

	public BankAccount(long accountNumber, double balance)
	{

	this.accountNumber=accountNumber;
	this.balance=balance;

	
	}


	public void deposit(double amount)
	{

	//balance =balance+amount;		Can write any of them as both means same
	balance+=amount;	

	}


	public void withdraw(double amount)
	{

	if(balance>=amount)
	{
	
	balance-=amount;

	}
	else{

	System.out.println("Insufficient Funds");
	
	}
	
}

	public static void main(String[] args)
	{

	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter your account number");
	 long accountNumber=sc.nextLong();
	
	System.out.println("Enter initial balance");
	 double balance=sc.nextDouble();
	
	BankAccount account=new BankAccount(accountNumber,balance);
	System.out.println("Account created Successfully");
	System.out.println("Account Number :" +account.getAccountNumber());
	System.out.println("Balance is " +account.getBalance());

	account.deposit(500);
	account.withdraw(100);


	System.out.println("Updated balance is "+account.getBalance());	

	}	

	public long getAccountNumber()
	{

	return accountNumber;


	}

	
	public double getBalance()
	{

	return balance;

	}
	
	
	
	
	
	}




