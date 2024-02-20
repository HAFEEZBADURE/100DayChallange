package DSA_JAVA_DAY_2_1_challange;

import java.util.Scanner;

public class Compound_interest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the principal amount (P): ");
		double principal = scanner.nextDouble();

		System.out.print("Enter the time (in years) (T): ");
		double time = scanner.nextDouble();

		System.out.print("Enter the rate of interest (R): ");
		double rate = scanner.nextDouble();

		scanner.close();

		double compoundInterest = principal * Math.pow((1 + rate / 100), time) - principal;


		 // Display the result
        System.out.println("The compound interest is: " + compoundInterest);

	}

}
