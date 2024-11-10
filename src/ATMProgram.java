import java.util.Scanner;

class ATMProgram // create ATMExample class to implement the ATM functionality
{

	public static void main(String[] args) {

		int balance = 100000; // declare and initialize balance, withdraw, and deposit
		int withdraw, deposit;

		Scanner sc = new Scanner(System.in); // create scanner class object to get choice of user

		while (true) {

			System.out.println("Automated Teller Machine");
			System.out.println("Choose 1 for Withdraw");
			System.out.println("Choose 2 for Deposit");
			System.out.println("Choose 3 for Check Balance");
			System.out.println("Choose 4 for EXIT");
			System.out.print("Choose the operation you want to perform:");

			int choice = sc.nextInt(); // get choice from user

			switch (choice) {

				case 1:

					System.out.print("Enter amount to be withdrawn:");

					withdraw = sc.nextInt(); // get the withdrawl money from user

					if (balance >= withdraw) // check whether the balance is greater than or equal to the withdrawal
												// amount
					{

						balance = balance - withdraw; // remove the withdrawl amount from the total balance

						System.out.println("Please collect your money");

					} else {

						System.out.println("Insufficient Balance"); // show custom error message

					}

					System.out.println("");

					break;

				case 2:

					System.out.print("Enter amount to be deposited:");

					deposit = sc.nextInt(); // get deposit amount from the user

					balance = balance + deposit; // add the deposit amount to the total balanace

					System.out.println("Your Money has been successfully deposited");

					System.out.println("");

					break;

				case 3:

					System.out.println("Balance : " + balance); // displaying the total balance of the user

					System.out.println("");

					break;

				case 4:

					System.exit(0); // exit from the menu

			}

		}

	}

}