import java.util.Scanner;

class CurrencyConverter {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter amount in USD: ");
		int usdAmount = sc.nextInt();

		System.out.println("Enter exchange rate: ");
		double exchangeRate = sc.nextDouble();

		// Validate input
		if (exchangeRate <= 0) {
			System.out.println("Invalid exchange rate! Please enter a positive number.");
		} else {
			double convertedAmount = usdAmount * exchangeRate;

			// Formatting the output to two decimal places
			System.out.printf("Amount after conversion is: %.2f\n", convertedAmount);
		}

		sc.close(); // Close the scanner to avoid resource leaks
	}
}
