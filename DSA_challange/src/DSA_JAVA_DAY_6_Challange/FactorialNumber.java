package DSA_JAVA_DAY_6_Challange;

import java.util.Scanner;

public class FactorialNumber {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to Factorial\n");
		System.out.println("Please enter your number");
		int num = input.nextInt();
		long fact = FactorialNumber(num);
		System.out.println("Factorial is : " + fact);
	}

	public static long FactorialNumber(int num) {

//		if (num < 2) {
//			return 1;
//		}
//
//		long fact = 1;
//		int i = 2;
//		while (i <= num) {
//
//			fact = fact * i;
//			System.out.println();
//			i++;
//		}
//		return fact;

//		using for loop;

		if (num < 2) {
			return 1;

		}

		long fact = 1;
		for (int i = 1; i <= num; i++) {
			fact = fact * i;
		}
		return fact;
	}
}
