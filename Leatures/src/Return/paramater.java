package Return;

public class paramater {
	public static void main(String[] args) {

//		int num = sumTwoNumber(1, 2);

		System.out.println(sumTwoNumber(1, 2));
	}

	public static int sumTwoNumber(int first, int second) {

		System.out.println("First number is received "+first);

		System.out.println("Second number is received "+second);
		int sum = first + second;

		return sum;
	}
}
