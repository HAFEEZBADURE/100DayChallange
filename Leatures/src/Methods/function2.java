package Methods;

public class function2 {

	public static void main(String[] args) {

		System.out.println("Calling below methods names");
//		rightHalfPattern();
//		pattern1();
		Normal();

	}

	public static void pattern1() {
		System.out.println("          *");
		System.out.println("        * *");
		System.out.println("      * * *");
		System.out.println("  * * * * *");
		System.out.println("* * * * * *");
	}

	public static void rightHalfPattern() {
		System.out.println("* * * * * *");
		System.out.println("* * * *");
		System.out.println("* * *");
		System.out.println("* *");
		System.out.println("*");
	}

	public static void Normal() {
//		System.out.println("*");
//		System.out.println("* *");
//		System.out.println("* * *");
//		System.out.println("* * * *");
//		System.out.println("* * * * * *");
//		

		int n = 0;
		while (n < 5) {
			System.out.print("*");
			int i=0;
			while(i<n) {
				System.out.print(" *");
				i++;
			}
			System.out.println();
			n++;
		}
	

	}
}
