package DSA_JAVA_DAY_2_1_challange;

import java.util.Scanner;

public class convertFahrenheittoCelsius {
	public static void main(String[] args) {

		 // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the temperature in Fahrenheit
        System.out.print("Enter the temperature in Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();

        // Close the Scanner to avoid resource leaks
        scanner.close();

        // Convert Fahrenheit to Celsius
        double celsius = (fahrenheit - 32) * 5 / 9;

        // Display the result
        System.out.println("The temperature in Celsius is: " + celsius);	
	}
}