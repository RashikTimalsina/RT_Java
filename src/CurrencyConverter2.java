import java.util.Scanner;

class CurrencyConverter2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter amount in Nepali rupees:");
		int nrsAmount = sc.nextInt();

		System.out.println("Enter exchange rate ");
		double exchangeRate = sc.nextDouble();

		double convertedAmount = nrsAmount * exchangeRate;

		System.out.println("Amount after conversion is : " + convertedAmount);


		sc.close();
	}

}