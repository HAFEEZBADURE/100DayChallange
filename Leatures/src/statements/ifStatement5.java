package statements;

import java.util.Scanner;

public class ifStatement5 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("welcome to drivering school");

		System.out.println("Please enter the age");

		int age = input.nextInt();
		if (age >= 18) {
			System.out.println("you're eligible");
		} else {
			System.out.println("you're not eligible");
		}
	}
}
