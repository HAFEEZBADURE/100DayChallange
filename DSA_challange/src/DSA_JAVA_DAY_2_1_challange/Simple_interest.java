package DSA_JAVA_DAY_2_1_challange;

import java.util.Scanner;

public class Simple_interest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Prompt the user to enter the principal amount
		System.out.print("Enter the principal amount (P): ");
		double principal = scanner.nextDouble();

		// Prompt the user to enter the time (in years)
		System.out.print("Enter the time (in years) (T): ");
		double time = scanner.nextDouble();

		// Prompt the user to enter the rate of interest
		System.out.print("Enter the rate of interest (R): ");
		double rate = scanner.nextDouble();

		// Close the Scanner to avoid resource leaks
		scanner.close();

		// Calculate the simple interest
		double simpleInterest = (principal * time * rate) / 100;

		// Display the result
		System.out.println("The simple interest is: " + simpleInterest);
	}
}
