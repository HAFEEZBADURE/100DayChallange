package DSA_JAVA_DAY_3_Challange;

//16.Create a program that determines if a number is odd or even.
import java.util.Scanner;

public class Odd_Even {
	public static void main(String[] args) {

		System.out.println("enter a number even or odd");
		Scanner input = new Scanner(System.in);

		int n = input.nextInt();
		if (n%2==0) {
			System.out.println("even number");
		} else {
			System.out.println("odd number");
		}

	}
}
