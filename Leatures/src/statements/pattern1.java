package statements;

public class pattern1 {
	public static void main(String[] args) {
		normal();

	}

	public static void normal() {
		int row = 0;
		while (row < 5) {
			System.out.print("*");
			int i = 0;
			while (i < row) {
				System.out.print(" *");
				i++;
			}
			System.out.println();
			row++;
		}
	}
}