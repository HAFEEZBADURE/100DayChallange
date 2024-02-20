package DSA_JAVA_DAY_2_1_challange;

import java.util.Scanner;

public class userInputSwap {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("before swapping numbers");
		int numberr1 = input.nextInt();
		int number2 = input.nextInt();

		System.out.println(numberr1 + " " + number2);

		System.out.println("after swapping numbers");
		int a = input.nextInt();
		int b = input.nextInt();
		int c = a;
		a = b;
		b = c;

		System.out.println(a + " " + b);
	}
}
