package statements;

public class ifStatement2 {

	public static void main(String[] args) {

		boolean isSeniorCitizen = false;
		boolean isAdult = false;

		if (isSeniorCitizen) {
			System.out.println("Hello Senior Citizen members");
		} else {
			if (isAdult) {
				System.out.println("Hello adult members");
			} else {
				System.out.println("Hello child members");
			}
		}
	}

}
