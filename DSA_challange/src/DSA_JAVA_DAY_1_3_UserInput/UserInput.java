package DSA_JAVA_DAY_1_3_UserInput;

import java.util.Scanner;

public class UserInput {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Please enter Your name");

		String name = input.nextLine();

		System.out.println("Enter a integer value");
		int value = input.nextInt();

		System.out.println("Enter a double value");
		double MyDouble = input.nextDouble();

		System.out.println("Enter a float value");
		Float myFloat = input.nextFloat();

		System.out.println("Enter a Long value");
		Long myLong = input.nextLong();

		System.out.println("Enter a short value");
		Short myShort = input.nextShort();

		System.out.println("Good morning " + name + " name and value is " + value + " " + MyDouble);
		System.out.println("My Long value is " + myLong + " Float value is " + myFloat + " short value is " + myShort);

	}
}
