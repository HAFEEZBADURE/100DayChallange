package DSA_JAVA_DAY_1_3_UserInput;

import java.util.Scanner;

public class challange2 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("enter to our calculator");
		System.out.println("enter a num 1");
		int num1 = input.nextInt();
		System.out.println("enter a num 2");
		int num2 = input.nextInt();
		int result = num1 + num2;
		System.out.println("The sum of the balue is " + result);
	}
}
