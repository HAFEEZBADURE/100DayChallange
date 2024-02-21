package DSA_JAVA_DAY_3_Challange;

//
//18.Create a program that determines if a given year is a leap year
//(considering conditions like divisible by 4 but not 100, unless also
//divisible by 400).
import java.util.Scanner;

public class leapYear {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("welcome to the Leap year! ");

		int year = input.nextInt();
		// Check if the year is divisible by 4

		if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)){
			  System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
	}
}
