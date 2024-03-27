package DSA_JAVA_DAY_6_Challange;

import java.util.Scanner;

public class LCM_Two_Number {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("welcome to LCM");
		System.out.println("Please enter your number : ");
		int first = input.nextInt();

		System.out.println(" Please enter your numberr");
		int second = input.nextInt();

		int lcm = lcm(first, second);
		System.out.println(lcm);
	}

	public static int lcm(int first, int second) {
		int i = 1;
		while (true) {
			int factor = first * i;
			if (factor % second == 0) {
				return factor;
			}
			i++;
		}
		
	}
}
