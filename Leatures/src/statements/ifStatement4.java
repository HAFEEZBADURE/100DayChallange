package statements;

public class ifStatement4 {

	public static void main(String[] args) {

		// ladder if statments

		boolean isSunny = false;
		boolean IsRainny = false;
		boolean isWinterDay = false;
		if (isSunny) {
			System.out.println("It's a sunny day!");
		} else if (IsRainny) {
			System.out.println("It's a Rainy day!");
		} else {
			if (isWinterDay) {
				System.out.println("It's a winter day!");
			}else {
			System.out.println("It's a normal day!");
		}
		}

	}

}
