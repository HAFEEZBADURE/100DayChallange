package LogicalOperator;

import java.util.Scanner;

public class LogicalOperator1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("welcome to Ticket Discount calculator");
		System.out.println("please enter you age: ");

		int age = input.nextInt();
		System.out.println("Are you a female ? (true or false): ");

		boolean isFemale = input.nextBoolean();

		if (age < 5) {
			System.out.println("you're got 75% Discount ");
		} else if (isFemale) {
			System.out.println(" You Got 50% Discount: ");
		} else if (age > 60 && !isFemale) {
			System.out.println("ypu got 25% Discount ");
		} else {
			System.out.println(" you got no Discount");
		}
	}

}
