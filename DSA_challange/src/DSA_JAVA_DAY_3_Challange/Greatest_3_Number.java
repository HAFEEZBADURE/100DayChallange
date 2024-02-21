package DSA_JAVA_DAY_3_Challange;

//17. Create a program that determines the greatest of the three numbers.

import java.util.Scanner;

public class Greatest_3_Number {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("welcome to the world of three ! ");

		System.out.println("Please enter you're First number");

		int first = input.nextInt();
		System.out.println("Now Enter yoour second number");
		int second = input.nextInt();
		System.out.println("Now Enter yoour third number");
		int third = input.nextInt();

//		if (first >= second && first >= third) {
//			System.out.println("You're first number is greatest : " + first);
//		} else if (second >= first && second >= third) {
//			System.out.println("You're  second number is greatest : " + second);
//		} else if (third >= first && third >= second) {
//			System.out.println("You're third number is Greatest  : " + third);
//		}

		// otherway coding

		if (first >= second && first >= third) {
			System.out.println("You're first number is greatest : " + first);
		} else if (second >= third) {
			System.out.println("You're  second number is greatest : " + second);
		} else {
			System.out.println("You're third number is Greatest  : " + third);
		}
	}
}
