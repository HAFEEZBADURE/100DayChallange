package DSA_JAVA_DAY_6_Challange;

import java.util.Scanner;

public class muliplecation_table {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to multiplication Table\n");
		System.out.println("Please enter your number");
		int num = input.nextInt();
		PrintMultiplicationTable(num);

	}

	public static void PrintMultiplicationTable(int num) {

//		int i = 1;
//		while (i <= 10) {
//			System.out.println(num + " X " + i + " = " + (num * i));
//			i++;
//		}
//		
		for (int i = 1; i <= 10; i++) {
			System.out.println(num + " X " + i + " = " + (num * i));

		}

	}
}
