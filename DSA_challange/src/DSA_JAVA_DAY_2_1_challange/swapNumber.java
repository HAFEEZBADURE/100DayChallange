package DSA_JAVA_DAY_2_1_challange;

public class swapNumber {
	public static void main(String[] args) {

		int number1 = 5;
		int number2 = 10;

		System.out.println(" Before swapping :");
		System.out.println("Number 1: " + number1);
		System.out.println("Number 2: " + number2);

//		swap the number using temp variable
		int temp = number1;
		number1 = number2;
		number2 = temp;

		System.out.println("\nAfter swapping:");
		System.out.println("Number 1: " + number1);
		System.out.println("Number 2: " + number2);

	}
}
