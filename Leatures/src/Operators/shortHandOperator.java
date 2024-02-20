package Operators;

import java.util.Scanner;

public class shortHandOperator {
	public static void main(String[] args) {
		int a = 5;
		System.out.println("Enter a value");
		Scanner input = new Scanner(System.in);
		int x1 = input.nextInt();
		a = a + x1;
		a += x1;
		System.out.println(a);
		int x2 = input.nextInt();
		a = a + x2;
		a += x2;
		System.out.println(a);
		int x3 = input.nextInt();
		a = a + x3;
		a += x3;
		System.out.println(a);
		int x4 = input.nextInt();
		a = a + x4;
		a += x4;
		System.out.println(a);

		System.out.println("-----------------------");

		int c = input.nextInt();
		c -= x1;
		System.out.println(c);
		int d = input.nextInt();
		d *= x2;
		System.out.println(d);
		int e = input.nextInt();
		e %= x3;
		System.out.println(e);
		int f = input.nextInt();
		f /= x4;
		System.out.println(f);
	}
}
