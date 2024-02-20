package DSA_JAVA_DAY_2_1_challange;

import java.util.Scanner;

public class calculateProductFloatingNumber {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter Flaoting numbers");
		System.out.println("enter number 1");
		double num1 = input.nextDouble();

		System.out.println("enter number 2");
		double num2 = input.nextDouble();

		// Calculate the product of the two numbers
		double product = num1 * num2;
		System.out.println("The product of " + num1 + " and " + num2 + " is: " + product);

	}
}
