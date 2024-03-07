package Return;

import java.util.Scanner;

public class Return {

	public static void main(String[] args) {

		Greet();
		int first = ReadNumber();
		int second = ReadNumber();

		int sum = first + second;
		System.out.println("Sum of the number is : " + sum);
	}

	public static int ReadNumber() {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter number");
		int number = input.nextInt();
		return number;

	}

	public static void Greet() {
		System.out.println("Welcome to calculator");
	}
}
