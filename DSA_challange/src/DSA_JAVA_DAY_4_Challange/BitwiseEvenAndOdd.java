package DSA_JAVA_DAY_4_Challange;

import java.util.Scanner;

public class BitwiseEvenAndOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.println("Showcasing bitwise operator");
		System.out.println("please enter first number");
		int n = input.nextInt();

		if ((n & 1) == 1) {
			System.out.println("odd");
		} else {
			System.out.println("even");
		}
	}

}
