//20.Create a program that categorize a person into different age groups
//Child -> below 13 Teen -> below 20
//Adult -> below 60 Senior-> above 60



package DSA_JAVA_DAY_3_Challange;

import java.util.Scanner;

public class different_age_groups {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("calculates ages groups ");

		System.out.println("Enter a ages");

		int age = input.nextInt();

		if (age < 13) {
			System.out.println("Child -> below 13 ");
		} else if (age < 20) {
			System.out.println("Teen -> below 20");
		} else if (age < 60) {
			System.out.println("Adult -> below 60 ");
		} else {
			System.out.println("Senior-> above 60");
		}


	}
}
