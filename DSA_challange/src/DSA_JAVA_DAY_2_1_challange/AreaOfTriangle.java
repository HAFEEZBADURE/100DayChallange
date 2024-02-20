package DSA_JAVA_DAY_2_1_challange;

import java.util.Scanner;

public class AreaOfTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the AreaOfTriangle : ");
		double base = input.nextDouble();

		System.out.print("Enter the AreaOfTriangle : ");
		double Height = input.nextDouble();

		double AreaOfTriangle = 1 / 2 * (base + Height);
		double area = 0.5 * base * Height;
		System.out.println("The area of the triangle is: " + AreaOfTriangle);
		// Display the result
		System.out.println("The area of the triangle is: " + area);

	}

}
