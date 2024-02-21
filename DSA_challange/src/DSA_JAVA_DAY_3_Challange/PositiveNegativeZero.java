package DSA_JAVA_DAY_3_Challange;
//15.Create a program that determines if a number is positive, negative,

//or zero.


import java.util.Scanner;

public class PositiveNegativeZero {

	public static void main(String[] args) {

		System.out.println("enter a number");
		Scanner input = new Scanner(System.in);

		int num = input.nextInt();
//		if (num > 1) {
//			System.out.println("This number is Postive: ");
//		} else if (num < (-0)) {
//			System.out.println("This number is negative: ");
//		} else {
//			System.out.println("this number is zero");
//		}
		
		// or 

		if (num > 0) {
			System.out.println("This number is Postive: ");

		} else if (num == 0) {
			System.out.println("This number is zero: ");
		} else {
			System.out.println("this number is negative");
		}
	}

}
