package DSA_JAVA_DAY_6_Challange;

import java.util.Scanner;

public class sum_Of_the_digit_number {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to sum_Of_the_digit_number\n");
		System.out.println("Please enter your number");
		int num = input.nextInt();
		int sum = sum_Of_the_digit_number(num);
		System.out.println("sum_Of_the_digit_number " + sum);

	}

	public static int sum_Of_the_digit_number(int num) {

		int sum = 0;
		while (num > 0) {
			sum = sum + (num % 10);
			num = num / 10;
		}
		return sum;
	}
}
