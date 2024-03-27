package DSA_JAVA_DAY_6_Challange;

import java.util.Scanner;

public class GCD {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("welcome to LCM");
		System.out.println("Please enter your number : ");
		int first = input.nextInt();

		System.out.println(" Please enter your numberr");
		int second = input.nextInt();

		int gcd = GCD(first, second);
		System.out.println("GCD of the number is: " + gcd);
	}

	public static int GCD(int num1, int num2) {

		int gcd = 1;

		int i = 2;
		
		int least=least(num1, num2);

		return gcd;
	}

	public static int least(int num1, int num2) {
		if (num1 < num2) {
			return num1;
		} else {
			return num2;
		}
	}
}
