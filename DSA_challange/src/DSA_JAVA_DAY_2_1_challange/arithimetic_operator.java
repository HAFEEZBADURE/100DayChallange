package DSA_JAVA_DAY_2_1_challange;

import java.util.Scanner;

public class arithimetic_operator {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter two numbers");

		System.out.println("enter number 1");
		int num1 = input.nextInt();

		System.out.println("enter number 2");
		int num2 = input.nextInt();

		System.out.println("addition value " + (num1 + num2));
		System.out.println("Subtraction " + (num1 - num2));
		System.out.println("Multiplication " + (num1 * num2));
		System.out.println("Division " + (num1 / num2));
		System.out.println("Modulus " + (num1 % num2));
	}
}
