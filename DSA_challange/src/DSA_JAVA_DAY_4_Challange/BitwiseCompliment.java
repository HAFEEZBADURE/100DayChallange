package DSA_JAVA_DAY_4_Challange;

import java.util.Scanner;

public class BitwiseCompliment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.println("Showcasing bitwise operator");
		System.out.println("please enter your number");
		int first = input.nextInt();
		int result = ~first;
		
	
		System.out.println("result is first: "+result);
		
	}

}
