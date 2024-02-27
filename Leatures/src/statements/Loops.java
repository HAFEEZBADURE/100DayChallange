package statements;

import java.util.Scanner;

public class Loops {
	public static void main(String[] args) {
//		int num = 1; // initialtion
//		while (num <= 10) { // condition
//			System.out.println(num); // actual work
//			num = num + 1; // updating the condition
//		}

//		int count = 500;
//
//		while (count >= 200) {
//			System.out.println(count);
//			count = count - 1;
//		}

		Scanner input = new Scanner(System.in);
		System.out.println("Enter your number");

		int i = 0;
		while (i < 5) {
			int inp = input.nextInt();
			System.out.println("Number is "+i);
			i = i + 1;
		}

	}
}


