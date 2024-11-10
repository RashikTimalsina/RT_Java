import java.util.Scanner;

class CalculatorScanner {
	public static void main(String[] args) {
		int a, b, result = 0;
		int choice;

		Scanner sc = new Scanner(System.in);

		System.out.println("Choose an operation:");
		System.out.println("1 for Addition");
		System.out.println("2 for Subtraction");
		System.out.println("3 for Multiplication");
		System.out.println("4 for Division");
		System.out.println("5 for Modulo");
		choice = sc.nextInt(); // Get user's choice

		System.out.println("Enter the value of a: ");
		a = sc.nextInt();

		System.out.println("Enter the value of b: ");
		b = sc.nextInt();

		switch (choice) {
			case 1:
				result = a + b;
				System.out.println("The sum is: " + result);
				break;
			case 2:
				result = a - b;
				System.out.println("The difference is: " + result);
				break;
			case 3:
				result = a * b;
				System.out.println("The product is: " + result);
				break;
			case 4:
				if (b != 0) {
					result = a / b;
					System.out.println("The quotient is: " + result);
				} else {
					System.out.println("Division by zero is not allowed!");
				}
				break;
			case 5:
				if (b != 0) {
					result = a % b;
					System.out.println("The remainder is: " + result);
				} else {
					System.out.println("Modulo by zero is not allowed!");
				}
				break;
			default:
				System.out.println("Invalid choice!");
		}

		sc.close(); // Close the scanner
	}
}
