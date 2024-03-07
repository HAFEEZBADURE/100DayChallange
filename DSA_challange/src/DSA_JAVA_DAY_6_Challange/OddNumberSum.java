package DSA_JAVA_DAY_6_Challange;

import java.util.Scanner;

public class OddNumberSum {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to OddSum\n");
		System.out.println("Please enter your number");

		int num = input.nextInt();
		int sum = OddNumberSum1(num);
		System.out.println("oddSumm til " + num + " is : " + sum);

	}

	public static int OddNumberSum1(int num) {

//		int sum = 0;
//		int i = 1;
//		while (i <= num) {
//			sum = sum + i;
//			i += 2;
//		}
//		return sum;

		int sum = 0;
		for (int i = 1; i <= num; i += 2) {
			sum = sum + i;
		}

		return sum;
	}
}
