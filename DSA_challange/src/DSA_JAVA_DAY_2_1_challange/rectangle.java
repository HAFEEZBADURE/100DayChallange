package DSA_JAVA_DAY_2_1_challange;

import java.util.Scanner;

public class rectangle {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the length of the rectangle: ");
		double length = input.nextDouble();

		System.out.print("Enter the width of the rectangle: ");
		double width = input.nextDouble();

		// Calculate the perimeter of the rectangle
		double perimeter = 2 * (length + width);
		// Display the result
		System.out.println("The perimeter of the rectangle is: " + perimeter);

	}
}
