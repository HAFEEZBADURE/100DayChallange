package DSA_JAVA_DAY_4_Challange;

import java.util.Scanner;

public class BitwiseTwoNumberOr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.println("Showcasing bitwise operator");
		System.out.println("please enter first number");
		int first = input.nextInt();
		System.out.println("please enter second number");

		int second = input.nextInt();
		int result = first | second;
		System.out.println("result is: " + result);
	}

}
