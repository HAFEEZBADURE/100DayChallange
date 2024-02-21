package DSA_JAVA_DAY_3_Challange;

//19.Create a program that calculates grades based on marks
//A -> above 90% B -> above 75%
//C -> above 60% D -> above 30%
//F -> below 30%

import java.util.Scanner;

public class Grade_marks {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("calculates grades based on marks ");

		System.out.println("Enter a marks");

		int mark = input.nextInt();

		if (mark > 90) {
			System.out.println("A -> above 90% ");
		} else if (mark > 75 && mark < 90) {
			System.out.println("B -> above 75%");
		} else if (mark > 60 && mark < 75) {
			System.out.println("C -> above 60% ");
		} else if (mark > 30 && mark < 60) {
			System.out.println("D -> above 30%");
		} else {
			System.out.println("F -> below 30%");
		}
	}
}
